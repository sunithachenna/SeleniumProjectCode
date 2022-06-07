package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		//Browser and Driver setup
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//to load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//enter the data in the username by finding the locator with ID
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//enter the dat in the password by finding the locator with ID
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on contacts
		driver.findElement(By.linkText("Contacts")).click();
		//click on Merge COntacts using xpath
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//a/img[@alt='Lookup']")).click();
		/*Navigate to the new window
		 * 
		 */
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		//Change it to List
		List<String> window = new ArrayList<String>(windowHandles);
		//enter to the window
		WebDriver webDriver = driver.switchTo().window(window.get(1));
		System.out.println(webDriver.getTitle());
		
		  // Click on First Resulting Contact 
		driver.findElement(By.xpath("//div[contains(@class,'partyId')]/a[@class='linktext'][1]")).click();
		  //comeback to the parent window
		  driver.switchTo().window(parent);
		  //Click on Widget of To Contact
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following-sibling::a")).click();
		  //Navigate to the new window 
		Set<String> windowHandles1 = driver.getWindowHandles(); 
		//Change it to List 
		List<String> window1 = new ArrayList<String>(windowHandles1);
		//enter to the window
		  driver.switchTo().window(window1.get(1)); 
		  //Click on Second Resulting Contact
		  driver.findElement(By.xpath("(//div[contains(@class,'partyId')]/a)[3]")).click();
		  //comeback to the parent window
		  driver.switchTo().window(parent);
		  //Click on Merge button using Xpath Locator
		  driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		  //Accept the alert 
		  Alert alert = driver.switchTo().alert();
		  Thread.sleep(2000);
          alert.accept(); //Verify the title of the page
		  System.out.println(driver.getTitle());
		 
	}
}
