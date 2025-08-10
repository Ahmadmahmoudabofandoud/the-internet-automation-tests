package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage1 {
    private WebDriver driver;
    private By msgContent=By.xpath("//div[@id=\"content\"]/div/p");
    private By statusCodesPageLink=By.xpath("//div[@id=\"content\"]/div/p/a");

    public StatusCodesPage1(WebDriver driver){
        this.driver=driver;
    }

    public boolean checkMsgContent(String code){
        return driver.findElement(msgContent).getText().contains(code);
    }

    public StatusCodesPage clickStatusCodePageLink(){
        driver.findElement(statusCodesPageLink).click();
        return new StatusCodesPage(driver);
    }

}
