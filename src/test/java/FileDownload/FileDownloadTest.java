package FileDownload;
import base.BaseTests;
import pages.FileDownloadPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FileDownloadTest extends BaseTests {

    @Test
    public void fileDownloadTest() throws InterruptedException {
        FileDownloadPage fileDownloadPage = homePage.clickOmfileDownloadPage();

        String fileName = fileDownloadPage.clickNotesOrFirstFile();
        Assert.assertNotNull(fileName, "No files found in the download list");
        Thread.sleep(3000);

        String downloadPath = "C:\\Users\\lap shop\\Downloads";
        Assert.assertTrue(fileDownloadPage.checkFileDownloaded(downloadPath, fileName),
                "Downloaded file '" + fileName + "' not found in folder");
    }
}