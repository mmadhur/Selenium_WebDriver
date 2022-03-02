package myseleniumpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapGenericWay {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hdfcbank.com/");

		// For Product type dropdown 

		driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")).click();
		List<WebElement> producttypes = driver.findElements(By.xpath("//ul[@class = 'dropdown1 dropdown-menu']//li"));
		System.out.println(producttypes.size());
		select_options_from_DropDown(producttypes, "Accounts");

		// for Product dropdown note:- product dropdown is dependent on producttype drop
		// down and instaaccount not selecting....debug it (pending task) try implicit wait and thread.sleep

		driver.findElement(By.xpath("//a[text() = 'Select Product']")).click();
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class = 'dropdown2 dropdown-menu']//li"));
		System.out.println(products.size());
		Thread.sleep(3000);
		//select_options_from_DropDown(products, "Rural Accounts");
		select_options_from_DropDown(products, "InstaAccount");
	}

	public static void select_options_from_DropDown(List<WebElement> options, String value)
			throws InterruptedException {
		for (WebElement item : options) {

			if (item.getText().equals(value)) {
				Thread.sleep(3000);
				item.click();
			}
		}
	}

}
