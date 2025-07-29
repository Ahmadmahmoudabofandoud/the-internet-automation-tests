package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figure = By.className("figure");
    private By figureCaption = By.className("figcaption");
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public FigureCaption hoverOnFigure(int index){
        WebElement figureElement = driver.findElements(figure).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figureElement).perform();
        return  new FigureCaption(figureElement.findElement(figureCaption));
    }
    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.linkText("a");
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }
        public boolean isDesplayed(){
            return caption.isDisplayed();
        }
        public String getText(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }

    }
}
