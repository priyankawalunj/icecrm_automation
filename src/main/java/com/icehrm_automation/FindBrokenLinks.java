package com.icehrm_automation;

import java.net.HttpURLConnection;
//import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {
         
	   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			List<WebElement>Links = driver. findElements(By.tagName("img"));
			//List<WebElement>Links = driver. findElements(By.tagName("a"));
				for(int i=0; i < Links.size(); i++){
			WebElement element=Links.get(i); 
				String url = element.getAttribute("src");
				//String url = element.getAttribute("href");
				Thread.sleep(2000);
				if(url!=null && !url.equals("javascript: void(0)")) {
					try {
						URL uri = new URL(url);
						URLConnection urlConnection =uri.openConnection();
						HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
						httpURLConnection.connect();
						int statusCode =httpURLConnection.getResponseCode();
						if( statusCode >=300) {
							System.out.println("Broken Url : " + " statusCode:" + statusCode +"Url: "+ url);
							}
						httpURLConnection.disconnect();
						
					}catch (Exception ignored) {
				}
				}
	}
	//driver.close();
//}
	}
}
