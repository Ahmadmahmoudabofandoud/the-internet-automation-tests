package basicAuth;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasicAuthPage;

public class BasicAuthTest extends BaseTests {

    @Test
    public void basicauthTest() {
        BasicAuthPage basicAuthPage = new BasicAuthPage(driver);

        basicAuthPage.openWithCredentials("admin", "admin");

        Assert.assertTrue(
                basicAuthPage.checkSuccessmsg(),
                "Basic Auth page did not display the success message."
        );
    }
}
