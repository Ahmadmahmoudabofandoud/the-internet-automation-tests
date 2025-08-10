package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StatusCodesPage {
    private WebDriver driver;
    private By links=By.xpath("//div[@id=\"content\"]/div/ul/li/a");

    public StatusCodesPage(WebDriver driver){
        this.driver=driver;
    }

    public StatusCodesPage1 chooseStatusCode(String code){
        List<WebElement> Links=driver.findElements(links);
        switch (code){
            case "200":
                Links.get(0).click();
                break;
            case "301":
                Links.get(1).click();
                break;
            case "404":
                Links.get(2).click();
                break;
            case "500":
                Links.get(3).click();
                break;
        }
        return new StatusCodesPage1(driver);
    }


}