package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagesPage {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click here");
    private By notificationMessage = By.id("flash");

    public NotificationMessagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHereLink() {
        driver.findElement(clickHereLink).click();
    }

    public String getNotificationMessage() {
        return driver.findElement(notificationMessage).getText().trim();
    }
}
