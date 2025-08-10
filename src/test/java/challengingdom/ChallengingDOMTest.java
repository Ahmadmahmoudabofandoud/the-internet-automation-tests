package challengingdom;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChallengingDOMPage;

public class ChallengingDOMTest extends BaseTests {

    @Test
    public void verifyChallengingDOMPage() {
        ChallengingDOMPage challengingDOMPage = homePage.clickOnChallengingDOMPage();

        Assert.assertTrue(challengingDOMPage.isTableDisplayed(), "Table should be visible");

        challengingDOMPage.clickBlueButton();
        challengingDOMPage.clickRedButton();
        challengingDOMPage.clickGreenButton();
    }
}
