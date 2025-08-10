package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FloatingMenuPage {
    private WebDriver driver;

    // Locators for menu buttons
    private By homeBtn = By.xpath("//a[@href='#home']");
    private By newsBtn = By.xpath("//a[@href='#news']");
    private By contactBtn = By.xpath("//a[@href='#contact']");
    private By aboutBtn = By.xpath("//a[@href='#about']");

    public FloatingMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    // Scroll to the bottom of the page
    public void scrollToTheEnd() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    // Click any page link from the floating menu
    public void goToAnyPage(String page) {
        switch (page.toLowerCase()) {
            case "home":
                driver.findElement(homeBtn).click();
                break;
            case "news":
                driver.findElement(newsBtn).click();
                break;
            case "contact":
                driver.findElement(contactBtn).click();
                break;
            case "about":
                driver.findElement(aboutBtn).click();
                break;
            default:
                throw new IllegalArgumentException("Invalid page name: " + page);
        }
    }

    // Verify if the current URL contains the page anchor
    public boolean checkURL(String page) {
        return driver.getCurrentUrl().contains("#" + page);
    }
}
