package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) throws InterruptedException {
//example 1		
		 //WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://realestateautomation.agilecrm.com/login");
		driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@value='sing In']"));
		WebElement restPasswordLink =driver.findElement(By.linkText("Reset Password"));
		Actions actions=new Actions(driver);
		actions.doubleClick(restPasswordLink).build().perform();
	
	}
//}


//example 2
//        System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
//      WebDriver driver = new ChromeDriver();
//      driver.get("https://realestateautomation.agilecrm.com/");
//        driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
//      driver.findElement(By.name("password")).sendKeys("Test1234");
//      driver.findElement(By.xpath("//input[@value='sing In']")).click();
//      Thread.sleep(3000);
//      driver.findElement(By.id("dealsmenu")).click();
//      Thread.sleep(5000);
//      WebElement src =driver.findElement(By.xpath("//a[contains(text(),'ABCD']"));
//      WebElement dst =driver.findElement(By.xpath("//div[@id='prospect']//li[1]"));
//      Actions actions=new Actions(driver);
//       actions.clickAndHold(src).release(dst).build().perform();
//		
//		// TODO Auto-generated method stub
//		
//
//	}
//
//}
//Example3
    //System.out.println("Home page display");
    //actions.contextClick().build().perform(); 
           //System.out.println("context display");
   // actions.moveToElement (driver.findElement(By.xpath("//button[contains(text(),'Log in ')]"))).build().perform();
          //System.out.println("click on login button");
	}
//}