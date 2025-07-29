package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
        JavaScriptAlertsPage javaScriptAlertsPage = this.homePage.ClickOnJavaScriptAlerts();
        javaScriptAlertsPage.clickOnAlertTriggerButton();
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert", "The Text Is inCorrect");
    }
    @Test
    public void testDismissAlert() {
        var javaScriptAlertsPage = homePage.ClickOnJavaScriptAlerts();
        javaScriptAlertsPage.clickOnConfirmTriggerButton();
        String confirmText = javaScriptAlertsPage.alert_getTest();
        javaScriptAlertsPage.alert_clickToDismiss();
        assertEquals(confirmText,"I am a JS Confirm", "The Text Is inCorrect");

    }

    @Test
    public void testPrompt() {
        var jsAlertPage = homePage.ClickOnJavaScriptAlerts();
        jsAlertPage.clickOnPromptTriggerButton();
        jsAlertPage.alert_setTest("Route");
        jsAlertPage.alert_clickToAccept();
        assertEquals(jsAlertPage.getResultText(), "You entered: Route", "The Text Is inCorrect");
    }
}

