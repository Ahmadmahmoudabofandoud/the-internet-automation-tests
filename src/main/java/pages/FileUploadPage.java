package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By uploadFileButton = By.id("file-submit");
    private By uploadFile = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver) {
            this.driver = driver;
     }
     public void UploadFile(String absoluteFilePath) {
        driver.findElement(chooseFileButton).sendKeys(absoluteFilePath);
        clickUploadButton();
     }

     public void clickUploadButton() {
         driver.findElement(uploadFileButton).click();
     }
     public String getUploadedFileName() {
         return driver.findElement(uploadFile).getText();
     }

}
