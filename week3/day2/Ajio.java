package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		//Initialize Chrome Web Driver
		WebDriverManager.chromedriver().setup();
		//Launch ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//load the URL and maximize the window
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		//Enter bags in the search box
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		//Click Search
		driver.findElement(By.xpath("//button[@class='rilrtl-button']/span")).click();
		//Select the checkbox for Men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		// Select the checkbox for Fashion bags
		driver.findElement(By.xpath("//label[contains(@for,'Men - Fashion Bags')]")).click();
		Thread.sleep(2000);
		//Get the no:of Items found
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		//Get the list of brands and store it in a LIST
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='brand']"));
		//Display the total no:of brands found
		System.out.println("No:of brands found : "+findElements.size());
		//display the brand name 
		System.out.println("The List of Brand Names : ");
		for (WebElement webElement : findElements) {
			String text2 = webElement.getText();
			System.out.print(text2+" ,");
		}
		System.out.println();
		//to display the list of bags we are storing in a LISt webelement and calling each using a FOREACH loop
		List<WebElement> bagsList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("The list of bag names displayed on this page are ");
		for (WebElement webElement : bagsList) {
			String bagName = webElement.getText();
			System.out.print(bagName+", ");
		}
		}

}
