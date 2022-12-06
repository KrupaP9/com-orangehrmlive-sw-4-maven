package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By forgotPasswordLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");

    public void sendTextToUsernameField(){
        sendTextToElement(usernameField, PropertyReader.getInstance().getProperty("validUsername"));
    }
    public void sendTextToPasswordField(){
        sendTextToElement(passwordField,PropertyReader.getInstance().getProperty("validPassword"));
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);
    }

}
