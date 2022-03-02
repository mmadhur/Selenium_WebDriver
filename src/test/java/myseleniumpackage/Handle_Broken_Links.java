package myseleniumpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Broken_Links {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
			int broken_links = 0;
		for (WebElement link : links) 
		{
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty()) 
			{
				System.out.println("url is empty");
				continue;
			}
			
			try {
				URL lnk = new URL(url);
				try {
					HttpURLConnection httpcon = (HttpURLConnection) lnk.openConnection();
					httpcon.connect();
					if(httpcon.getResponseCode() >= 400)
					{
						System.out.println(httpcon.getResponseCode() +"" + url +""+ " is Broken Link");
						broken_links++;
					}
					else
					{
						System.out.println(httpcon.getResponseCode() + url + "is" + "Valid Link");
					}
					System.out.println("Number of broken links are :" +broken_links);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
