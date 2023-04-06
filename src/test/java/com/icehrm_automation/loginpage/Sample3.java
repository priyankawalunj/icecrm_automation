package com.icehrm_automation.loginpage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



	public class Sample3 {

	    @BeforeSuite
	    public void beforeSuite(){
	        System.out.println("this is before suite from sample class");
	    }

	    @AfterSuite
	    public void afterSuite(){
	        System.out.println("this is after suite from sample class");
	    }

	    @BeforeTest
	    public void beforeTest(){
	        System.out.println("This is before test from sample3 class");
	    }

	    @AfterTest
	    public void afterTest(){
	        System.out.println("This is after test from sample3 class");
	   }
		

	    @Test
	    public void sample3Test1(){
	        System.out.println("This is test1 from sample3 class");
	    }
	    @Test
	    public void sample3Test2(){
	        System.out.println("This is test2 from sample3 class");
	    }
	    @Test
	    public void sample3Test3(){
	        System.out.println("This is test3 from sample3 class");
	    }
	    @BeforeClass
	    public void beforeClass(){
	        System.out.println("Sample1 Before class");
	    }
	    @AfterClass
	    public void afterClass(){
	        System.out.println("Sample1 After class");
	    }

	    @BeforeMethod
	    public void beforeMethod(){
	        System.out.println("Sample3 Before method");
	    }

	    @AfterMethod
	    public void afterMethod(){
	        System.out.println("Sample3 after method");
	    }
	}

