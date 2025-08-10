package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DisappearingElementsPage {
    private WebDriver driver;
    private By buttonsList=By.xpath("//div[@class=\"example\"]/ul/li");

    public DisappearingElementsPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean checkAllButtonsApper(){
        List<WebElement> buttons=driver.findElements(buttonsList);
        if(buttons.size()==5){
            return true;
        }
        return false;
    }
}
