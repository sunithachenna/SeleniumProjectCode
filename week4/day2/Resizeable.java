package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Initial browser Setup
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		/*
		 * Enter into the first frame
		 */
		WebElement element = driver.findElement(By.xpath("//div[@class=\"demo-list\"]/following-sibling::iframe"));
		driver.switchTo().frame(element);
		Thread.sleep(1000);
		WebElement resize = driver.findElement(By.xpath("//div[contains(@class,'resizable') and @id='resizable']//div/following-sibling::div/following-sibling::div"));
		//create an object for Actions
		Actions builder = new Actions(driver);
		Thread.sleep(1000);
 		 builder.clickAndHold(resize).moveByOffset(100, 50).release().perform();
		
	}

}
