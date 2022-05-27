package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws InterruptedException {
		//set up the browser
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//goto URL
		driver.get("http://leafground.com/pages/Image.html");
		//to click on the image
		driver.findElement(By.xpath("//div/img")).click();
		//goto URL
		driver.get("http://leafground.com/pages/Image.html");
		//to check if the image is broken
	    boolean enabled = driver.findElement(By.xpath("//div/label[text()='Am I Broken Image?']/following-sibling::img")).isEnabled();
	    if (enabled==true)
	    	System.out.println("Image is broken");
	    else
	    	System.out.println("Image is not broken");
	     //click on the link using keyboard /mouse
	    driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
	}
}
