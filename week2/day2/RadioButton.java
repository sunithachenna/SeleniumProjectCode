package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//Launch BROWSER
		ChromeDriver driver = new ChromeDriver();
		//open the URL
		driver.get("http://www.leafground.com/pages/radio.html");
		//to select yes for the first question
		driver.findElement(By.id("yes")).click();
		//to check the default radio button selected
		boolean unChecked = driver.findElement(By.xpath("//input[@name=\"news\" and @value=\"0\"]")).isSelected();
		boolean checked = driver.findElement(By.xpath("//input[@name=\"news\" and @value=\"1\"]")).isSelected();
		if (unChecked==true)
			System.out.println("The Radio button of \"UnChecked\" is not selected");
		else
			System.out.println("The Radio button of \"Checked\" is selected");
		//initialize a variable to store your age
		int age=39;
		//check and store in a varaible if the radio button is selected
		boolean selected = driver.findElement(By.xpath("//input[@name=\"age\" and @value=\"1\"]")).isSelected();
		//check and select the respective radio button corresponding to your age.
		if (age<=20)
			driver.findElement(By.xpath("//input[@name=\"age\" and @value=\"0\"]")).click();
		else if ((age>20&&age<40)&&(selected==true))
			System.out.println("Your age group is already selected");
		else
			driver.findElement(By.xpath("//input[@name=\"age\" and @value=\"2\"]")).click();
		//close the browser
		driver.close();

	}

}
