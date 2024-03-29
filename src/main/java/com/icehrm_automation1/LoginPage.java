package com.icehrm_automation1;

//Example for POM Framework Implementation and example LoginPage


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icehrm_automation.utility.BaseClass1;

public class LoginPage extends BaseClass1 {
    // Declare all the locators
    WebDriver driver;
//    By username = By.name("username");
//    By password = By.name("password");
//    By loginButton = By.xpath("//button[contains(text(), 'Log in')]");
    By restPasswordLink = By.xpath("//a[contains(text(),'Reset Password')]");
    public By errorMsg = By.xpath("//div[contains(@class, 'alert-danger')]");

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    public WebElement loginButton;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void login(String username, String password) {
//        enterText(this.username, username);
//        enterText(this.password, password);
//        click(loginButton);
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();
    }
    //Reusable methods for login module
}

