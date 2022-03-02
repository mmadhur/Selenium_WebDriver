package myseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Links {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//a[contains(text(),\"Today's
		// Deals\")]")).click();
		driver.findElement(By.linkText("Today's Deals")).click();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total links present " + links.size());
		/*
		 * for(int i=0; i<=links.size();i++) {
		 * System.out.println(links.get(i).getText());
		 * System.out.println(links.get(i).getAttribute("href")); }
		 */
		for (WebElement link : links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));

		}

	}

}
