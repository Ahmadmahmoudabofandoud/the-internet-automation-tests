package login;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage =homePage.clickOnFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureArea secureArea =loginPage.clickOnLoginButton();
        assertTrue(secureArea.getText().contains("You logged into a secure area!"),"The Messsage is InCorrect");
    }
}