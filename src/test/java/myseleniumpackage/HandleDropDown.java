package myseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");

		WebElement drpcountryele = driver.findElement(By.id("input-country"));
		Select drpcountry = new Select(drpcountryele);

		// Selecting dropdown via select methods
		/*
		 * drpcountry.selectByVisibleText("Denmark"); 
		 * drpcountry.selectByValue("10");
		 * drpcountry.selectByIndex(5);
		 */

		// Selecting dropdown without select methods

		List<WebElement> alloptions = drpcountry.getOptions();
		for (WebElement item : alloptions)
		{
			if (item.getText().equals("Denmark"))
			{
				item.click();
				break;
			}

		}

	}

}
