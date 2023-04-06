package com.icehrm_automation.loginpage;


//This Example for LoginPage Test Cases

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass1;


	
	public class LoginTest2 extends BaseClass1{
	    @BeforeClass
	    public void beforeClass(){
	        System.out.println("This is before class method");
	        // launch the browser and navigate to ice hrm application
	        luanchBrowser("chrome");
	        driver.navigate().to("https://cybersuccess.icehrm.com/");
	    }
	    @AfterClass
	    public void afterClass(){
	        System.out.println("This is after class method");
	        // close the browser instance
	        driver.close();
	    }
	
	    @Test
	    public void verifyLoginWithValidCred(){
	        System.out.println("This is add emp test method");
	        // login to application
	        // logout from application
	        enterText(By.name("username"), "admin");  // enter the username
	        enterText(By.name("password"), "2zuzfakn");  // enter password
	        click(By.xpath("//button[contains( text(),\"Log in \")]")); // click on login button
	       String homepage =driver.getTitle();
	        // verify login successfully
	     //   click(By.xpath("//div[@ class=\"pull-right\"]/a")); // logout from application
	    }
	
	    @Test
	    public void verifyLoginWithInvalidUsername() throws Exception {
	        enterText(By.name("username"), "test1234");  // enter invalid username
	        enterText(By.name("password"), "password");  // enter valid password
	        click(By.xpath("//button[contains( text(),\"Log in \")]")); // click on login
	        String errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText(); // get the error message
	       System.out.println(errorMsg);
	        if(errorMsg.equals("Login failed")){
	            System.out.println("Passed the test case for invalid username and valid password");
	        }else{
	            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
	        }
	    }

	    @Test
	    public void verifyLoginWithInvalidPassword() throws Exception {
	        enterText(By.name("username"), "admin");  // enter invalid username
	        enterText(By.name("password"), "test134");  // enter valid password
	        click(By.id("//button[contains( text(),\"Log in \")]")); // click on login
	        String errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText(); // get the error message
	        if(errorMsg.equals(" Login failed")){
	            System.out.println("Passed the test case for invalid username and valid password");
	        }else{
	            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
	        }
	    }
	    @Test
	    public void verifyLoginWithBlankusernamepassword() throws Exception {
	        enterText(By.name("username"), "");  // enter invalid username
	        enterText(By.name("password"), "");  // enter valid password
	        click(By.xpath("//button[contains( text(),\"Log in \")]")); // click on login
	        String errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText(); // get the error message
	        if(errorMsg.equals(" Login failed")){
	            System.out.println("Passed the test case for invalid username and valid password");
	        }else{
	            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
	        }
	    }
	    @Test
	    public void verifyLoginWithusernamespecialcherpassword() throws Exception {
	        enterText(By.name("username"), "admin");  // enter invalid username
	        enterText(By.name("password"), "$%#@&*");  // enter valid password
	        click(By.xpath("//button[contains( text(),\"Log in \")]")); // click on login
	        String errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText(); // get the error message
	        if(errorMsg.equals(" Login failed")){
	            System.out.println("Passed the test case for invalid username and valid password");
	        }else{
	            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
	        }
	    }
	    @Test
	    public void verifyLoginWithspecialcharusernamepassword() throws Exception {
	        enterText(By.name("username"), "$%#@&*");  // enter invalid username
	        enterText(By.name("password"), "2zuzfakn");  // enter valid password
	        click(By.xpath("//button[contains( text(),\"Log in \")]")); // click on login
	        String errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText(); // get the error message
	        if(errorMsg.equals(" Login failed")){
	            System.out.println("Passed the test case for invalid username and valid password");
	        }else{
	            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
	        }
	    }
	    @Test
	    public void verifyLoginWithusernamenumberpassword() throws Exception {
	        enterText(By.name("username"), "admin");  // enter invalid username
	        enterText(By.name("password"), "12345536xyzer");  // enter valid password
	        click(By.xpath("//button[contains( text(),\"Log in \")]")); // click on login
	        String errorMsg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText(); // get the error message
	        if(errorMsg.equals(" Login failed")){
	            System.out.println("Passed the test case for invalid username and valid password");
	        }else{
	            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
	        }
	    }
	    @Test
	@AfterClass
	public void afterclass() {
		System.out.println("This is a Afterclass");
	}
	}
//}
