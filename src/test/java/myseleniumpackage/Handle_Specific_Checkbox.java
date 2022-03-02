package myseleniumpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Specific_Checkbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		// select specific checkboxes
		
		List<WebElement> chk_boxes = driver.findElements(By.xpath("//input[contains(@id, 'day')]"));
		
	/*	for (WebElement checkbox :chk_boxes )
		{
			String text = checkbox.getAttribute("id");
			if(text.equalsIgnoreCase("Friday") || text.equalsIgnoreCase("Sunday") )
			{
				checkbox.click();
			}
			
		} */
		
			// Selecting last two checkboxes
		
		//int totalcheckboxes = chk_boxes.size(); //7
		/*
		for(int i=chk_boxes.size()-2; i<chk_boxes.size(); i++ )
		{
			chk_boxes.get(i).click();
		}
		*/
		
		// selecting first few number of checkboxes
		
		for(int i =0; i<chk_boxes.size(); i++)
		{
			if (i <3)
			{
				chk_boxes.get(i).click();
			}
		}
		
		
		
		
		
		
	}

}
