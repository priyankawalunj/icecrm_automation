package com.icehrm_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobatClassExample {

	public static void main(String[] args) throws AWTException {
		//System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
	    //   WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.Edge.driver","C:/Automation tool/icehrm_automation/EdgeDriver.exe");
		WebDriver driver = new EdgeDriver();
			driver.get("https://cybersuccess.icehrm.com/");
			Actions actions =new Actions(driver);
			actions.contextClick(driver.findElement(By.xpath("//a[text()='Reset Password']"))).build().perform();
			Robot robat =new Robot();
			robat.keyPress(KeyEvent.VK_DOWN);
			robat.keyRelease(KeyEvent.VK_DOWN);
			robat.keyPress(KeyEvent.VK_ENTER);
			robat.keyRelease(KeyEvent.VK_ENTER);
			
			robat.mouseMove(200,400);
			
			// TODO Auto-generated method stub

	}

}
