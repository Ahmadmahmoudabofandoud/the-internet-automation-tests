package SortableDataTables;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableDataTablesPage;

public class SortableDataTablesTest extends BaseTests {

    @Test
    public void sortableDataTablesTest(){
        SortableDataTablesPage sortableDataTablesPage=homePage.clickOnsortableDataTablesPage();

        sortableDataTablesPage.clickDeleteButtonFirstTable();
        Assert.assertTrue(sortableDataTablesPage.checkDeleteURl());

        sortableDataTablesPage.clickEditButtonFirstTable();
        Assert.assertTrue(sortableDataTablesPage.checkEditURl());

        sortableDataTablesPage.clickDeleteForSpicificEmail("fbach@yahoo.com");
        Assert.assertTrue(sortableDataTablesPage.checkDeleteURl());
    }
}
