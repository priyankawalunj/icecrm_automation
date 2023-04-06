package com.icehrm_automation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitexample {
			// TODO Auto-generated constructor stub
	
	public void fluentwait(WebDriver driver,By by) {
		Wait<WebDriver>Wait =new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery (Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
	
	Wait.until((d)-> {
		System.out.println("verifing element to available for operation");
		return d.findElement(by);
		});
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.navigate().to("https://www.amazon.in/");
			//	SeleniumWaitsExample obj =new SeleniumWaitsExample();
				//obj.fluentwait( driver,By .id("searchDropdownBox"));
		// TODO Auto-generated method stub

	}

}
