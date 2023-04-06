package com.icehrm_automation.loginpage;
//example form POM Implementation in Employee Search test and EmployeePage 
import com.icehrm_automation.utility.BaseClass1;
import com.icehrm_automation.utility.PropertyHandling;
import com.icehrm_automation1.EmployeePage;
import com.icehrm_automation1.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import java.util.ArrayList;
	import java.util.List;

	public class EmployeeTest extends BaseClass1 {
	    PropertyHandling property;
	    LoginPage loginPage;
	    EmployeePage employeePage;

	    @BeforeClass
	    public void beforeClass() {
	        property = new PropertyHandling();
	        luanchBrowser(property.getproperty("browser"));
	        driver.get(property.getproperty("icehrmUrl"));
	        loginPage = new LoginPage(driver);
	        employeePage = new EmployeePage();
	        String username = property.getproperty("icehrmUsername");
	        String password = property.getproperty("icehrmPassword");
	        loginPage.login(username, password);
	    }

	    
		

		@Test
	    public void verifySearchEmp() throws InterruptedException {
	        click(employeePage.employeeMenu);
	        click(employeePage.empSubMenu);
	        waitUntilElementIsClickable(employeePage.searchButton);
	        List<String> allEmpFNames = new ArrayList<>();
	        Thread.sleep(5000);
	        List<WebElement> allEmpDetails = driver.findElements(employeePage.allEmpInfo);
	        for (WebElement element : allEmpDetails) {
	            String firstName = element.getText();
	            allEmpFNames.add(firstName);
	        }
	        String lastEmpName = allEmpFNames.get(allEmpDetails.size() - 1);
	        enterText(employeePage.searchBox, lastEmpName);
	        click(employeePage.searchButton);
	        Thread.sleep(5000);
	        List<WebElement> searchEmpDetails = driver.findElements(employeePage.allEmpInfo);
	        for (WebElement element : searchEmpDetails) {
	            String firstName = element.getText();
	            Assert.assertEquals(firstName, lastEmpName);
	        }
	    }

	    private void waitUntilElementIsClickable(By searchButton) {
			// TODO Auto-generated method stub
			
		}

		@AfterClass
	    public void afterClass() {
	        driver.close();
	    }

	}

