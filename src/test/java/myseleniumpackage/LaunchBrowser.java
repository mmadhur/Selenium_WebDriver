package myseleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://frontend.nopcommerce.com/");

		System.out.println("The Title of the webpage is : " +driver.getTitle());

		System.out.println("The URL of the webpage is : " +driver.getCurrentUrl());

		System.out.println("The PageSource of the webpage is : " +driver.getPageSource());

	}

}
