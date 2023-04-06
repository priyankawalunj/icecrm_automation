package com.icehrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.Edge.driver","C:/Automation tool/icehrm_automation/EdgeDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://cybersuccess.icehrm.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
	    WebElement loginButton= driver.findElement(By.xpath("//form[@ id='loginForm']/child::div[4]/button"));
		loginButton.click();
		
		String homeText = driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();
	System.out.println(homeText);
	
	if (homeText.equals("Home")) {
		System.out.println("Test Case is passed");
		} else {
	System.out.println("failed to login to application");
		// throw new Exception("failed to login to application");
		}
	// verify login feature with invalid username1 and password1
		driver.findElement(By.xpath("//i[@class=\"caret\"]/parent::span")).click();
		driver.findElement(By.xpath("//a[contains (text(),\"Sign out\")]")).click();
		Thread.sleep(2000);
		WebElement username1 = driver.findElement(By.id("username"));
		username1.sendKeys("fdfdf");
		WebElement password1= driver.findElement(By.id("password"));
		password1.sendKeys("12t482384");
	    WebElement loginButton1= driver.findElement(By.xpath("//form[@ id='loginForm']/child::div[4]/button"));
   loginButton1.click();
		if (homeText.equals("Home")) {
		System.out.println("Test Case is passed");
		} else {
		System.out.println("failed to login to application");
		// throw new Exception("failed to login to application");
		}
		Thread.sleep(2000);
		// verify login feature with valid username2 and invalid password2
		driver.findElement(By.xpath("//i[@class=\"caret\"]/parent::span")).click();
		driver.findElement(By.xpath("//a[contains (text(),\"Sign out\")]")).click();
		WebElement username2 = driver.findElement(By.id("username"));
	    username2.sendKeys("admin");
	    WebElement password2= driver.findElement(By.id("password"));
		password2.sendKeys("12t482384");
	    WebElement loginButton2= driver.findElement(By.xpath("//form[@ id='loginForm']/child::div[4]/button"));
	    loginButton2.click();
		if (homeText.equals("Home")) {
		System.out.println("Test Case is passed");
		} else {
	    System.out.println("failed to login to application");
		// throw new Exception("failed to login to application");
		}
		Thread.sleep(2000);
	// verify login feature with invalid username3 and invalid password3
		driver.findElement(By.xpath("//i[@class=\"caret\"]/parent::span")).click();
		driver.findElement(By.xpath("//a[contains (text(),\"Sign out\")]")).click();
		WebElement username3 = driver.findElement(By.id("username"));
		username3.sendKeys("");
		WebElement password3= driver.findElement(By.id("password"));
		password3.sendKeys("");
	    WebElement loginButton3= driver.findElement(By.xpath("//form[@ id='loginForm']/child::div[4]/button"));
     loginButton3.click();
		if (homeText.equals("Home")) {
		System.out.println("Test Case is passed");
		} else {
		System.out.println("failed to login to application");
		// throw new Exception("failed to login to application");
		}
	}
}

		
