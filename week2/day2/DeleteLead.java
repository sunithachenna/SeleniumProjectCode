package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
		//to click on the Phone tab
		driver.findElement(By.xpath("//span[@class=\"x-tab-strip-inner\"]/span[contains(text(),'Phone')]")).click();
		//to enter the phone number
		driver.findElement(By.xpath("//div[@class=\"x-plain-bwrap\"]//input[contains(@name,'phoneNumber')]")).sendKeys("1234567891");
		//to click on Find Leads button
		driver.findElement(By.xpath("//td[@class=\"x-btn-center\"]//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(2000);
		//to get the Lead ID of the first result
		String leadId = driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a")).getText();
		System.out.println("The lead id id " +leadId);
		//to click on the first result in Find Leads Page
		driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a")).click();
		//to click on the Delete button
		driver.findElement(By.xpath("//a[@class=\"subMenuButtonDangerous\"]")).click();
		//to click on the Find Leads button
		driver.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
		//enter the captured lead Id
		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys(leadId);
		//to click on Find Leads button
		driver.findElement(By.xpath("//td[@class=\"x-btn-center\"]//button[contains(text(),'Find Leads')]")).click();
		//to get the "No results " text
		String compare = driver.findElement(By.xpath("//div[@class=\"x-toolbar x-small-editor\"]//div")).getText();
		if (compare.equals(compare))
			System.out.println("Yes No records are displayed");
		else
			System.out.println("Records are displayed");
		//close browser
		driver.close();
	}
}
