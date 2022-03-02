package myseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleSelectDropdownGeneric {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial-old/");
		driver.manage().window().maximize();
		
		WebElement drpempelement = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		selectDropDownGeneric(drpempelement, "201 - 250");

		 WebElement drpindustryelement = driver.findElement(By.name("Industry"));
		//WebElement drpindustryelement = driver.findElement(By.id("Form_submitForm_Industry"));
		selectDropDownGeneric(drpindustryelement, "Computer / Technology - Manufacturer");

		WebElement drpcountryelement = driver.findElement(By.name("Country"));
		selectDropDownGeneric(drpcountryelement, "Brunei Darussalam");
	}

	public static void selectDropDownGeneric(WebElement ele, String value)
	{
		Select drpemp = new Select(ele);
		List<WebElement> alloptionsemp = drpemp.getOptions();

		for (WebElement item : alloptionsemp) 
		{
			if (item.getText().equals(value)) 
			{
				item.click();
				break;
			}
		}
	}

}
