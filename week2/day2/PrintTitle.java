package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTitle {
	public static void main(String[] args) {
		//to setup the browser
				WebDriverManager.chromedriver().setup();
				//to launch the browser
				ChromeDriver driver= new ChromeDriver();
				//to load the url
				driver.get("https://acme-test.uipath.com/login");
				//to maximize the window
				driver.manage().window().maximize();
				//to enter the email
				driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
				//to enter password
				driver.findElement(By.id("password")).sendKeys("leaf@12");
				//to click on the Login button
				driver.findElement(By.xpath("(//form/div)[3]/following-sibling::button")).click();
				//to get the title of the page displayed
				System.out.println(driver.getTitle());
	}

}
