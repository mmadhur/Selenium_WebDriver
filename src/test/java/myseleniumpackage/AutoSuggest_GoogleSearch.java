package myseleniumpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		Thread.sleep(3000);
		//Both the xpath are correct; upper one written by me
		
		List <WebElement> list = driver.findElements(By.xpath("//li[@class ='sbct']//div[@class ='wM6W7d']//span"));
		//List <WebElement> list = driver.findElements(By.xpath("//li[@class ='sbct']//div[@role='option']//div[1]/span"));
		Thread.sleep(3000);
		System.out.println(list.size());
		
		for(WebElement ele :list)
		{
			if(ele.getText().contains("pdf"))
			{
				Thread.sleep(3000);
				ele.click();
				break;
			}
		}
		
	}
}
