package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTestingPage {
    private WebDriver driver;
    private By title=By.cssSelector("#content > div > h3");

    public ABTestingPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean checkTitleContent(){
        return driver.findElement(title).getText().contains("A/B Test");
    }
}