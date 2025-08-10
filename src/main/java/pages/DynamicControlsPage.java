package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage {
    private WebDriver  driver;
    private By checkbox=By.xpath("//input[@type='checkbox']");
    private By addRemoveBtn=By.xpath("//form[@id=\"checkbox-example\"]/button");
    private By loadingBar1=By.xpath("//form[@id=\"checkbox-example\"]/div");
    private By resultMessage1=By.xpath("//form[@id=\"checkbox-example\"]/p");

    private By enableDisableBtn=By.xpath("//form[@id=\"input-example\"]/button");
    private By inputField=By.xpath("//form[@id=\"input-example\"]/input");
    private By loadingBar2=By.xpath("//form[@id=\"input-example\"]/div[@id=\"loading\"][1]");
    private By resultMessage2=By.xpath("//form[@id=\"input-example\"]/p");

    public DynamicControlsPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickCheckBoxBtn() {
        driver.findElement(checkbox).click();
    }
    public void clickBtn(int  number){
        if (number==1){
            driver.findElement(addRemoveBtn).click();
        }
        else {
            driver.findElement(enableDisableBtn).click();
        }

    }
    public boolean checkBtnText(String text,int number){
        if (number==1){
            return driver.findElement(addRemoveBtn).getText().equals(text);
        }
        else {
            return driver.findElement(enableDisableBtn).getText().equals(text);
        }

    }
    public boolean checkLoadingBarApper(int  number){
        if (number==1){
            return driver.findElement(loadingBar1).isDisplayed();
        }
        else {
            return driver.findElement(loadingBar2).isDisplayed();
        }

    }
    public  boolean checkResultMsgApper(int number){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (number==1){
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar1));
            return driver.findElement(resultMessage1).isDisplayed();
        }
        else {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar2));
            return driver.findElement(resultMessage2).isDisplayed();
        }

    }
    public boolean checkResultMsgText(int number){
        if (number==1){
            return driver.findElement(resultMessage1).getText().equals("It's gone!");
        }
        else {
            return driver.findElement(resultMessage2).getText().equals("It's enabled!");
        }
    }
    public boolean checkInputFieldEnalbled(){
        return driver.findElement(inputField).isEnabled();
    }

}