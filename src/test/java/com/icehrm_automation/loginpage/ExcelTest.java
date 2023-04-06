package com.icehrm_automation.loginpage;

//get the data fom excel  multiple paramete,Get Excel Data Through Data Providerr

	import com.icehrm_automation.utility.ExcelUtil;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class ExcelTest {
	    @DataProvider
	    public Object [][]  getTestData() throws InterruptedException{
	        ExcelUtil excelUtil = new ExcelUtil();
	        String filePath = "C:/Automation tool/Testdata.xlsx";
	        
	        String sheetName = "EmpDetails";
	        return excelUtil.getExcelData(filePath, sheetName);
	    }

	    @Test(dataProvider = "getTestData")
	    public void test(String username, String password){
	        System.out.println(username + " "+ password);
	    }

	}

