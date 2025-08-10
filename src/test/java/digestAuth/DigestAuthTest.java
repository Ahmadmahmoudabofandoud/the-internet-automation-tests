package digestAuth;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DigestAuthPage;

public class DigestAuthTest extends BaseTests {

    @Test
    public void verifyDigestAuth() {
        DigestAuthPage digestAuthPage = new DigestAuthPage(driver);

        // Open page with credentials
        digestAuthPage.openWithCredentials("admin", "admin");

        // Verify success message
        Assert.assertTrue(
                digestAuthPage.checkSuccessmsg(),
                "Digest Auth page did not display the success message."
        );
    }
}
