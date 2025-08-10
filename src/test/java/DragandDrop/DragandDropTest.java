package DragandDrop;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragandDropPage;

public class DragandDropTest extends BaseTests {

    @Test
    public void DragandDroptest(){
        DragandDropPage dragandDropPage=homePage.clickOndragandDropPage();
        dragandDropPage.dragandDrop();
        Assert.assertTrue(dragandDropPage.checkButtonSwitch());

    }

}
