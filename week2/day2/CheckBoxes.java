package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		//Set up the chrome browser
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//goto the URL
		driver.get("http://leafground.com/pages/checkbox.html");
		//to select the languages known
		String[] languages = {"Java","C","C++"};
		for (int i = 0; i < languages.length; i++) {
			if (languages[i].equals("Java"))
				driver.findElement(By.xpath("//input[1]")).click();
			else if (languages[i].equals("VB"))
				driver.findElement(By.xpath("//input[2]")).click();
			else if (languages[i].equals("SQL"))
				driver.findElement(By.xpath("//input[3]")).click();
			else if (languages[i].equals("C"))
				driver.findElement(By.xpath("//input[4]")).click();
			else if (languages[i].equals("C++"))
				driver.findElement(By.xpath("//input[5]")).click();
			//to confirm if Selenium is Selected
			boolean selenium = driver.findElement(By.xpath("//label[contains(text(),'Confirm Selenium is checked')]/following-sibling::input")).isSelected();
			if (selenium == true)
				System.out.println("Selenuim is already Selected");
			else
				System.out.println("Selenium is not selected");
			//to unselect the selected checkbox
			boolean selected = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input")).isSelected();
			if (selected==false) {
				boolean selected2 = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]")).isSelected();
				if (selected2==true) {
					driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]")).click();
				}

			} else
				driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input")).click();
		}
		//to check all the checkboxes
		driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input[2]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input[3]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input[4]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input[5]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input[6]")).click();



	}

}
