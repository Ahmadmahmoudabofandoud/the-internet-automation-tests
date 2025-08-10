package ab;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ABTestingPage;

public class ABTest extends BaseTests {

    @Test
    public void verifyABTestPageContent(){
        ABTestingPage abPage=homePage.clickOnABTesting();
        Assert.assertTrue(abPage.checkTitleContent(), "AB Testing page title or content is not as expected.");
    }
}