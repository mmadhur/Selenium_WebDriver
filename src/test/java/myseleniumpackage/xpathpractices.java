package myseleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathpractices {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		
		/*WebElement link1 = driver.findElement(By.xpath("//span[@id = 'link']/.."));
		WebElement link2 = driver.findElement(By.xpath("//span[@id = 'link']"));
		link1.click();
		link2.click();*/
		
		// driver.findElement(By.xpath("//a[span[@id = 'link']]")).click();
		// driver.findElement(By.xpath("//a//span[@id = 'link']")).click();
		// driver.findElement(By.xpath("//a[.//span[@id = 'link']]")).click();
		
		//driver.get("https://www.flipkart.com/");
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//div[ text()= 'Electronics']")).click();
		
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//a[text() = ' Electronics ']")).click();
		//driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("clothes");
		
	//	driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[2]")).click();
		//driver.findElement(By.xpath("//a[text() = 'Mobiles']")).click();
	}

}
