package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class GeolocationPage {

    private WebDriver driver;

    // Locators
    private By whereAmIButton = By.xpath("//div[@id='content']/div/button");
    private By latitudeValue  = By.id("lat-value");
    private By longitudeValue = By.id("long-value");

    // Constructor
    public GeolocationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Clicks on the "Where am I?" button
    public void clickWhereAmIButton() {
        driver.findElement(whereAmIButton).click();
    }

    public boolean checkMyLatitude(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(latitudeValue));
        String latText = driver.findElement(latitudeValue).getText().trim();
        return !latText.isEmpty();
    }

    public boolean checkMyLongitude(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(longitudeValue));
        String longText = driver.findElement(longitudeValue).getText().trim();
        return !longText.isEmpty();
    }

}