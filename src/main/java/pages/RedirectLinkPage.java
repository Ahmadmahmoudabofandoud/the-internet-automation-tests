package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedirectLinkPage {
    private WebDriver driver;
    private By statusCodePageLink=By.id("redirect");

    public RedirectLinkPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickStatusCodePageLink(){
        driver.findElement(statusCodePageLink).click();
    }
    public boolean checkURL(){
        return driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/status_codes");
    }
}