package brokenImages;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrokenImagesPage;

public class BrokenImagesTest extends BaseTests {

    @Test
    public void BrokenimagesTest() {
        BrokenImagesPage brokenImagesPage=homePage.clickOnbrokenImagesPage();

        Assert.assertEquals(2,brokenImagesPage.getNumberOfBrokenImages());
    }
}
