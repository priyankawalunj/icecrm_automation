package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.redbus.in/");
		//driver.findElement(By.xpath("//a[@id=\"redRail\"]")).click();
		//driver.navigate().refresh();
		//driver.navigate().back();
		//driver.navigate().forward();
		// TODO Auto-generated method stub

	//}

//}
//System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.navigate().to("https://www.amazon.in/");
//driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
//driver.navigate().refresh();
//driver.navigate().back();
//driver.navigate().forward();
//// TODO Auto-generated method stub
//
//}
//}

     System.setProperty("webdriver.edge.driver","C:/Automation tool/icehrm_automation/msedgedriver.exe");
     WebDriver driver= new EdgeDriver();
   driver.navigate().to("https://www.redbus.in/");
    driver.findElement(By.xpath("//a[@id='redRail']")).click();
    driver.navigate().refresh();
    driver.navigate().back();
    driver.navigate().forward();
// TODO Auto-generated method stub
	}
}