
package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.util.List;

public class DatePickerExample1 {
	
	static WebDriver driver;
	
	public static void selectDayFromCalender(int futureDay) throws InterruptedException {
		driver.findElement(By.id("onward_cal")).click();
		List<WebElement> days = driver.findElements(By.xpath("//td[@class=\"current day\" or @class=\"wd day\" or @class=\"we day\"]"));
		int currentDay = LocalDateTime.now().getDayOfMonth();
		System.out. println(currentDay);
		int dateToSelect =currentDay + futureDay;
		System.out. println(dateToSelect);
		for (WebElement element : days) {
			String day =element.getText();
           String selecteday =String.valueOf(dateToSelect);
           System.out.println( "1-" +selecteday);
           Thread.sleep(2000);
			if (day.equals(selecteday)) {
			element.click();
			System.out.println(selecteday);
				break;
			}
		}
	}
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(2000);
		selectDayFromCalender(8);
	}
		
		// TODO Auto-generated method stub

	}


