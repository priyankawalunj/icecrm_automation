package com.icehrm_automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.navigate().to("https://www.amazon.in/");
				Thread.sleep(2000);
				String parentWindowId = driver.getWindowHandle();// return the id of current window
				System.out.println("First Tab ID:" + parentWindowId);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@id=\"navSwmHoliday\"]/a")).click();
				Set<String> allIDs = driver.getWindowHandles();
				System.out.println("Print all window ID's ");
				for(String id : allIDs) {
					if(!id.equals(parentWindowId)) {
						System.out.println("Second Tab ID:" + id);
						driver.switchTo().window(id);
						System.out.println("Control switched from first tab to second tab");
						String secondTabTitle=driver.getTitle();
						System.out.println("second Tab Title" + secondTabTitle);
						List<WebElement> links = driver.findElements(By.tagName("a"));//get all elements for weblink always refer tagname "a"
						for(int i=0; i<links.size(); i++) {
							WebElement element = links.get(i);//
							String url = element.getAttribute("href");
							if(url!=null && !url.equals("javascript: void(0)")) {
								try {	
									URL a =new URL(url);
									URLConnection b= a.openConnection();
									HttpURLConnection c = (HttpURLConnection)b;
									c.connect();
									int statusCode = c.getResponseCode();
									if(statusCode>=300) {
										System.out.println("Broken URL: " + "status code" + statusCode +"URL: "+url);
									}
									c.disconnect();
									}
								catch (Exception ignored) {
										
									}
							}
						}
				driver.close();
				    }
				}
				driver.switchTo().window(parentWindowId);
				String firstTabTitle= driver.getTitle();
				System.out.println("Control switched from second tab to first tab");
				System.out.println("Second Tab ID:" + firstTabTitle);
				driver.quit();

			}
}
	
