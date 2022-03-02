package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_iframe {

	public static void main(String[] args) throws InterruptedException {
		
		// Write customized xpath of these
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@target ='packageFrame' and @xpath = '1']")).click();
		driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//body/main[1]/div[1]/section[1]/ul[1]/li[14]/a[1]/span[1]")).click(); // WebDriver
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")).click(); //Help
	}

}
