package com.icehrm_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		System.out.println("first Tab Tittle : "+driver.getTitle());
		String FirstTabId =driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("Second Tab Tital : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(FirstTabId);
		System.out.println("Switched control back to frist tab and Tital : "+driver.getTitle());
		driver.close();
		
	}

}
