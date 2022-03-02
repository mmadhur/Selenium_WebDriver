package myseleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_popups {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// syntax http:// username : password @URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
