package dynamicContent;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicContentPage;

import java.util.List;

public class DynamicContentTest extends BaseTests {

    @Test
    public void verifyContentChangesAfterRefresh() {
        DynamicContentPage dynamicContentPage = homePage.clickOnDynamicContentPage();

        List<String> beforeRefresh = dynamicContentPage.getAllContentTexts();

        dynamicContentPage.refreshPage();
        List<String> afterRefresh = dynamicContentPage.getAllContentTexts();

        Assert.assertNotEquals(
                beforeRefresh,
                afterRefresh,
                "Dynamic content did not change after refreshing the page."
        );
    }
}
