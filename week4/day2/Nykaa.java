package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
	/* do the chromesetup and then disable all the 
	 * notifications
	 */
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	/* passing options into the constructor of 
	 * chrome driver to understand our preference
	 */
	ChromeDriver driver = new ChromeDriver(options);
	// load the webpage
	driver.get("https://www.nykaa.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	//Mouseover on Brands and Search L'Oreal Paris
	WebElement brands = driver.findElement(By.xpath("//a[text()=\"brands\"]"));
	
	//Create obj for Actions
	Actions builder = new Actions(driver);
	builder.moveToElement(brands).perform();
	driver.findElement(By.xpath("//div[@class=\"css-ov2o3v\"]/a[text()=\"L'Oreal Paris\"]")).click();
	System.out.println(driver.getTitle());
	Thread.sleep(1000);
	
	//Click sort By and select customer top rated
	driver.findElement(By.xpath("//button[@class=' css-n0ptfk']")).click();
	WebElement customer = driver.findElement(By.xpath("//span[text()='customer top rated']/following::div"));
	builder.moveToElement(customer).click().perform();
	Thread.sleep(500);
	
	//Click Category and click Hair->Click haircar;e->Shampoo
	driver.findElement(By.xpath("//span[text()='Category']")).click();
	WebElement hair = driver.findElement(By.xpath("//span[text()='Hair']"));
	builder.moveToElement(hair).click().perform();
	builder.moveToElement(driver.findElement(By.xpath("//span[text()='Hair Care']"))).click().perform();
	driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	driver.findElement(By.xpath("//span[text()='Category']")).click();
	Thread.sleep(500);
	
	//Click->Concern->Color Protection
	driver.findElement(By.xpath("//span[text()='Concern']")).click();
	WebElement colour = driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]"));
	builder.moveToElement(colour).click().perform();
	
	//Check if the filter has Shampoo
	String text = driver.findElement(By.xpath("//div[@class='css-1emjbq5']/span")).getText();
	if (text.equals("Shampoo"))
		System.out.println("Shampoo is present in the filter");
	else
		System.out.println("Shampoo is not there in the filter");
	
	//Click on L'Oreal Paris Colour Protect Shampoo
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(text(),\"L'Oreal Paris Colour Protect Shampoo\")]")).click();
	
	//GO to the new window and select size as 175ml
	Set<String> window = driver.getWindowHandles();
	List<String> newWindow = new ArrayList<String>(window);
	driver.switchTo().window(newWindow.get(1));
	WebElement sizeElement = driver.findElement(By.xpath("//select"));
    Select size = new Select(sizeElement);
    size.selectByVisibleText("175ml");
    //Print the MRP of the product
	String mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
	System.out.println("MRP of the product is: "+mrp);
	
	//Click on Add to Bag
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	
	//Go to Shopping Bag
	driver.findElement(By.xpath("//button[@type='button' and @class ='css-g4vs13']")).click();
	Thread.sleep(500);
	//Print the Grand Total amount
	WebElement element = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	driver.switchTo().frame(element);
	Thread.sleep(500);
	////div[contains(@class,'value medium-strong')]
	//String grandTotal = driver.findElement(By.xpath("//span[@class='vernacular-string']/following-sibling::div[@class='value']")).getAttribute("text()");
	String grandTotal = driver.findElement(By.xpath("//div[@class='name medium-strong']/following-sibling::div[1]")).getText(); 
	System.out.println(grandTotal);
	Thread.sleep(1000);
	//Click Proceed
	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	
	//Click on Continue as Guest
	driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
	
	//Check if this grand total is the same in step 14
	String total = driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div")).getText();
	System.out.println(total);
    if (grandTotal.equals(total))	
    	System.out.println("Total is the same");
    else
    	System.out.println("There is difference in the total");
   
    //close all the windows
    driver.quit();
}
}
