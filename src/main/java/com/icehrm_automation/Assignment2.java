package com.icehrm_automation;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement searchDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select =new Select(searchDropDown);
		select.selectByValue("search-alias=electronics");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@ id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(1000);
	int totalResult;
	List<WebElement> mobileResults=driver.findElements(By.xpath("//div[starts-with(@data-cel-Widget,'search_result_')]/descendant::h2//span[1]"));
	totalResult=mobileResults.size();
	System.out.println("totalResult: "+ totalResult);
			for(int i =3;i<=totalResult; i++) {
				try {
					String name = "//div[starts-with(@data-cel-Widget,'search_result')][" + i + "]/descendant::h2//span[1]";
					System.out.println(name);
					String price = "//div[starts-with(@data-cel-Widget,'search_result')]["+i+"]/descendant::span[@class='a-price-whole']";
					String mobileName =driver.findElement(By.xpath(name )).getText();
					String mobileprice =driver.findElement(By.xpath(price)).getText();
				System.out.println("price : "+mobileprice+ "Name: "+ mobileName);
				}catch(NumberFormatException a) {
			
				}
			}
	}
}
			
					
//	
//	// TODO Auto-generated method stub
//
//	}
		//Washing Machine display price 
//	         System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
//				WebDriver driver= new ChromeDriver();
//				
//				driver.get("https://www.amazon.in");
//				
//				Thread.sleep(5000);
//				
//				WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox")); 
//				
//				Select select = new Select(searchDropDown); 
//				
//				
//				select.selectByValue("search-alias=electronics"); 
//				
//				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Washing Machine");
//				
//				driver.findElement(By.id("nav-search-submit-button")).click();
//				
//				Thread.sleep(5000);
//				
//				
//				List<WebElement> wmResults= driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
//				
//				Thread.sleep(7000);
//				
//				int totalResult=wmResults.size();
//				System.out.println("Total Result"+totalResult);
//				for(int i=3; i<8; i++) {
//					try{
//						Thread.sleep(7000);
//					String nameXpath= "//div[starts-with(@data-cel-widget,'search_result_')]["+ i +"] /descendant::h2//span";
//						
//				 String priceXpath= "//div[starts-with(@data-cel-widget,'search_result_')]/descendant::span[@class=\"a-price-whole\"]";
//						
//						Thread.sleep(7000);
//						String wmName= driver.findElement(By.xpath(nameXpath)).getText();
//						String wmPrice= driver.findElement(By.xpath(priceXpath)).getText();
//						
//						String price= wmPrice.replaceAll("," , "");
//						Integer wmpriceRupee= Integer.parseInt(price);
//						//System.out.println(nameXpath);
//						//System.out.println(priceXpath);
//						System.out.println("Price: "+ wmpriceRupee + " Name " + wmName );
//						//if( wmpriceRupee>20000){
////							System.out.println("this is costly machine form listof results and its price"+ wmpriceRupee);
////						}
////						  else  
////						{
////							System.out.println("price of this machine is less than 20"+wmpriceRupee);
////						}
//					}
//					catch(NumberFormatException e)
//					{
//						System.out.println(e.getMessage());
//					}
//					}
//				}
//	}
	
//2assignment 
