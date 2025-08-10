package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Link=By.xpath("//a[normalize-space()='Example 1: Element on page that is hidden']");
    private By startBtn=By.xpath("//button[normalize-space()='Start']");
    private By loadingBar=By.id("loading");
    private By  helloWorldMsg=By.id("finish");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickExample1Link(){
        driver.findElement(example1Link).click();
    }
    public void clickStartLink(){
        driver.findElement(startBtn).click();
    }

    public boolean checkLoadingBarApper(){
        return driver.findElement(loadingBar).isDisplayed();
    }

    public  boolean checkHeeloWorldMsgApper(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));

        // In  Example 2 you  will use the same code but you muse use invisibilityOfElementLocated invisibilityOf
        //or useFluent wait and use .ignore

//        FluentWait<WebElement> wait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
//                .ignoreAll(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));

        return driver.findElement(helloWorldMsg).isDisplayed();
    }

}

//    WebDriver driver;
//
//    private final By example1LinkLocator = By.xpath("//a[contains(text(),'Example 1')]");
//    private final By example2LinkLocator = By.xpath("//a[contains(text(),'Example 2')]");
//
//    public DynamicLoadingPage(WebDriver driver)
//    {
//        this.driver = driver;
//    }
//
//    public DynamicLoadingExample1Page clickExample1Link()
//    {
//        driver.findElement(example1LinkLocator).click();
//
//        return new DynamicLoadingExample1Page(driver);
//    }
//
//    public DynamicLoadingExample1Page openExample1LinkInNewTab()
//    {
//        Actions actions = new Actions(driver);
//        actions.keyDown(Keys.CONTROL)
//                .click(driver.findElement(example1LinkLocator))
//                .build()
//                .perform();
//
//        return new DynamicLoadingExample1Page(driver);
//    }
//
//    public DynamicLoadingExample2Page clickExample2Link()
//    {
//        driver.findElement(example2LinkLocator).click();
//
//        return  new DynamicLoadingExample2Page(driver);
//    }
//}
