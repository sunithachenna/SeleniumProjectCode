package week2.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class EditLead {

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
		//to click on the Leads tab
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//to click on the Leads tab
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		//to click on Find Leads tab
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//to enter the firstname
		driver.findElement(By.xpath("//div[@id='ext-gen363']/div/following-sibling::div/div/input")).sendKeys("Sunitha");
		//to click on Find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Click on the first lead
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		// confirm  the title of the page
		if (driver.getTitle().contains("CRM")) {
			System.out.println("the title is confirmed");
		}
		else {
			System.out.println("the title is not confirmed");
		}
		//Click on the Edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//clear the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		//Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Tcs");
		String text = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		Thread.sleep(2000); 
		System.out.println(text);
		//to click on the update button
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		//to confirm if the changed name appears 
		String changeText = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		System.out.println(changeText); 
		if (changeText.contains(text))
		{ 
			System.out.println(" Changed Text is confirmed");
		} else { System.out.println(" Change Text is not confirmed"); }
		//Close the browser 
         driver.close();

	}

}
