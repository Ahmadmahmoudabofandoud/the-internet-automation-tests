package shiftingContent;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ImageExamplePage;
import pages.ShiftingContentPage;

public class ShiftingContentTest extends BaseTests {

        @Test
        public void testImagePositionChange() {
            ShiftingContentPage shiftingContentPage = homePage.clickOnshiftingContentPage();
            ImageExamplePage imageExamplePage = shiftingContentPage.clickImglink();

            imageExamplePage.clickLoadRandomPositionImage();
            Assert.assertTrue(imageExamplePage.checkImagePositionAfterClickShift(),
                    "Expected image position to change after clicking 'Load Random Position'");
            Assert.assertTrue(imageExamplePage.checkImagePositionAfterClickboth(),
                    "Expected image position to change after clicking 'Both Actions'");
            Assert.assertTrue(imageExamplePage.checkImageChangeWhenClickChangeImage(),
                    "Expected image source to change after clicking 'Change Image'");
    }
}