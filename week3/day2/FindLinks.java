package week3.day2;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		//Get all the links (using findElements)
		List<WebElement> linkEle = driver.findElements(By.tagName("a"));
		
		//Click on the first link (using get method with index as 0)
		WebElement firstLink = linkEle.get(0);
		firstLink.click();
		
		//Print the title
		System.out.println(driver.getTitle());
		
		//Navigate back
		driver.navigate().back();
		
		//Get all the links again (using findElements)
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		//Print the count of the links (size)
		System.out.println(list.size());
		
		//print the href value (getAttribute) of the second link
		System.out.println(list.get(2).getAttribute("href"));
		
			}
	
	
}
