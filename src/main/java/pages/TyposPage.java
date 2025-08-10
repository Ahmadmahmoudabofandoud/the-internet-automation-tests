package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TyposPage {
    private WebDriver driver;

    private final By paragraphLocator = By.xpath("//div[@class='example']/p");

    public TyposPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getParagraphText() {
        WebElement paragraph = driver.findElement(paragraphLocator);
        return paragraph.getText();
    }
}
