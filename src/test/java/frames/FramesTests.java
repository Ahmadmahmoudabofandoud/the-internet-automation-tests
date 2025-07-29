package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testFrames() {
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFramesLink();
        assertEquals(nestedFramesPage.getLeftFrameText(),"Left", "The Text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"Bottom", "The Text is incorrect");
    }
}