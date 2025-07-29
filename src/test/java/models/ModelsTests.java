package models;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class ModelsTests extends BaseTests {
    @Test
    public void testModels(){
        var modelPage = homePage.clickEntryAd();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        modelPage.clickClose();
        assertEquals(modelPage.getText(),"Entry Ad","The Text inCorrect");
    }
}
