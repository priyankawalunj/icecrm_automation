package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cybersuccess.icehrm.com/");
		//Thread.sleep(2000);
				//driver.navigate().to("https://www.amazon.in/");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("Window.scrollBy(0, 500)");       //scroll down by 500px
			//	js.executeScript("Window.scrollBy(0, -500)");       //scroll up by 500px
////java Script to scroll page at bottom
				//js.executeScript("Window.scrollBy(0,document.bady.scrollHeight)");
				WebElement usernameText =driver.findElement(By.xpath("//form[@id=\"loginForm\"]/descendant::div[1]/label"));
////get the text present  on provide element through javascript in object
				Object  value =js.executeScript("return document.getElementById('placeholder').value",usernameText);
				String text =(String)value;
				System.out.println(text);
				WebElement username =driver.findElement(By.id("username"));
				js.executeScript("argument[0].value='admin'",username);
				WebElement password =driver.findElement(By.id("password"));
				js.executeScript("argument[0].value='2zUzfakh'",password);
				WebElement loginButton =driver.findElement(By.id("loginButton"));
				js.executeScript("argument[0].click();",loginButton);

				}

	//private void executeScript(String string, WebElement username) {
		// TODO Auto-generated method stub
		
	}


