package Inputs;

import pages.InputsPage;
import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTests {

    @Test
    public void inputsTest(){
        InputsPage inputsPage=homePage.clickOninputsPage();
        inputsPage.clickInputField();
        inputsPage.decreaseInputBy(4);
        inputsPage.increaseInputBy(10);
        Assert.assertTrue(inputsPage.checkEndResult("6"));
    }
}