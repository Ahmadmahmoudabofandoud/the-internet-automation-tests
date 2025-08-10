package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengingDOMPage {
    private WebDriver driver;

    private By blueButton = By.cssSelector(".button");
    private By redButton = By.cssSelector(".button.alert");
    private By greenButton = By.cssSelector(".button.success");

    private By table = By.cssSelector("table");

    public ChallengingDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBlueButton() {
        driver.findElement(blueButton).click();
    }

    public void clickRedButton() {
        driver.findElement(redButton).click();
    }

    public void clickGreenButton() {
        driver.findElement(greenButton).click();
    }

    public boolean isTableDisplayed() {
        return driver.findElement(table).isDisplayed();
    }
}
