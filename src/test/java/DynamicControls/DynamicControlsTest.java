package DynamicControls;

import pages.DynamicControlsPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTests {
    @BeforeMethod
    public void get(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void dynamicContentTest1(){
        DynamicControlsPage dynamicControlsPage=homePage.clickOndynamicControlsPage();

        dynamicControlsPage.clickCheckBoxBtn();
        Assert.assertTrue(dynamicControlsPage.checkBtnText("Remove",1));
        dynamicControlsPage.clickBtn(1);
        Assert.assertTrue(dynamicControlsPage.checkLoadingBarApper(1));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgApper(1));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgText(1));
        Assert.assertTrue(dynamicControlsPage.checkBtnText("Add",1));
    }
    @Test
    public void dynamicContentTest2(){
        DynamicControlsPage dynamicControlsPage=homePage.clickOndynamicControlsPage();

        Assert.assertTrue(dynamicControlsPage.checkBtnText("Enable",2));
        dynamicControlsPage.clickBtn(2);
        Assert.assertTrue(dynamicControlsPage.checkLoadingBarApper(2));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgApper(2));
        Assert.assertTrue(dynamicControlsPage.checkResultMsgText(2));
        Assert.assertTrue(dynamicControlsPage.checkInputFieldEnalbled());
        Assert.assertTrue(dynamicControlsPage.checkBtnText("Disable",2));
    }

}