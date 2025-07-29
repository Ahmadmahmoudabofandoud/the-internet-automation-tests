package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;

    private  String topFrameName = "frame-top";
    private  String leftFrameName = "frame-left";
    private  String bottomFrameName ="frame-bottom";
    private  By leftFrameTextLocator = By.tagName("body");
    private  By bottomFrameTextLocator = By.tagName("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLeftFrameText() {
        driver.switchTo().frame(topFrameName);
        driver.switchTo().frame(leftFrameName);
        String getFrameText = driver.findElement(leftFrameTextLocator).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return getFrameText;
    }
    public String getBottomFrameText() {
        driver.switchTo().frame(bottomFrameName);
        String bottomFrameText = driver.findElement(bottomFrameTextLocator).getText().trim();
        driver.switchTo().parentFrame();
        return bottomFrameText;

    }
}
