package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkboxes=By.xpath("//form[@id=\"checkboxes\"]//input[@type='checkbox']");

    public CheckboxesPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickCheckBox(int i){
        driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input["+i+"]")).click();
    }

    public int getNumberOfSelectedBoxes(){
        List<WebElement> boxes=driver.findElements(checkboxes);
        int selectedCount = 0;

        for (WebElement checkbox : boxes) {
            if (checkbox.isSelected()) {
                selectedCount++;
            }
        }
        return selectedCount;
    }
}