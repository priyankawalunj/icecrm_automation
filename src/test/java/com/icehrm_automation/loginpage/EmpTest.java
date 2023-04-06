package com.icehrm_automation.loginpage;


// Example for Property Handling Implementation

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass1;
import com.icehrm_automation.utility.PropertyHandling;

public class EmpTest extends BaseClass1 {

	PropertyHandling propertyHandling;
	
@BeforeClass
public void before () {
	propertyHandling =new PropertyHandling();
}
@Test
public void login () {
	String url =PropertyHandling.getproperty("https://cybersuccess.icehrm.com");
	luanchBrowser("chrome");
	driver.navigate().to(url);
	String username =propertyHandling.getproperty("icehrmUsername");
	enterText(By.name("username"),username);
	String password =propertyHandling.getproperty("icehrmPassword");
	enterText(By.name("Password"),password);
	click(By.xpath("//button[@type='Submit']"));
	}
@Test
public void test() {
	String url =PropertyHandling.getproperty("icehrmUrl");
	System.out.println(url);
}
}

