package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import java.util.logging.Level;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup(){
        LoggingPreferences logs = new LoggingPreferences();
        logs.enable(LogType.BROWSER, Level.ALL);

        ChromeOptions options = new ChromeOptions();
        options.setCapability("goog:loggingPrefs", logs);

        driver = new ChromeDriver(options);
        driver.manage().window().fullscreen();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void gotoHomepage() {
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}













//package base;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import pages.HomePage;
//import utils.WindowManager;
//
//import java.util.List;
//public class BaseTests {
//    public WebDriver driver;
//    protected HomePage homePage;
//
//    @BeforeClass
//    public void setup(){
//        driver = new ChromeDriver();
//        driver.manage().window().fullscreen();
//        driver.get("https://the-internet.herokuapp.com/");
//        homePage = new HomePage(driver);
//    }
//
//    @BeforeMethod
//    public void gotoHomepage() {
//        this.driver.get("https://the-internet.herokuapp.com/");
//        homePage = new HomePage(driver);
//    }
//
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
//
//    public WindowManager getWindowManager()
//    {
//        return new WindowManager(driver);
//    }
//}
