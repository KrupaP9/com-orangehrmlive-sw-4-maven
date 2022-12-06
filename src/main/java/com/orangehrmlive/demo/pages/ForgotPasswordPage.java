package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By resetPasswordText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");
    public String getTextFromResetPasswordMessage(){
        return getTextFromElement(resetPasswordText);
    }
}
