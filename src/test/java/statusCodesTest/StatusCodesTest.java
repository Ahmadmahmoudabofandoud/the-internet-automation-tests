package statusCodesTest;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StatusCodesPage;
import pages.StatusCodesPage1;

public class StatusCodesTest extends BaseTests {

    @Test
    public void statusCodeTest(){
        String[] statusCodes = {"200", "301", "404", "500"};
        StatusCodesPage statusCodesPage = homePage.clickOnstatusCodesPage();
        for(String code:statusCodes) {
            StatusCodesPage1 statusCodesPage2 = statusCodesPage.chooseStatusCode(code);
            Assert.assertTrue(statusCodesPage2.checkMsgContent(code),"Failed for status code:"+ code);
            statusCodesPage=statusCodesPage2.clickStatusCodePageLink();
        }
    }
}
