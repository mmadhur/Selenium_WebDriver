package myseleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*
		 * // ok alert
		 * driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"
		 * )).click(); Thread.sleep(3000); driver.switchTo().alert().accept();
		 * 
		 * // ok + cancel
		 * 
		 * driver.findElement(By.
		 * xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		 * Thread.sleep(3000); // driver.switchTo().alert().accept();
		 * driver.switchTo().alert().dismiss();
		 * 
		 * // if alert box having input box
		 */
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(3000);

		Alert alert_window = driver.switchTo().alert();
		System.out.println(alert_window.getText()); // I am a js prompt

		alert_window.sendKeys("Mayank Madhur");

		alert_window.accept();
		// alert_window.dismiss();

	}

}
