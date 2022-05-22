package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
	
		//to setup the browser
		WebDriverManager.chromedriver().setup();
		//to launch the browser
		ChromeDriver driver= new ChromeDriver();
		//to load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//enter the dat in the username by finding the locator with ID
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//enter the dat in the password by finding the locator with ID
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//to click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//to click on the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		//to click on the Leads tab
		driver.findElement(By.linkText("Create Lead")).click();
		// to enter data in mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sunitha");
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chenna");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SunithaChenna");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learing Automation testing with Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("frefaj@ksdg.com");
		//for drop down
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//take the Select class and create an object to access the drop down values
		Select dropValues = new Select(ele);
		dropValues.selectByVisibleText("New York");
		//to click on the Create Lead button on the browser
		driver.findElement(By.name("submitButton")).click();
		//to edit the Lead
		driver.findElement(By.linkText("Edit")).click();
		//to clear the description field contents
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//to enter data in the important field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learing Automation with Selenium");
		//to update
		driver.findElement(By.name("submitButton")).click();
		//to get the title of the loaded page
		System.out.println(driver.getTitle());
		//Close the browser
		driver.close();
		
	}

}
