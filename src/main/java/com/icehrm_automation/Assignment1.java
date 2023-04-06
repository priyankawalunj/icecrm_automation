package com.icehrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Automation tool/icehrm_automation/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
		driver.get("https://cybersuccess.icehrm.com/");
		WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
      WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		loginButton.click();
       String homeText = driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();

		System.out.println(homeText);

		if (homeText.equals("Home")) {
			System.out.println("Home Page is displayed");
		} else

		{
			System.out.println("failed to login to application");
		}

		WebElement selectemployees = driver.findElement(By.xpath("//span[text()='Employees']"));
		selectemployees.click();

		List<WebElement> employeesdropdownvalues = driver
				.findElements(By.xpath("//ul[@id=\"admin_Employees\"]/li/a[1]"));
		for (int i = 0; i < employeesdropdownvalues.size(); i++) {
			WebElement element = employeesdropdownvalues.get(i);
			String value = element.getText();

			if (value.equals("Employees")) {
				System.out.println(value);
				element.click();
				break;
			}
		}

		Thread.sleep(2000);

		WebElement selectAddNewButton = driver
				.findElement(By.xpath("//span[@aria-label='plus-circle']/following-sibling::span[1]"));
		selectAddNewButton.click();

		WebElement employeeno = driver.findElement(By.id("employee_id"));
		employeeno.sendKeys("1234567891");

		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Priyanka");

		WebElement middlename = driver.findElement(By.id("middle_name"));
		middlename.sendKeys("Mahesh");

		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Shelke");

		WebElement selectnationality = driver.findElement(By.xpath("//input[@id='rc_select_0']"));

		selectnationality.click();
		selectnationality.sendKeys("Indian");
		
		Thread.sleep(1000);

		List<WebElement> nationalitydropdownvalues = driver
				.findElements(By.xpath("//div[@id='rc_select_0_list']/following-sibling::div/div/div/div/div/div"));
		for (int i = 0; i < nationalitydropdownvalues.size(); i++) {
			WebElement element = nationalitydropdownvalues.get(i);
			String value = element.getText();
//					if(value.equals("Austria")) {
//						element.click();
//						break;	
//					}
			element.click();
			break;
		}

		System.out.println("Nationality is selected");

		WebElement selectGender = driver.findElement(By.xpath("//input[@id='rc_select_1']"));
		selectGender.click();
		selectGender.sendKeys("Female");

		Thread.sleep(1000);

		List<WebElement> genderdropdownvalues = driver.findElements(By.xpath("//div[@label='Female']/div"));
		for (int i = 0; i < genderdropdownvalues.size(); i++) {
			WebElement element = genderdropdownvalues.get(i);
			String value = element.getText();
			element.click();
			break;
		}

		System.out.println("Gender is selected");

		WebElement selectMaritalStatus = driver.findElement(By.xpath("//input[@id='rc_select_2']"));
		selectMaritalStatus.click();
		selectMaritalStatus.sendKeys("marride");

		Thread.sleep(1000);

		List<WebElement> MaritalStatusdropdownvalues = driver.findElements(By.xpath("//div[@label='Married']/div"));
		for (int i = 0; i < MaritalStatusdropdownvalues.size(); i++) {
			WebElement element = MaritalStatusdropdownvalues.get(i);
			String value = element.getText();
			element.click();
			break;
		}

		System.out.println("Marital Status is selected");

		WebElement selectEthnicity = driver.findElement(By.xpath("//input[@id='rc_select_3']"));
		selectEthnicity.click();
		selectEthnicity.sendKeys("Alaska Native");

		Thread.sleep(1000);

		List<WebElement> Ethnicitydropdownvalues = driver.findElements(By.xpath("//div[@label='Alaska Native']/div"));
		for (int i = 0; i < Ethnicitydropdownvalues.size(); i++) {
			WebElement element = Ethnicitydropdownvalues.get(i);
			String value = element.getText();
			element.click();
			break;
		}

		System.out.println("Ethnicity is selected");

		WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']"));
		saveButton.click();

		Thread.sleep(3000);

		String errorMessage = driver.findElement(By.xpath("//div[text()='Date of Birth: is required']")).getText();
		System.out.println(errorMessage);

		if (errorMessage.equals("Date of Birth: is required")) {
			System.out.println("Test Case is Passed");
		} else {
			System.out.println("Test Case is Failed");
		}

		driver.close();

	}

}
