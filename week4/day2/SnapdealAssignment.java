package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealAssignment {

public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);

	//Launch https://www.snapdeal.com/
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Go to Mens Fashion
	WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));

	//Create an object for Actions
	Actions builder = new Actions(driver);
	//hover and Go to Sports Shoes
	builder.moveToElement(mens).perform();
	WebElement sportsShoes = driver.findElement(By.xpath("//span[text()=\"Sports Shoes\"]"));
	builder.moveToElement(sportsShoes).click().perform();

	//Get the count of the sports shoes
	String countOfShoes = driver.findElement(By.xpath("//h1[contains(text(),'Sports Shoes for Men')]/following-sibling::span")).getText();
	System.out.println(countOfShoes);
	Thread.sleep(500);

	//Click Training shoes
	driver.findElement(By.xpath("//div[text()=\"Training Shoes\"]")).click();
	Thread.sleep(500);
	
	//Sort by Low to High
	driver.findElement(By.xpath("//i[@class=\"sd-icon sd-icon-expand-arrow sort-arrow\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[@class='search-li']")).click();
	Thread.sleep(500);
	Thread.sleep(5000);
	//Check if the items displayed are sorted correctly
	List<WebElement> sortList = driver.findElements(By.xpath("//div[@class='lfloat marR10']/span/following-sibling::span"));
	
	System.out.println(sortList.size());
	for(int i=0; i<sortList.size();i++)
	{
		String mrp = sortList.get(i).getText();
		System.out.println(mrp);
	}

	//Select the price range (900-1200)
	driver.findElement(By.name("fromVal")).clear();
	driver.findElement(By.name("fromVal")).sendKeys("500");
	driver.findElement(By.name("toVal")).clear();
	driver.findElement(By.name("toVal")).sendKeys("1200");
	driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();

	//Filter with color Navy
	//driver.findElement(By.xpath("//div[@class='filter-content ']/div/following-sibling::button")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();

	//verify the all applied filters 
	Thread.sleep(5000);
	//List<WebElement> filters = driver.findElements(By.xpath("//div[@class='filters']/div[@class='navFiltersPill']"));
	List<WebElement> filters = driver.findElements(By.xpath("(//div[@class='filters'])[1]/div/a"));
	System.out.println(filters.size());
	for(int i=1;i<filters.size();i++)
	{
		String text = filters.get(i).getText();
		System.out.println(text);
		if(text.contains("Price: "))
		{
			System.out.println("Price filter is applied");
			continue;
		}
		else if (text.contains("Color: "))
		{
			System.out.println("Color filter is applied");
			continue;
		} 
		
		//get the parent handle
		String parent = driver.getWindowHandle();
		
	//Mouse Hover on first resulting Training shoes
		WebElement image = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		builder.moveToElement(image).perform();
		WebElement quick = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
        builder.moveToElement(quick).click().perform();
        
        // Print the cost and the discount percentage
       Set<String> windowHandles = driver.getWindowHandles();
       List<String> list = new ArrayList<String>(windowHandles);
        driver.switchTo().window(list.get(0));
        Thread.sleep(1000);
        String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        System.out.println("The Price of the shoe is: "+price);
        String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
        System.out.println("The discount percentage is: "+discount);
        
        //Take the snapshot of the shoes.
        File src= driver.getScreenshotAs(OutputType.FILE);
        File destination = new File("./shoe.png");
        FileUtils.copyFile(src, destination);
        
        //close the browser
        // driver.close();

	}


}


}


