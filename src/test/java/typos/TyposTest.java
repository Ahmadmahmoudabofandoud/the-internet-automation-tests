package typos;

import base.BaseTests;
import pages.TyposPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TyposTest extends BaseTests {

    @Test
    public void testTyposText() {
        var typosPage = homePage.clickOnTypos();

        String paragraphText = typosPage.getParagraphText();

        System.out.println("Paragraph text is: " + paragraphText);

        assertTrue(paragraphText.contains("typo"),
                "Expected text to contain 'typo'");
    }
}
