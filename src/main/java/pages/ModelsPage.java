package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModelsPage {
    private WebDriver driver;
    //private final By modalLocator = By.className("modal");
    //private final By modalTitleLocator = By.xpath("//div[@class='modal-title']/h3");
    private final By closeModalLocator = By.xpath("//p[text()='Close']");
    private final By pageHeaderLocator = By.xpath("//h3[text()='Entry Ad']");


    public ModelsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickClose(){
        driver.findElement(closeModalLocator).click();
    }
    public String getText(){
        return driver.findElement(pageHeaderLocator).getText();
    }


}
