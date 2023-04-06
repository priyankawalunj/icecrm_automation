package com.orangehrm_automation;

//Example for POM Framework Implementation and example LoginPage



import com.icehrm_automation.loginpage.Loginpage1;
import com.icehrm_automation.utility.BaseClass1;
import com.icehrm_automation.utility.PropertyHandling;
import com.icehrm_automation1.LoginPage;

import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class LoginTest4 extends BaseClass1 {
	    PropertyHandling property;
	    LoginPage loginPage1;
	    @BeforeClass
	    public void start() throws Exception {
	        property = new PropertyHandling();
	        luanchBrowser(property.getproperty("browser"));
	        driver.get(property.getproperty("icehrmUrl"));
	        loginPage1 = new LoginPage(driver);
	    }
	    @Test(dataProvider = "getLoginData")
	    public void verifyLogin(String username, String password, String errorMsg) throws Exception {
	    	log.info("Running login scenrio for :"+ username+""+ password);
	    	try {
	    		 loginPage1.login(username, password);	
	    		throw new Exception("This is sample exception");
	    }catch (Exception e) {
	    	log.fail(e);
	    }
	      
//	        if (!username.isEmpty() && !password.isEmpty()) {
//	            String errorMessage = driver.findElement(loginPage1.errorMsg).getText();
//	            Assert.assertEquals(errorMessage, errorMsg);
//	        }
	    }
	    @DataProvider
	    public Object[][] getLoginData() {
	        Object[][] data = new Object[][]{
	                {"admin123", "admin", "Login failed"},
	                {"admin", "admin124", "Login failed"},
	                {"admin123", "2zuzfakn", "Login failed"},
	                {"", "", ""},
	                {"", "2zuzfakn", ""},
	                {"admin", "", ""}
	        };
	        return data;
	    }
	    
	}

