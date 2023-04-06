package com.icehrm_automation.loginpage;


import com.icehrm_automation.utility.BaseClass1;
import com.icehrm_automation.utility.EmpDetails;
	import com.icehrm_automation.utility.ExcelUtil;
	import org.openqa.selenium.By;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
 
	//This example for  Get Data From Excel Through Single Object
	
	public class ExcelDtaTest extends BaseClass1 {

	    @DataProvider
	    public Object[][] getTestData() {
	        ExcelUtil excelUtil = new ExcelUtil();
	        String filePath = "C:/Automation tool/Testdata.xlsx";
	        String sheetName = "EmpDetails";
	        return excelUtil.getExcelData(filePath, sheetName);
	    }

	    @Test(dataProvider = "getTestData")
	    public void test(String username, String password) {
	        System.out.println(username + " " + password);
	    }

	    @DataProvider
	    public Object[][] getEmpData() {
	        ExcelUtil excelUtil = new ExcelUtil();
	        String filePath = "C:/Automation tool/Testdata.xlsx";
	        String sheetName = "TestData";
	        return excelUtil.getEmpData(filePath, sheetName);
	    }

	    @Test(dataProvider = "getEmpData")
	    public void empTest(EmpDetails empDetails) {
	        click(By.id("EmployeeMenu"));
	        click(By.id("add_new"));
	        enterText(By.id("empNum"), String.valueOf(empDetails.getId()));
	        enterText(By.id("firstName"), empDetails.getFirstName());
	        enterText(By.id("mname"), empDetails.getMiddleName());
	        enterText(By.id("lastName"), empDetails.getLastName());
	        click(By.id("save"));

	    }

	}

