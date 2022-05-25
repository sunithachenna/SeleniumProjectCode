package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		//to setup the browser
		WebDriverManager.chromedriver().setup();
		//to launch the browser
		ChromeDriver driver= new ChromeDriver();
		//to load the url
		driver.get("https://en-gb.facebook.com/");
		//maximize the window.
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on Create New Account button
		driver.findElement(By.xpath("//form[@class='_9vtf']/div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/a")).click();
		//Enter the first Name
		driver.findElement(By.name("firstname")).sendKeys("Sunitha");
		//Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Dinesh");
		//enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("3243234325");
		//enter password
		driver.findElement(By.id("password_step_input")).sendKeys("qwerty");
		//dropdown for day
		WebElement dateEle = driver.findElement(By.id("day"));
		//creating an object to access the drop down values
		Select dateVal = new Select(dateEle);
		//select values from Date drop down
		dateVal.selectByVisibleText("10");
		//select values from month drop down
		WebElement monthEle = driver.findElement(By.id("month"));
		Select monthVal = new Select(monthEle);
		monthVal.selectByVisibleText("May");
		//select values from year drop down
		WebElement yearEle = driver.findElement(By.id("year"));
		Select yearVal = new Select(yearEle);
		yearVal.selectByVisibleText("1980");
		//select the radio button
		driver.findElement(By.className("_8esa")).click();
				

	}

}
