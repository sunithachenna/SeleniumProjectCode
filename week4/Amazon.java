package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws IOException, InterruptedException {
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
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get the handle for parent window
		String parent = driver.getWindowHandle();
		//Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The price of the first product is "+price);
		//to get the customer ratings
		String rating = driver.findElement(By.xpath("(//div[contains(@class,'a-row a-size-small')])[1]/span")).getAttribute("aria-label");
		System.out.println(" The customer rating of the first product is " +rating);
		driver.findElement(By.xpath("//h2[contains(@class,'a-size-mini')]/a[@target='_blank']")).click();
		/* 
		 * Moving to the new window
		 * 1. get the window handles
		 */
		Set<String> windowHandles1 = driver.getWindowHandles(); 
		//Change it to List 
		List<String> window1 = new ArrayList<String>(windowHandles1);
		//enter to the window
		driver.switchTo().window(window1.get(1)); 
		//to take the screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshotamazon.png");
		FileUtils.copyFile(source, destination);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		//comparing the prices
		if (subTotal.contains(price))
			System.out.println("The Amount is correct");
		else
			System.out.println("The amount is wrong");
		driver.quit();

	}
}
