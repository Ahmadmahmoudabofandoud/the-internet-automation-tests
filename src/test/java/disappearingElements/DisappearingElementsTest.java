package disappearingElements;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DisappearingElementsPage;

public class DisappearingElementsTest extends BaseTests {
    @Test
    public void DisappearingElementstest(){

        DisappearingElementsPage disappearingElementsPage=homePage.clickOnDisappearingElements();
        Assert.assertTrue(disappearingElementsPage.checkAllButtonsApper(),
                "Not all expected buttons are visible on the Disappearing Elements page.");
    }
}