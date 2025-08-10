package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImagesPage {
    private WebDriver driver;
    private By imgs=By.xpath("//div[@id='content']/div/img");

    public BrokenImagesPage(WebDriver driver){
        this.driver=driver;
    }

    public int getNumberOfBrokenImages(){
        List<WebElement> allImages= driver.findElements(imgs);
        int  brokenImages=0;
        for(WebElement img:allImages){
            Boolean isImageLoaded = (Boolean) ((JavascriptExecutor) driver).
                    executeScript("return arguments[0].complete && arguments[0].naturalWidth > 0;", img);
            if (!isImageLoaded) {
                brokenImages++;
            }
        }
        return brokenImages;
    }
}
