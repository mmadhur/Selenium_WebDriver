package myseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDownTraditionalway {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial-old/");

		// Traditional approach

		WebElement drpempelement = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		Select drpemp = new Select(drpempelement);

		drpemp.selectByVisibleText("201 - 250");
		drpemp.selectByValue("26 - 50");
		drpemp.selectByIndex(5);

		WebElement drpindustryelement = driver.findElement(By.id("Form_submitForm_Industry"));
		Select drpindustry = new Select(drpindustryelement);

		drpindustry.selectByVisibleText("Education");
		drpindustry.selectByValue("Computer/Technology-Manufacturer");
		drpindustry.selectByIndex(5);

		/*
		 * List<WebElement> allopt = drpemp.getOptions();
		 * 
		 * for (WebElement item : allopt)
		 * 
		 * {
		 * 
		 * System.out.println(item.getText()); }
		 */

	}

}
