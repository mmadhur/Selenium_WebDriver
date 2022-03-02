package myseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.hdfcbank.com/");

		// For Product type
		driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")).click();
		List<WebElement> producttypes = driver.findElements(By.xpath("//ul[@class = 'dropdown1 dropdown-menu']//li"));
		System.out.println(producttypes.size());

		for (WebElement ptype : producttypes) {
			if (ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
			}
		}
		// For Product
		driver.findElement(By.xpath("//a[text() = 'Select Product']")).click();
		List<WebElement> product = driver.findElements(By.xpath("//ul[@class = 'dropdown2 dropdown-menu']//li"));
		System.out.println(product.size());
		for (WebElement item : product) {
			if (item.getText().contains("Rural")) {
				item.click();
				break;
			}
		}
	}

}
