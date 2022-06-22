package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends Requisite {
//	@BeforeClass
//	public void dataSheet() {
//		fileName= "CreateContactv1";
//	}
	@BeforeClass
	public void datasheet1() {
		sheetName="Contact";
	}
	@Test(dataProvider = "CreateData", priority = 2)
	public void createContact(String fName, String lName, String fNameLocal, String fLocal, String depart, String desc, String email, String ph) throws InterruptedException {
		
				//click on the Contacts Tab
				driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
				//click on the create contact
				driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click(); 
				//Enter first name using id
				driver.findElement(By.id("firstNameField")).sendKeys(fName);
				//Enter last name using id 
				driver.findElement(By.id("lastNameField")).sendKeys(lName);
				//enter the first name local name
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(fNameLocal); 
				//enter the last name local name
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(fLocal);
				//enter the department
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys(depart);
				//enter data in the description field
				driver.findElement(By.id("createContactForm_description")).sendKeys(desc); 
				//enter the email address
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(email);
				//enter phone number
				driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys(ph);
		        //Selecting State/Province as NewYork Using Visible Text
				WebElement element =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select drop = new Select(element); drop.selectByVisibleText("New York");
				//click on the Create Lead driver.findElement(By.name("submitButton"));
		        driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
		       	
	}
	
}
