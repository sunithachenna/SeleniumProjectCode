package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		//Set up the chrome browser
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//goto the URL
		driver.get("https://erail.in");
		//clear the data in the From field
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS");
		Thread.sleep(500);
		from.sendKeys(Keys.TAB);
		//clear the data in the From field
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU");
		Thread.sleep(500);
		to.sendKeys(Keys.TAB);
		//uncheck the date checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(2000);
		//get the size of the table
		int size = driver.findElements(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader\"]//tr")).size();
		System.out.println(size);
		//creating a list to get all the train names
		List<String> trains = new ArrayList<String>();
		//to print the names of the trains
		for (int i = 1; i <= size; i++) {
			String text = driver.findElement(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader\"]//tr["+i+"]/td[2]")).getText();
			trains.add(text);
			System.out.println(text);
		}
		//passing trains in the constructor to remove the duplicates
		Set<String> names = new HashSet<String>(trains);
		if (trains.size()==names.size())
			System.out.println("No Duplicates");
		else
			System.out.println("Duplicates are there");

	}
}
