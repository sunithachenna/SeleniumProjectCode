package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		/*
		 * Initial browser Setup
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		//Get the drag webelement
		WebElement drag = driver.findElement(By.xpath("//div[@id='mydiv']//li[text()='Item 3']"));
		//get the drop webelement
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydiv']//li[text()='Item 7']"));
		//Create obj for Actions
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();
		
	}

}
