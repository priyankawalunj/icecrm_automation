package com.icehrm_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginTest {

	public static void main(String[] args) throws Exception  {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String dashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		if(dashboardText.equals("Dashboard")) {
			System.out.println("Successfully landed on the homepage on the application");
		}else {
			throw new Exception("Failed to login to application");
		}
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='reset']/following-sibling::button"));
	   if(searchButton.isDisplayed()) {
	    	System.out.println("Successfully able to navigate on pIM module");
	    }else {
	    	System.out.println("unable to navigate on PIM module");
	    }
	  boolean Alice = driver.findElement(By.xpath("//input[@type=\"checkbox\" and @ value=\"1\"]/following-sibling::span/i")).isSelected();
	   if(Alice=true) {
	    	System.out.println("select all check box is selected");
	    }else {
	    	System.out.println("select all cheackbox is not selected");
	    	
	    	// TODO Auto-generated method stub
	    }
	   driver.quit();
		}
	// TODO Auto-generated method stub
		}
	