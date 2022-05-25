package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		//setup the drivers for the Chrome Browser
		WebDriverManager.chromedriver().setup();
		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//to maximize the  window
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		//enter the password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		//click on the Login button
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
		//click on the CRM link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		Thread.sleep(2000);
		//click on the Contacts Tab
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		//click on the create contact
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click(); 
		//Enter first name using id
		driver.findElement(By.id("firstNameField")).sendKeys("Sunitha");
		//Enter last name using id 
		driver.findElement(By.id("lastNameField")).sendKeys("Chenna");
		//enter the first name local name
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Suneetha"); 
		//enter the last name local name
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Dinesh");
		//enter the department
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("software testing");
		//enter data in the description field
		driver.findElement(By.id("createContactForm_description")).sendKeys("gdgdjdjxghdhdghgdjfjhfj fyfyjfhfuyjyj"); 
		//enter the email address
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ghsajsfa@fghdsjf.com");
        //Selecting State/Province as NewYork Using Visible Text
		WebElement element =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drop = new Select(element); drop.selectByVisibleText("New York");
		//click on the Create Lead driver.findElement(By.name("submitButton"));
        driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
        //Click on Edit button
        driver.findElement(By.xpath("//div[@class=\"frameSectionExtra\"]/a")).click();
        //to clear the content in the description field
        driver.findElement(By.xpath("//textarea[@name=\"description\"]")).clear();
        //to enter the text in important Note field
        driver.findElement(By.xpath("//textarea[@name=\"importantNote\"]")).sendKeys("hfdsvfjdsuef dfdisgajsg akjdfgkja");
        //to click on the update button
        driver.findElement(By.xpath("//input[@name=\"submitButton\" and @value=\"Update\"]")).click();
        //to get the title of the resulting page
        String title = driver.getTitle();
        System.out.println(title);
        

	}

}
