package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By example2Link=By.xpath("//div[@id=\"content\"]/div/a[contains(.,\"Example 2\")]");

    public ShiftingContentPage(WebDriver driver){
        this.driver=driver;
    }

    public ImageExamplePage clickImglink(){
        driver.findElement(example2Link).click();
        return new ImageExamplePage(driver);
    }
}