package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateAccount extends Requisite{
	@BeforeClass
	public void datasheet1() {
		sheetName="Account";
	}
	@Test (dataProvider ="CreateData",priority = 3 )
	public  void createAccount(String name) throws InterruptedException {
		          // click on the Account tab
		        driver.findElement(By.linkText("Accounts")).click();
	
				//Create Account
				driver.findElement(By.linkText("Create Account")).click();
				//Enter accoutn name
				driver.findElement(By.id("accountName")).sendKeys(name);
				//click on submit
				driver.findElement(By.className("smallSubmit")).click();
				
	}

}
