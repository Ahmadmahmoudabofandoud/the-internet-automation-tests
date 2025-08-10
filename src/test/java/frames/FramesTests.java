package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testFrames() {
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFramesLink();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT", "The Text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM", "The Text is incorrect");
    }
}