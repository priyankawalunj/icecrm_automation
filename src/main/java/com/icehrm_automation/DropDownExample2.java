package com.icehrm_automation;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownExample2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(5000);
		String dashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		if(dashboardText.equals("Dashboard")) {
			System.out.println("Successfully landed on the homepage on the application");
		}else {
			throw new Exception("Failed to login to application");
		}
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='reset']/following-sibling::button"));
	   if(searchButton.isDisplayed()) {
	    	System.out.println("Successfully able to navigate on pIM module");
	    	if(searchButton.isEnabled()) {System.out.println("Search button is enable on the screen");
	    	}else {System.out.println("Search button is disabled on the screen");
	    	}
	   }else {
	    	System.out.println("unable to navigate on PIM module");
	    }
	   driver.findElement(By.xpath("//label[text()='Employment Status']/following::div[3]")).click();
	   List<WebElement> empstatusDropDowns= driver.findElements(By.xpath("//div[@role='listbox']//span"));
	   for(int i =0;i< empstatusDropDowns.size();i++) {
		   WebElement element= empstatusDropDowns.get(i);
		   String value=element.getText();
		   if(value.equals("part-time contract")) {
			   System.out.println(value);
			   element.click();
			   break;
		   } 
		   }
	   String selectedvalue=driver.findElement(By.xpath("//label[text()='Employment Status']/following::div[4]")).getText();
	   if (selectedvalue.equals("part-time contract")) {
		   System.out.println("Successfully able to select part-time-contract in Employee Status DropDown");
	   }else {
		   throw new Exception("Unable to select part-time-contract value in Employee Status DropDown");
	   }
	   driver.close();
	}
}
		// TODO Auto-generated method stub

	


