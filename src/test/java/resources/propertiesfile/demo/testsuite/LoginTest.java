package resources.propertiesfile.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.propertiesfile.demo.testbase.BaseTest;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
    loginPage.sendTextToUsernameField();
    loginPage.sendTextToPasswordField();
    loginPage.clickOnLoginButton();
    String expectedSuccessfullyLoggedInMessage = "Dashboard";
    String actualSuccessfullyLoggedInMessage = homePage.getTextFromDashboardMessage();
    Assert.assertEquals(actualSuccessfullyLoggedInMessage,expectedSuccessfullyLoggedInMessage,"Dashboard Message Not Displayed");
    }
}
