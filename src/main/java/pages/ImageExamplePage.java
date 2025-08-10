package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImageExamplePage {
    private WebDriver driver;
    private By img=By.xpath("//div[@id=\"content\"]/div/img");
    private By loadRandomPositionLink=By.xpath("//div[@id=\"content\"]/div/p[2]/a");
    private By shiftImageLink=By.xpath("//div[@id=\"content\"]/div/p[3]/a");
    private By bothActionsLink=By.xpath("//div[@id=\"content\"]/div/p[4]/a");
    private By changeImageLink=By.xpath("//div[@id=\"content\"]/div/p[5]/a");

    public ImageExamplePage (WebDriver driver){
        this.driver=driver;
    }

    public void clickLoadRandomPositionImage(){
        driver.findElement(loadRandomPositionLink).click();
    }


    public boolean checkImagePositionAfterClickShift() {
        int xBefore = driver.findElement(img).getLocation().getX();
        int yBefore = driver.findElement(img).getLocation().getY();

        driver.findElement(shiftImageLink).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> {
            int xAfter = driver.findElement(img).getLocation().getX();
            int yAfter = driver.findElement(img).getLocation().getY();
            return xAfter != xBefore || yAfter != yBefore;
        });

        int xAfter = driver.findElement(img).getLocation().getX();
        int yAfter = driver.findElement(img).getLocation().getY();

        return xBefore != xAfter || yBefore != yAfter;
    }

    public boolean checkImagePositionAfterClickboth(){
        int x = driver.findElement(img).getLocation().getX();
        int y = driver.findElement(img).getLocation().getY();
        int imgeOriginalPosition=x+y;
        driver.findElement(bothActionsLink).click();
        x = driver.findElement(img).getLocation().getX();
        y = driver.findElement(img).getLocation().getY();
        int imgeCurrentPosition=x+y;
        if (imgeCurrentPosition==imgeOriginalPosition)
            return false;
        return true;
    }

    public boolean checkImageChangeWhenClickChangeImage(){
        String originalSrc=driver.findElement(img).getAttribute("src");
        driver.findElement(changeImageLink).click();
        String currentlSrc=driver.findElement(img).getAttribute("src");

        if(originalSrc.equals(currentlSrc))
            return false;
        return true;
    }

}