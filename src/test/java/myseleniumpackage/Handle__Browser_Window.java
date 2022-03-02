package myseleniumpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle__Browser_Window {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		// String window_id = driver.getWindowHandle();
		// System.out.println(window_id);
		// Retrieving Parent window id and child window id by using iterator
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

		Set<String> windows_id = driver.getWindowHandles();
		/*
		 * Iterator<String> itr = windows_id.iterator(); String Parent_id = itr.next();
		 * String Child_id = itr.next();
		 * 
		 * System.out.println(Parent_id); System.out.println(Child_id);
		 */

		// Retrieving Parent window id and child window id by using Array List
		/*
		 * List<String> windows_id_list = new ArrayList(windows_id); String parent_id =
		 * windows_id_list.get(0); String child_id = windows_id_list.get(1);
		 * 
		 * System.out.println(parent_id); System.out.println(child_id);
		 * 
		 * // Switching b/w parent & child window
		 * 
		 * driver.switchTo().window(parent_id); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(child_id); System.out.println(driver.getTitle());
		 */

		// Switching b/w parent & child window by using for each loop

		List<String> windows_id_list = new ArrayList(windows_id);
		for (String win_id : windows_id_list)
		{
			String title = driver.switchTo().window(win_id).getTitle();
			System.out.println(title);
			if (title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		//driver.quit();
		
	}

}
