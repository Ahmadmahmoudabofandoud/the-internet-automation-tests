package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class JavaScriptErrorPage {
    private WebDriver driver;

    public JavaScriptErrorPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isJavaScriptErrorPresent(String expectedMessage) {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            if (entry.getMessage().contains(expectedMessage)) {
                return true;
            }
        }
        return false;
    }
}
