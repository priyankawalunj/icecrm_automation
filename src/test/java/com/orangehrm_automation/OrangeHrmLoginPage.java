package com.orangehrm_automation;

import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseClass1;

public class OrangeHrmLoginPage extends BaseClass1 {

	By username = By.name("username");
	By password  = By.name("password");
	By loginButton = By.xpath("//button[@type='submit']");
	public void login (String username , String password) {
		enterText(this.username,username);
		enterText(this.password,password);
		click(loginButton);
	}

}
