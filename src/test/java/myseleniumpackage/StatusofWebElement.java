package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// isDisplayed() isEnabled()
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		
		//driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		
		//WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		//System.out.println(" Display Status " +searchbox.isDisplayed());
		
		//System.out.println(" Enable Status " +searchbox.isEnabled());
		
		//WebElement radiobutton = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[1]/span[1]/span[2]"));
		
		//System.out.println("Radio Button selected " +radiobutton.isSelected());
		
		
		//WebElement searchstore = driver.findElement(By.className("search-box-text ui-autocomplete-input"));
		
		//WebElement male = driver.findElement(By.id("gender-male"));
		
		//System.out.println(male.isSelected());
		
		
		//System.out.println(" Display Status " +searchstore.isDisplayed());
		
		//System.out.println(" Enabled Status " +searchstore.isEnabled());
		
		
		
		
		

	}

}
