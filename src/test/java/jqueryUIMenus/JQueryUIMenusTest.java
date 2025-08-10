package jqueryUIMenus;

import pages.JQueryUIMenusPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JQueryUIMenusTest extends BaseTests {

    @Test
    public void jQueryUIMenuTest(){
        JQueryUIMenusPage jQueryUIMenusPage=homePage.clickOnjQueryUIMenusPage();

        Assert.assertEquals("Excel",jQueryUIMenusPage.getLastElementData());

    }
}