package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Requisite {	
	
	ChromeDriver driver;
	//String fileName;
	String sheetName;
	@Parameters({"url", "uName", "pwd"})
	@BeforeMethod
	
	public void preRequisite(String URL, String Uname, String pwd) throws InterruptedException {

		//to setup the browser
		WebDriverManager.chromedriver().setup();
		//to launch the browser
	    driver = new ChromeDriver();
		//to load the url
		driver.get(URL);
		driver.manage().window().maximize();
		//enter the dat in the username by finding the locator with ID
		driver.findElement(By.id("username")).sendKeys(Uname);
		//enter the dat in the password by finding the locator with ID
		driver.findElement(By.id("password")).sendKeys(pwd);
		//to click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void postRequisite () {
		//Close the browser
		driver.close();
	}
//	@DataProvider
//	public String[] fetchAccountData(){
//		String[] str = new String[5];
//		str[0]="Testing App2";
//		str[1]="Testing App3";
//		str[2]="Testing App4";
//		str[3]="Testing App5";
//		str[4]="Testing App6";
//		return str;
//	}
	@DataProvider
	public  String[][] CreateData() throws IOException {
		 String[][] data = TestDataInfo.readExcel(sheetName);
		return data;
	}
}










