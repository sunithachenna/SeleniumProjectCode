package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		//to setup the browser
		WebDriverManager.chromedriver().setup();
		//to launch the browser
		ChromeDriver driver= new ChromeDriver();
		//to load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		//enter the dat in the username by finding the locator with ID
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		//enter the dat in the password by finding the locator with ID
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		//to click on the login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//to click on the CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();////a[contains(text(),'CRM/SFA')]
		Thread.sleep(3000);
		//to click on the Leads tab
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//to click on the Leads tab
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		//to click on Find Leads tab
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//to click on the email tab
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		//to enter email
		driver.findElement(By.xpath("//input[@name=\"emailAddress\"]")).sendKeys("babu@testleaf.com");
		
		//to click on the Find Leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		//to click on the first search result
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		//get the firstname to verify
		String text1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		//to click on the duplicate lead
		driver.findElement(By.xpath("//div[contains(@class,'frameSectionExtra')]/a[contains(text(),'Duplicate Lead')]")).click();
		// to verify the title of the page.
		String title = driver.getTitle();
		//to check the title of the page
		if (title.contains("Duplicate Lead"))
		{
			System.out.println("Title matched as Duplicate Lead");
		} else {
			System.out.println("Title is not matched");
		}
		//Click on the Create lead button
		driver.findElement(By.name("submitButton")).click();
		//Get the name displayed in the duplicate lead page
		String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		//close the browser
		if (text1.equals(text2))
		{
			System.out.println("duplicated lead name is same as captured name");
		} else {
			System.out.println("duplicated lead name is not same as captured name");
		}
		//close browser
		driver.close();

	}

}
