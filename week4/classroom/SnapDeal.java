package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		//Set up the chrome browser
		WebDriverManager.chromedriver().setup();
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
		
		//goto the URL
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//hover on the Men's Fashion
		WebElement men = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		//Create an object for the Actions
		Actions builder = new Actions(driver);
		//to hover over the men
		builder.moveToElement(men).perform();
		//to get the webelement of SHirts
		driver.findElement(By.xpath("//span[text()=\"Shirts\"]")).click();
		Thread.sleep(2000);
		WebElement first = driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
	    builder.moveToElement(first).perform();
	    driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();
	}
	
}
