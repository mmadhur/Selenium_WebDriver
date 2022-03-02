package myseleniumpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDownHandle_BingSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www2.bing.com/?form=DCDN");
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");

		List<WebElement> list = driver.findElements(By.xpath("//li[@class ='sa_sg']//span"));
		// List<WebElement>list =driver.findElements(By.xpath("//li[@class ='sa_sg']"));

		System.out.println(list.size());

		for (WebElement option : list) {
			Thread.sleep(3000);
			if (option.getText().contains("download")) {
				option.click();
				break;
			}
		}

	}

}
