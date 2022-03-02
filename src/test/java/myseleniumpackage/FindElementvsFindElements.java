package myseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementvsFindElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		// findElement() returns single webElement L-6

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

		searchbox.sendKeys("Mayank");
		// Locator pointing to multiple webelements i.e Links, findElement will return
		// first value

		WebElement ele = driver.findElement(By.xpath("//body/div[6]/div[4]//a"));

		System.out.println("Return first Element :" + (ele.getText()));

		List<WebElement> links = driver.findElements(By.xpath("//body/div[6]/div[4]//a"));

		System.out.println("Number of Elements Captured " + links.size());

		for (WebElement elem : links) {
			System.out.println(elem.getText());
		}

	}

}
