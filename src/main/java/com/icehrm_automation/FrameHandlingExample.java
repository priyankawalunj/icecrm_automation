package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		String input ="Selenium";
		driver.switchTo().frame(driver.findElement(By.id("navbar-iframe")));
		driver.findElement(By.id("b-query")).sendKeys(input);
		driver.findElement(By.id("b-query-icon")).click();
		driver.switchTo().defaultContent();
		String output =driver.findElement(By.xpath("//div[@class=\"status-msg-body\"]/b")).getText();
		if(output.equals(input)) {
			System.out.println("Successfully able to verify selenium text in the search result");
		}else {
				System.out.println(" unable to verify selenium text in the search result");
			}

			}
				}


