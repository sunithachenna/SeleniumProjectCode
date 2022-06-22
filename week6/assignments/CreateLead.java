package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends Requisite {
//	@BeforeClass
//	public void dataSheet() {
//		fileName= "CreateLeadv1";
//	}
	@BeforeClass
	public void datasheet1() {
		sheetName = "Lead";
	}
  @Test (dataProvider = "CreateData" , priority = 1)
  public void createLead(String cName , String fName, String lName, String fNameLocal, String depart , String desc, String email) throws InterruptedException {

	 
		//to click on the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		//to click on the Leads tab
		driver.findElement(By.linkText("Create Lead")).click();
		// to enter data in mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNameLocal);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(depart);
		driver.findElement(By.id("createLeadForm_description")).sendKeys(desc);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
		//for drop down
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//take the Select class and create an object to access the drop down values
		Select dropValues = new Select(ele);
		dropValues.selectByVisibleText("New York");
		//to click on the Create Lead button on the browser
		driver.findElement(By.name("submitButton")).click();
		//to get the title of the loaded page
		System.out.println(driver.getTitle());
	
  }
  
}
