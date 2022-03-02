package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusWebElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");

		WebElement searchstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

		System.out.println("Display Status : " + searchstore.isDisplayed());

		System.out.println("Enable Status : " + searchstore.isEnabled());

		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

		System.out.println(male.isSelected());

		boolean f = female.isSelected();
		System.out.println(f);
		female.click();
		System.out.println(male.isSelected());

		boolean f1 = female.isSelected();
		System.out.println(f1);

	}

}
