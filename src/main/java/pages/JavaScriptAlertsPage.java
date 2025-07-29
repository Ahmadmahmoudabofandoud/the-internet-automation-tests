package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    WebDriver driver;
    private  By AlerttriggerButton = By.xpath("//button[text()='Click for JS Alert']");
    private  By ConfirmtriggerButton = By.xpath("//button[text()='Click for JS Confirm']");
    private  By PrompttriggerButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By result =By.id("result");

    public  JavaScriptAlertsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickOnAlertTriggerButton()
    {
        driver.findElement(AlerttriggerButton).click();
    }

    public void clickOnConfirmTriggerButton()
    {
        driver.findElement(ConfirmtriggerButton).click();
    }
    public void clickOnPromptTriggerButton()
    {
        driver.findElement(PrompttriggerButton).click();
    }

    public void alert_clickToAccept()
    {
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss()
    {
        driver.switchTo().alert().dismiss();
    }
    public void alert_setTest(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String alert_getTest(){
        return driver.switchTo().alert().getText();
    }


    public String getResultText()
    {
        return driver.findElement(result).getText();
    }

}
