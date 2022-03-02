package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextvsGetAttribute {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		/* WebElement emailbox = driver.findElement(By.xpath("//input[@id = 'Email']"));
		 emailbox.clear();
		 emailbox.sendKeys("admin123@gmail.com");

		 To capture default text from i/p box

		 System.out.println("Result from getAttribute method :"
		 +emailbox.getAttribute("value"));
		 System.out.println("Result from getAttribute method :"
		 +emailbox.getAttribute("data-val-required"));

		 System.out.println("Result from getText Method:"+emailbox.getText());*/

		WebElement button = driver.findElement(By.xpath("//button[ text() = 'Log in']"));
		System.out.println("Result from getAttribute Method:" + button.getAttribute("type"));
		System.out.println("Result from getText Method:" + button.getText());

	}

}
