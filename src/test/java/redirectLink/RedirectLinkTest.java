package redirectLink;

import pages.RedirectLinkPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectLinkTest extends BaseTests {
    @Test
    public void redirectLinkTest(){
        RedirectLinkPage redirectLinkPage=homePage.clickOnredirectLinkPage();

        redirectLinkPage.clickStatusCodePageLink();
        Assert.assertTrue(redirectLinkPage.checkURL());
    }
}