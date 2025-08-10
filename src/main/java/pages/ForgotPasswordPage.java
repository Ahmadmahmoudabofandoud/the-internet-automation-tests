package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField=By.id("email");
    private By recivePasswordButton=By.id("form_submit");
    private By errorMsg=By.xpath("/html/body/h1");

    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterEmail(String mail){
        driver.findElement(emailField).sendKeys(mail);
    }
    public void clickRecivePasswordButton(){
        driver.findElement(recivePasswordButton).click();
    }
    public boolean checkErrorMsgContent(){
        return driver.findElement(errorMsg).getText().contains("Internal Server Error");
    }

}