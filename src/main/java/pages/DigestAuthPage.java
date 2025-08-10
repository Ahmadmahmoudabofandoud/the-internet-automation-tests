package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DigestAuthPage {
    private WebDriver driver;
    private By successMsgContent = By.cssSelector("#content > div > p");

    public DigestAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    // Open page with credentials in the URL
    public void openWithCredentials(String username, String password) {
        String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/digest_auth";
        driver.get(url);
    }

    // Check if success message contains "Congratulations!"
    public boolean checkSuccessmsg() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions
                        .visibilityOfElementLocated(successMsgContent))
                .getText()
                .contains("Congratulations!");
    }
}
