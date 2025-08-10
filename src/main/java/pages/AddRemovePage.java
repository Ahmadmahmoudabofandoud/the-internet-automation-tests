package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {
    private WebDriver driver;
    private By addbutton=By.cssSelector("#content > div > button");
    private By deleteButtonList=By.cssSelector("#elements > button");

    public AddRemovePage(WebDriver driver){
        this.driver=driver;
    }

    public void clickAddElement(){
        driver.findElement(addbutton).click();
    }

    public int getNumberOfDeleteButtons(){
        List<WebElement> buttons = driver.findElements(deleteButtonList);
        return buttons.size();
    }

    public void clickDeleteButton(int i){
        driver.findElement(By.xpath("//div[@id=\"content\"]/div/div/button["+i+"]")).click();
    }

}