package com.orangehrm_automation;

import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseClass1;

public class MyInfopage extends BaseClass1 {
	public By myInfoMenu =By.xpath("//span[text()='My info']");
	public By profileImg =By.xpath("//img[@class='employee-image']");
	public By addImg =By.xpath("//i[@class='oxd-icon bi-plus']");
	public By saveButton =By.xpath("//button[@type='submit']");

}
