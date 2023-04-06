package com.icehrm_automation.loginpage;

//This is Example for Cyber success  add new emp 


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass1;

public class Loginpage1  extends BaseClass1 {

	public static final By errorMsg1 = null;
	String empId ="102";
	String firstName ="Priyanka";
	String middleName="Mahesh";
	String LastName ="Shelke";
	String  Nationality="Indian";
	String  DateBirth ="02/02/2001";
	String Gender ="Female";
	String MaritalStatus="marride";
	String  Ethnicity="Alaska Native";
	 @BeforeMethod
  public void beforeMthode() {
	  System.out.println("This is launch browser method fron @BeforeMethod");
	 
    luanchBrowser("edge");
    driver.navigate().to("https://cybersuccess.icehrm.com/");
    enterText(By.id("username"),"admin");
    enterText(By.id("password"),"2zuzfakn");
    click(By.xpath("//button[contains( text(),\"Log in \")]"));
    click(By.xpath("//span[text()='Employees']"));
    click(By.xpath("//ul[@ id='admin_Employees']/li[1]/a"));
      }
  
  @Test
  public void AddEmp() throws InterruptedException {
	  System.out.println("This is AddEmp method from @Text");
	  click(By.xpath("//span[@aria-label='plus-circle']/following-sibling::span[1]"));
	  driver.findElement(By.xpath("//input[@id=\"employee_id\"]")).sendKeys("102");
	  driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("Priyanka");
	  driver.findElement(By.xpath("//input[@id=\"middle_name\"]")).sendKeys("Mahesh");
	  driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("Shelke");
	  Thread.sleep(3000);
//	//find xpath which have all drop down options
//	  List<WebElement>NationalityDropDownValues =driver.findElements(By.xpath("//input[@id=\"rc_select_0\"]")).click();
//	  for (int i=0;i<NationalityDropDownValues.size();i++) {
//		  WebElement NationalityElement =NationalityDropDownValues.get(i);
//		  String NationalityText =NationalityElement.getText();
//		  if (NationalityText.equals("Indian")) {
//			  System.out.println(NationalityText);
//			  NationalityElement.click();
//			  break;
//		  }
//		  
//	  }
//  }
	  //click(By.xpath("//input[@id=\"rc_select_0\"]"));
	 driver.findElement(By.xpath("//input[@id=\"rc_select_0\"]")).sendKeys("Indian");
	 driver.findElement(By.xpath("//input[@id=\"birthday\"]")).sendKeys("02/02/2001");
	 driver.findElement(By.xpath("//div[@label=\"Female\"]/div")).sendKeys("Female");
	 driver.findElement(By.xpath("//div[@label=\"Married\"]/div")).sendKeys("marride");
	  click(By.xpath("//div[@label=\"Alaska Native\"]/div"));
	  driver.findElement(By.xpath("//div[@label=\"Alaska Native\"]/div")).sendKeys("Alaska Native");
	  click(By.xpath("//span[text()='Save']"));
	  click(By.xpath("//span[contains ( text(),\"Next\")]"));
  }
	  


	@Test
  public void VarifyEmp() {
	  System.out.println("This is VarifyEmp method from @Text");

	   }
  
  
  @AfterMethod
  public void Aftermethod() {
	  System.out.println("This is method from @Aftermethod");
//	  click(By.xpath(Ethnicity));
//	  click(By.xpath(Ethnicity));
//	  click(By.xpath(Ethnicity));
	   }

  
  
 
  } 
