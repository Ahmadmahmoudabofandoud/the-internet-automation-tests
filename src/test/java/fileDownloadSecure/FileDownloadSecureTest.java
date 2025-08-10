package fileDownloadSecure;
import base.BaseTests;
import pages.FileDownloadSecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadSecureTest extends BaseTests {

    @Test
    public void fileDownloadSecureTest() throws InterruptedException {
        FileDownloadSecurePage fileDownloadSecurePage = homePage.clickOnFileDownloadSecurePage();

        String fileName = fileDownloadSecurePage.clickNotesOrFirstFile();
        Assert.assertNotNull(fileName, "No files found in the download list");
        Thread.sleep(3000);

        String downloadPath = "C:\\Users\\lap shop\\Downloads";
        Assert.assertTrue(fileDownloadSecurePage.checkFileDownloaded(downloadPath, fileName),
                "Downloaded file '" + fileName + "' not found in folder");
    }

}