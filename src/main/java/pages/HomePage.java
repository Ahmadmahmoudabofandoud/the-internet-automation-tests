package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){

        this.driver = driver;
    }
    public LoginPage clickOnFormFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickOnDropdown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickOnHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public  KeyPressesPage  clickOnKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    private void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }

    public SliderPage clickSliderLink()
    {
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }
    public  JavaScriptAlertsPage ClickOnJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage clickOnFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ModelsPage clickEntryAd(){
        clickLink("Entry Ad");
        return new ModelsPage(driver);
    }
    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public ContextMenuPage clickContextMenuPage()
    {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsLink()
    {
        clickLink("Multiple Windows");

        return new MultipleWindowsPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink()
    {
        clickLink("Forgot Password");

        return new ForgotPasswordPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScrollLink()
    {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }


    public LargeAndDeepDOMPage clickLargeAndDeepDOMLink()
    {
        clickLink("Large & Deep DOM");

        return new LargeAndDeepDOMPage(driver);
    }
}