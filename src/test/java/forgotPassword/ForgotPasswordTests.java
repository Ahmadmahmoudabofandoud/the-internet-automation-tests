package forgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests
{
    @Test
    public void forgotPasswordTest(){
        ForgotPasswordPage forgotPasswordPage=homePage.clickForgotPasswordLink();

        forgotPasswordPage.enterEmail("test@example.us");
        forgotPasswordPage.clickRecivePasswordButton();
        Assert.assertTrue(forgotPasswordPage.checkErrorMsgContent());
    }
}