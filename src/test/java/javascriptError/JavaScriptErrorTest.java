package javascriptError;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptErrorPage;

public class JavaScriptErrorTest extends BaseTests {

    @Test
    public void testJavaScriptOnloadError() {
        JavaScriptErrorPage errorPage = homePage.clickOnJavaScriptErrorPage();
        Assert.assertTrue(
                errorPage.isJavaScriptErrorPresent("Cannot read properties of undefined"),
                "Expected JavaScript error was not found."
        );
    }
}
