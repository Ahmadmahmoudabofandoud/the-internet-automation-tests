package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortableDataTablesPage {
    private WebDriver driver;
    private By firstTableThirdDeleteButton=By.xpath("//table[@id=\"table1\"]/tbody/tr[3]/td[6]/a[2]");
    private By firstTableFourthEditButton=By.xpath("//table[@id=\"table1\"]/tbody/tr[4]/td[6]/a[1]");

    public SortableDataTablesPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickDeleteButtonFirstTable(){
        driver.findElement(firstTableThirdDeleteButton).click();
    }

    public void clickEditButtonFirstTable(){
        driver.findElement(firstTableFourthEditButton).click();
    }

    public void clickDeleteForSpicificEmail(String email){
        driver.findElement(By.xpath("//table[@id=\"table2\"]/tbody/tr[td[contains(.,\""+email+"\")]]/td[6]/a[2]")).click();
    }

    public boolean checkDeleteURl(){
        return driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/tables#delete");
    }

    public boolean checkEditURl(){
        return driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/tables#edit");
    }



}