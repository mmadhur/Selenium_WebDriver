package myseleniumpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Chcekboxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		// Select specific checkbox
		// driver.findElement(By.id("tuesday")).click();

		// select all the checkboxes

		List<WebElement> chk_boxes = driver.findElements(By.xpath("//input[contains(@id, 'day')]"));
		System.out.println(chk_boxes.size()); //7
		
		/*for (WebElement item :chk_boxes)
		{
			item.click();
		}*/
		
		// select all checkboxes using for loop
		
		for(int i = 0; i <chk_boxes.size(); i++)
		{
			chk_boxes.get(i).click();	
		}
		

	}

}
