package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureArea {
    private WebDriver driver;
    private By welcomeMessage = By.id("flash");

    public SecureArea(WebDriver driver){
        this.driver = driver;
    }
    public String getText(){
        return driver.findElement(welcomeMessage).getText();
    }

}
