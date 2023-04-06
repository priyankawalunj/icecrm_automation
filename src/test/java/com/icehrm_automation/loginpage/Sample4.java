package com.icehrm_automation.loginpage;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




	public class Sample4 {

//	    @BeforeSuite
//	    public void beforeSuite(){
//	        System.out.println("this is before suite from sample class");
//	    }
//
//	    @AfterSuite
//	    public void afterSuite(){
//	        System.out.println("this is after suite from sample class");
//	    }
//
//	    @BeforeTest
//	    public void beforeTest(){
//	        System.out.println("This is before test from sample class");
//	    }
//
//	    @AfterTest
//	    public void afterTest(){
//	        System.out.println("This is after test from sample class");
//	    }
//		
//
//	    @Test
//	    public void sample4Test1(){
//	        System.out.println("This is test1 from sample4 class");
//	    }
//	    @Test
//	    public void sample4Test2(){
//	        System.out.println("This is test2 from sample4 class");
//	    }
//	    @Test
//	    public void sample1Test3(){
//	        System.out.println("This is test3 from sample1 class");
//	    }
//	    @BeforeClass
//	    public void beforeClass(){
//	        System.out.println("Sample4 Before class");
//	    }
//	    @AfterClass
//	    public void afterClass(){
//	        System.out.println("Sample4 After class");
//	    }
//
//	    @BeforeMethod
//	    public void beforeMethod(){
//	        System.out.println("Sample4 Before method");
//	    }
//
//	    @AfterMethod
//	    public void afterMethod(){
//	        System.out.println("Sample4 after method");
//	    }
//	}
		//1st example for data provider
	@Test
    public void sample4Test1() {
        System.out.println("This is test1 from sample4 class");
        Object[][] obj = new Object[][]{
                {1,2},
                {3,4}
        };
        System.out.println(obj[0][0]);
        System.out.println(obj[0][1]);
        System.out.println(obj[1][0]);
        System.out.println(obj[1][1]);

    }
	//2st example for data provider
    @Test(dataProvider = "provider" )
    public void test2(int a, int b){
        System.out.println(a + " "+ b);
    }

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {1,2},
                {3,4}
        };
    }
  //3st example for data provider//1st example for data provider
    @DataProvider
    public Object[][] credentials(){
        return new Object[][]{
                {"username1", "password1"},
                {"username2", 123},
                {"username3", false},
                {"username4", ""},
                {"username5", null}
        };
    }
    @Test(dataProvider = "credentials")
    public void login(String username, Object password){
        System.out.println("username: "+ username + " and password: "+ password );
    }
  //4st example for data provider
    
     @DataProvider
    
    public Object [][] testData() {
    	Object[] []Data = new Object[][] {
    		{1,"Pune","City"},
    		{2,"Mumbai","city"},
    		{3,"Nagpur","City"},
    		{4,"Delhi","City"},
    		{5,"Goa","State"},
            {6,"Nashik","City"}
};
return Data;
    }
    @Test(dataProvider="testData")
    public void test3(int num,String City,String type) {
    	System.out.println("Num: "+num+" City: "+City+" type: "+type);
    }
	
	
	
  //5st example for data provider
@DataProvider
    public Object [][] arrayData() {
    	Object[] []Obj = new Object[][] {
    		{1, 4, 3, 4},
    		{3,55,67,23},
    		{55,67,23,980},
    	};
    	return Obj;
}
int sum=0;
@Test(dataProvider="arrayData")
public void test4(int a,int b,int c,int d) {
     sum =sum+(a+b+c+d);
	System.out.println(sum);
}
}


    
	
	
	

