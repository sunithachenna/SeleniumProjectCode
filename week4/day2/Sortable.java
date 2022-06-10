package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		/*
		 * Initial browser Setup
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		// drag elememt
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"mydiv\"]//li/following-sibling::li//following-sibling::li//following-sibling::li//following-sibling::li/span"));
		//drop element
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"mydiv\"]//li/following-sibling::li/span"));
		//Create object for Actions
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();
	}
}
