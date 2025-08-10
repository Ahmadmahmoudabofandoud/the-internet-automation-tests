package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SlowResourcesPage {
    private WebDriver driver;

    public SlowResourcesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageParagraphText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement paragraph = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='content']/div/p")
        ));
        return paragraph.getText();
    }
}
