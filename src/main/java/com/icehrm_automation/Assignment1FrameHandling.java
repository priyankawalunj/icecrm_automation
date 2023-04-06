package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.meesho.com/");
			String input ="watch";
			driver.switchTo().frame(driver.findElement(By.id("navbar-iframe")));
			driver.findElement(By.xpath("//div[@id=\"__next\"]/descendant ::div[8]/following-sibling::input")).sendKeys(input);
			driver.findElement(By.xpath("//div[@id=\"__next\"]/descendant ::div[8]")).click();
			driver.switchTo().defaultContent();
			 String output =driver.findElement(By.xpath("//div[@id=\"__next\"]/descendant ::h1")).getText();
			if(output.equals(input)) {
				System.out.println("Successfully able to verify watch text in the search result");
			}else {
					System.out.println(" unable to verify watch text in the search result");
				}

				}
	}


