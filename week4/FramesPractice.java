package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice {
public static void main(String[] args) {
	/*
	 * Initial browser Setup
	 */
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.manage().window().maximize();
	
	/*
	 * Enter into the first frame
	 * and enter text
	 */
	driver.switchTo().frame("frame1");
	driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("testing selenium");

	/*
	 * Enter to second Frame
	 * and click on the checkbox
	 */
	driver.switchTo().frame("frame3");
	driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input")).click();
	driver.switchTo().defaultContent();
	/*
	 * Enter into the third frame
	 * and select from the dropdown
	 */
	driver.switchTo().frame("frame2");
	WebElement element1 = driver.findElement(By.id("animals"));
	Select options = new Select(element1);
	options.selectByVisibleText("Avatar");
	driver.switchTo().defaultContent();
	
	
}
}
