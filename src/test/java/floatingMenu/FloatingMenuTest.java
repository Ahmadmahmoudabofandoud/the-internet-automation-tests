package floatingMenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FloatingMenuPage;

public class FloatingMenuTest extends BaseTests {
    private FloatingMenuPage floatingMenuPage;

    @BeforeMethod
    public void setUpPage() {
        floatingMenuPage = homePage.clickOnfloatingMenuPage();
    }

    @DataProvider(name = "pages")
    public Object[][] getData() {
        return new Object[][]{
                {"home"},
                {"about"},
                {"contact"},
                {"news"}
        };
    }

    @Test(dataProvider = "pages")
    public void floatingMenuShouldWorkFromAnyScrollPosition(String page) {
        // Scroll to bottom first to ensure menu is still clickable
        floatingMenuPage.scrollToTheEnd();

        // Click the menu link
        floatingMenuPage.goToAnyPage(page);

        // Verify the URL anchor changes accordingly
        Assert.assertTrue(
                floatingMenuPage.checkURL(page),
                "Floating menu link for '" + page + "' did not navigate correctly."
        );
    }
}
