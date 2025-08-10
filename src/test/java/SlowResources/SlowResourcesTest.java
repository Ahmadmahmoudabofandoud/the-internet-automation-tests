package SlowResources;

import base.BaseTests;
import pages.SlowResourcesPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SlowResourcesTest extends BaseTests {

    @Test
    public void testSlowResources() {
        var slowResourcesPage = homePage.clickOnSlowResources();

        String paragraphText = slowResourcesPage.getPageParagraphText();

        System.out.println("Paragraph text is: " + paragraphText);

        assertTrue(paragraphText.contains("rogue GET request"),
                "The paragraph text does not contain expected content.");
    }
}
