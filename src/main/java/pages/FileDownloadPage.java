package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.util.List;

public class FileDownloadPage {
    private WebDriver driver;
    private By fileLinks = By.cssSelector("div.example a");

    public FileDownloadPage(WebDriver driver){
        this.driver = driver;
    }

    public String clickNotesOrFirstFile(){
        List<WebElement> links = driver.findElements(fileLinks);

        if (links.isEmpty()) {
            return null;
        }

        for (WebElement link : links) {
            if (link.getText().trim().equalsIgnoreCase("Notes.txt")) {
                link.click();
                return "Notes";
            }
        }

        String firstFileName = links.get(0).getText().trim();
        links.get(0).click();
        return firstFileName.split("\\.")[0];
    }

    public boolean checkFileDownloaded(String downloadPath, String expectedFileName){
        File folder = new File(downloadPath);
        File[] files = folder.listFiles();
        if (files == null) return false;

        for (File file : files) {
            if (file.getName().contains(expectedFileName)) {
                return true;
            }
        }
        return false;
    }
}