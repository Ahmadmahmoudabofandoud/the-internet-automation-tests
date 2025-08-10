package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

public class DynamicContentPage {
    private WebDriver driver;
    private By contentParagraphs = By.cssSelector("#content .large-10");

    public DynamicContentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Get current text content from all visible paragraphs
    public List<String> getAllContentTexts() {
        List<String> texts = new ArrayList<>();
        driver.findElements(contentParagraphs)
                .forEach(element -> texts.add(element.getText().trim()));
        return texts;
    }

    // Refresh the page
    public void refreshPage() {
        driver.navigate().refresh();
    }
}
