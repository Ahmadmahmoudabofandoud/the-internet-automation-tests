package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropPage {
    private WebDriver driver;
    private By columnA=By.id("column-a");
    private By columnB= By.id("column-b");

    public DragandDropPage(WebDriver driver){
        this.driver=driver;
    }

    public void dragandDrop(){
        Actions action=new Actions(driver);
        action.dragAndDrop(driver.findElement(columnA),driver.findElement(columnB)).perform();
    }

    public boolean checkButtonSwitch(){
        String columnAText = driver.findElement(columnA).getText();
        String columnBText = driver.findElement(columnB).getText();
        if(columnAText.contains("B")&&columnBText.contains("A"))
            return true;
        return false;
    }
}