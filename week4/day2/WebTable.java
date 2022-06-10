package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		//Set up the chrome browser
				WebDriverManager.chromedriver().setup();
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//goto the URL
				driver.get("http://www.leafground.com/pages/table.html ");
				
				//Get the count of number of columns
				List<WebElement> headerColumns = driver.findElements(By.xpath("//table//tr/th"));
				int colSize = headerColumns.size();
				System.out.println("Coloums present in the table are: "+colSize);
				
				//Get the count of number of row
				List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
				int rowSize = rows.size();
				System.out.println("Rows present in the table are: "+rowSize);
				
				//Get the progress value of 'Learn to interact with Elements'
				System.out.println("The progress values of 'Learn to interact with Elements' are:");
				for(int i=3;i<rows.size();i++)
				{
					String text = driver.findElement(By.xpath("//table//tr["+i+"]/td[2]")).getText();
					System.out.println(text);
				}
				
				//Check the vital task for the least completed progress
				driver.findElement(By.xpath("//table//tr[6]/td[3]/input")).click();
				
	}

}
