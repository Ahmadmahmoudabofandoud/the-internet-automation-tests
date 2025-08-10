package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicAuthPage {
     WebDriver driver;
    public By successMsgContent = By.cssSelector("#content > div > p");

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWithCredentials(String username, String password) {
        String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";
        driver.get(url);
    }

    public boolean checkSuccessmsg() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsgContent));
        return msg.getText().contains("Congratulations!");
    }
}
