package com.icehrm_automation;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import net.bytebuddy.implementation.EqualsMethod;

public class DropDownOperations {
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//			driver.get("https://www.amazon.in/");
//		Thread.sleep(5000);
//		WebElement searchDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//		Select select =new Select(searchDropDown);
//		select.selectByValue("search-alias=computers");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@ id='twotabsearchtextbox']")).sendKeys("Dell keyboard");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//	String dellkeybordText= driver.findElement(By.xpath("//span[contains (text(),'1-24 of 134 results for') ]/following-sibling::span[2]")).getText();
//		
//	    if(dellkeybordText.equals(dellkeybordText)); {
//		System.out.println(dellkeybordText);
//		}
//	    else
//		{
//			System.out.println("Dell keyboard Page not dispay");	
//		}
//	    driver.quit();
//		}
//	}		
		//WebElement searchDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//			Select select =new Select(searchDropDown);
//			select.selectByIndex(16);
//			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
//			driver.findElement(By.id("nav-search-submit-button")).click();
//		}
//			// TODO Auto-generated method stub
//		}
	// TODO Auto-generated method stub
//	System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.amazon.in/");
	//Thread.sleep(5000);
	//WebElement searchDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	//Select select =new Select(searchDropDown);
	//select.selectByIndex(14);
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell keyboard");
	//driver.findElement(By.id("nav-search-submit-button")).click();
//	WebElement DropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//	Select select1 =new Select(DropDown);
//	select1.selectByVisibleText("Computers & Accessories");
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell keyboard");
//	driver.findElement(By.id("nav-search-submit-button")).click();


// 2     System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
//       WebDriver driver = new ChromeDriver();
//       driver.get("https://www.amazon.in/");
//   WebElement searchDropDown=driver.findElement(By.id("searchDropDown"));
//   Select select = new Select(searchDropDown);
//   List<WebElement>DropDownvalues=select.getOptions();
//   for(int i=0;i<DropDownvalues.size();i++) {
//	 WebElement element=DropDownvalues.get(i);
//	 String dropdownvalue=element.getText();
//	 System.out.println(dropdownvalue);
//   }
//	}
//}
      driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
      WebElement multiselectDropDown=driver.findElement(By.xpath("//section[@id='section-basic-example']/section[1]//select"));
      Select select1 = new Select(multiselectDropDown);
      List<WebElement>multiselectDropDownvalue =select1.getOptions();
      for(int i=0;i<multiselectDropDownvalue.size();i++) {
	  WebElement element=multiselectDropDownvalue.get(i);
	  String dropdownvalue=element.getAttribute("value");
	  System.out.println(dropdownvalue);
   }
      System.out.println("printing all select values from dropdown");
	


List<WebElement> selectedOptions= select1.getAllSelectedOptions();
for(int i=0;i< selectedOptions.size();i++) {
WebElement element=selectedOptions.get(i);
String selectedvalue=element.getAttribute("value");
System.out.println( selectedvalue);

}

}
	
}
	

		

	
   


//section[@id='section-basic-example']/following::div[4]//input[1]















