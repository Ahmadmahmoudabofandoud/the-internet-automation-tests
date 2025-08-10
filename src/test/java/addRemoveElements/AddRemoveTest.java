package addRemoveElements;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class AddRemoveTest extends BaseTests {
    int n=5;
    @Test
    public void checkAddAndRemoveElementsFunctionality() {
        AddRemovePage addremovePage=homePage.clickOnAddRemovePage();
        for(int i=0 ;i<n;i++) {
            addremovePage.clickAddElement();
        }
        Assert.assertEquals(5,addremovePage.getNumberOfDeleteButtons(), "Number of delete buttons after adding elements is incorrect.");

        for(int i=n-1 ;i>=2;i--) {
            addremovePage.clickDeleteButton(i);
        }
        Assert.assertEquals(2,addremovePage.getNumberOfDeleteButtons(), "Number of delete buttons after deleting elements is incorrect.");
    }
}