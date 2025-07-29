package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.Base64;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testUploadingFile(){
        String absolutePath = "C:\\Users\\lap shop\\IdeaProjects\\Selenium\\resouces\\1753217888854.jpeg";
        var fileUpload = homePage.clickOnFileUpload();
        fileUpload.UploadFile(absolutePath);
        assertEquals(fileUpload.getUploadedFileName(),"1753217888854.jpeg","The Fle is InCorrect");
    }

}
