package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputsPage {
    private WebDriver driver;
    private By testField=By.xpath("//div[@id=\"content\"]/div/div/div/input");
    private By testFieldNumber=By.xpath("//input[@type='number']");

    public InputsPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickInputField(){
        driver.findElement(testField).click();
    }
    public void increaseInputBy(int number){
        for(int i=0;i<number;i++){
            driver.findElement(testFieldNumber).sendKeys(Keys.ARROW_UP);
        }
    }
    public void decreaseInputBy(int number){
        for(int i=0;i<number;i++){
            driver.findElement(testFieldNumber).sendKeys(Keys.ARROW_DOWN);
        }
    }
    public boolean checkEndResult(String correctNumber){
        return driver.findElement(testField).getAttribute("value").equals(correctNumber);
    }
}