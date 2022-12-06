package resources.propertiesfile.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.propertiesfile.demo.testbase.BaseTest;

public class ForgotPasswordTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
       loginPage.clickOnForgotPasswordLink();
       String expectedForgotPasswordText = "Reset Password";
       String actualForgotPasswordText = forgotPasswordPage.getTextFromResetPasswordMessage();
       Assert.assertEquals(actualForgotPasswordText,expectedForgotPasswordText,"Reset Password Not Displayed");
    }
}
