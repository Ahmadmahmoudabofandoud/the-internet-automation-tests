package keys;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {

    @Test
    public void testKeyPresses(){
        var KeyPressesPage = homePage.clickOnKeyPresses();
        KeyPressesPage.setText(Keys.chord(Keys.SHIFT, "a"));
        assertEquals(KeyPressesPage.getText(), "You entered: A","The Result Text is Incorrect");
    }
}
