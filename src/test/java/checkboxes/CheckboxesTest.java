package checkboxes;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends BaseTests {

    @Test
    public void checkboxesTest(){
        CheckboxesPage checkboxesPage=homePage.clickOncheckboxesPage();
        checkboxesPage.clickCheckBox(1);
        Assert.assertEquals(2,checkboxesPage.getNumberOfSelectedBoxes());
        checkboxesPage.clickCheckBox(2);
        checkboxesPage.clickCheckBox(1);
        Assert.assertEquals(0,checkboxesPage.getNumberOfSelectedBoxes());
    }
}