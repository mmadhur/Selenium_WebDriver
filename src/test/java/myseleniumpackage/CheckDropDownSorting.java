package myseleniumpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[text() ='Live Posting']")).click();

		WebElement drpelement = driver.findElement(By.name("category_id"));

		Select drpele = new Select(drpelement);
		List<WebElement> options = drpele.getOptions();

		ArrayList<String> originallist = new ArrayList<String>();
		ArrayList<String> templist = new ArrayList<String>();

		for (WebElement item : options) {
			originallist.add(item.getText());
			templist.add(item.getText());
		}

		System.out.println("Original list items :" +originallist);
		System.out.println("Temporary list items :" +templist);

		Collections.sort(templist);

		System.out.println("Original list items :" +originallist);
		System.out.println("Temporary list items :" +templist);

		if (originallist.equals(templist)) {
			System.out.println("DropDown Sorted");
		} else {
			System.out.println("DropDown Un-Sorted");

		}

	}

}
