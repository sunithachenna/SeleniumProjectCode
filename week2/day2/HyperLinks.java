package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {
	public static void main(String[] args) {
		//set up the browser
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//go to the URL
		driver.get("http://leafground.com/pages/Link.html");
		//to click on the first link
		driver.findElement(By.xpath("//a[text()=\"Go to Home Page\"]")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the Url that the page takes on clicking the first link: "+currentUrl);
		driver.get("http://leafground.com/pages/Link.html");
		//to get the url of the link without clicking the link
		System.out.println("The url to which the link takes without clicking on it is : "+driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		//to verify if the link is broken
		String attribute = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		if (attribute.contains("error"))
			System.out.println("The link is broken");
		else
			System.out.println("This is not a broken link");
		String homeLink = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		if (currentUrl.equals(homeLink))
			System.out.println("Links are directed to the same page");
		else
			System.out.println("Links are directed to different pages");
		//to check how many links are available in the page
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int count = 0;
		for (int i = 0; i < totalLinks.size(); i++) {
			count = count + 1;
		}
		System.out.println("Total no.of link in this page: " + count);
	}

}
