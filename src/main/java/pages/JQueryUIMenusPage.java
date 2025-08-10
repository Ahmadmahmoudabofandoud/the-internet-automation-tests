package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class JQueryUIMenusPage{
    private WebDriver driver;
    private By menu=By.id("ui-id-3");

    Actions actions;
    WebDriverWait wait;

    public JQueryUIMenusPage(WebDriver driver)
    {
        this.driver=driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    public String getLastElementData() {
        WebElement mainMenu = driver.findElement(menu);
        actions.moveToElement(mainMenu).perform();
        WebElement subMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@aria-expanded='true']")));
        List<WebElement> subMenuItems = subMenu.findElements(By.cssSelector("li.ui-menu-item[role='menuitem']"));

        WebElement lastElement = subMenuItems.get(0);
        actions.moveToElement(lastElement).perform();
        WebElement subMenu2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ui-id-4']//ul[@role='menu']")));
        List<WebElement> nestedMenus = subMenu2.findElements(By.cssSelector("li.ui-menu-item[role='menuitem']"));

        return nestedMenus.get(2).getText();

    }
}