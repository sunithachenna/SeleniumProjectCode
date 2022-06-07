package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WindowsPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		//get the parent handle
		String parent = driver.getWindowHandle();
		
		/*
		 * Click on the first Open HomePage Button
		 */
		driver.findElement(By.xpath("//button[text()=\"Open Home Page\"]")).click();
		//Getting into the subwindow
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> first = new ArrayList<String>(windowHandles);
		System.out.println("-------------WIndows opened on clicking the first button----------");
		driver.switchTo().window(first.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		/*
		 * Moving to the second button
		 */
		driver.findElement(By.xpath("//button[text()=\"Open Multiple Windows\"]")).click();
		//get the sub windows
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> second = new ArrayList<String>(windowHandles2);
		System.out.println("----------Windows opened on Clicking the second button-----------");
		int count =0;
		for(int i=1;i< windowHandles2.size();i++)
		{
		driver.switchTo().window(second.get(i));
		count= count+1;
		System.out.println(driver.getTitle());
		//after opening the window close it
		//driver.close();
		}
		System.out.println("The no:of windows opened on clicking the second button:"+count);
		
		//close the sub window and move to parent window
		driver.switchTo().window(parent);
		/*
		 * Moving to the third button
		 */
		driver.findElement(By.xpath("//button[text()=\"Do not close me \"]"));
		String button = driver.getWindowHandle();
		driver.switchTo().window(button);
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> third = new ArrayList<String>(windowHandles3);
		System.out.println("-------Windows opened on Clicking the Third button-------");
		for(int i=1; i<windowHandles3.size();i++)
		{
			driver.switchTo().window(third.get(i));
			System.out.println(driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(parent);
		/*
		 * On clicking the last button
		 */
		driver.findElement(By.xpath("//button[text()=\"Wait for 5 seconds\"]")).click();
		//wait for 5 sec
		Thread.sleep(5000);
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> fourth = new ArrayList<String>(windowHandles4);
		System.out.println("---------WIndows opened on clicking the last button after 5 sec---------");
		for (int i = 1; i < windowHandles4.size(); i++) {
			driver.switchTo().window(fourth.get(i));
			System.out.println(driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(parent);
		driver.close();
//		driver.quit();
//		
		
	}

}
