package myseleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");

		// Actions act = new Actions(driver);
		// act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Select
		// Product Type')]"))).click().perform();

		try {
			driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",
					driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")));
		}

		/*
		 * try {
		 * driver.findElements(By.xpath("//ul[@class = 'dropdown1 dropdown-menu']/li"));
		 * } catch (Exception e) { JavascriptExecutor executor = (JavascriptExecutor)
		 * driver; executor.executeScript("arguments[0].click();",
		 * driver.findElements(By.xpath("//ul[@class = 'dropdown1 dropdown-menu']/li")))
		 * ; }
		 */

		// element = driver.find_element_by_css('div[class*="loadingWhiteBox"]')
		// driver.execute_script("arguments[0].click();", element)
		// WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.XPATH,
		// "//span[@class='taLnk ulBlueLinks']"))).click()

		List<WebElement> producttypes = driver.findElements(By.xpath("//ul[@class ='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of options in product types:" + producttypes.size());

		for (WebElement ptype : producttypes) {
			String text = ptype.getText();
			if (text.equals("Accounts")) {
				// driver.execute_script("arguments[0].click();", ptype)

				Thread.sleep(3000);
				ptype.click();
				break;
			}

		}

	}

}
