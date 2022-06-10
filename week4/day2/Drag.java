package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {
	public static void main(String[] args) {
		/*
		 * Initial browser Setup
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		// get the element to drag
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		//create an obj for Action class
		Actions builder = new Actions(driver);
		//perform drag operation
		builder.clickAndHold(drag).moveByOffset(200, 100).release().perform();
		
	}

}
