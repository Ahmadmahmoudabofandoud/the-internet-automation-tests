package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // (0) Constructor: initializes the WebDriver instance for the HomePage
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Helper method to click on any link by its visible text
    private void clickLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }

    // ====================== Pages in Website Order ======================

    // (1) A/B Testing
    public ABTestingPage clickOnABTesting() {
        clickLink("A/B Testing");
        return new ABTestingPage(driver);
    }

    // (2) Add/Remove Elements
    public AddRemovePage clickOnAddRemovePage() {
        clickLink("Add/Remove Elements");
        return new AddRemovePage(driver);
    }

    // (3) Basic Auth
    public BasicAuthPage clickOnBasicAuthPage() {
        clickLink("Basic Auth");
        return new BasicAuthPage(driver);
    }

    // (4) Broken Images
    public BrokenImagesPage clickOnbrokenImagesPage(){
        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }
    // (5) Challenging DOM
    public ChallengingDOMPage clickOnChallengingDOMPage() {
        clickLink("Challenging DOM");
        return new ChallengingDOMPage(driver);
    }
    // (6) Checkboxes
    public CheckboxesPage clickOncheckboxesPage(){
        clickLink("Checkboxes");
        return new CheckboxesPage(driver);
    }

    // (7) Context Menu
    public ContextMenuPage clickContextMenuPage() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    // (8) Digest Authentication
    public DigestAuthPage clickOnDigestAuthPage() {
        clickLink("Digest Authentication");
        return new DigestAuthPage(driver);
    }

    // (9) Disappearing Elements - Not implemented yet
    // (10) Drag and Drop - Not implemented yet

    // (11) Dropdown
    public DropDownPage clickOnDropdown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    // (12) Dynamic Content - Not implemented yet
    // (13) Dynamic Controls - Not implemented yet

    // (14) Dynamic Loading
    public DynamicLoadingPage clickDynamicLoadingLink() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    // (15) Entry Ad
    public ModelsPage clickEntryAd() {
        clickLink("Entry Ad");
        return new ModelsPage(driver);
    }

    // (16) Exit Intent - Not implemented yet
    // (17) File Download - Not implemented yet

    // (18) File Upload
    public FileUploadPage clickOnFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    // (19) Floating Menu - Not implemented yet

    // (20) Forgot Password
    public ForgotPasswordPage clickForgotPasswordLink() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    // (21) Form Authentication
    public LoginPage clickOnFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    // (22) Frames
    public FramesPage clickFrames() {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    // (23) Geolocation - Not implemented yet

    // (24) Horizontal Slider
    public SliderPage clickSliderLink() {
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }

    // (25) Hovers
    public HoversPage clickOnHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    // (26) Infinite Scroll
    public InfiniteScrollPage clickInfiniteScrollLink() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    // (27) Inputs - Not implemented yet
    // (28) JQuery UI Menus - Not implemented yet

    // (29) JavaScript Alerts
    public JavaScriptAlertsPage clickOnJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    // (30) JavaScript onload event error - Not implemented yet

    // (31) Key Presses
    public KeyPressesPage clickOnKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    // (32) Large & Deep DOM
    public LargeAndDeepDOMPage clickLargeAndDeepDOMLink() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    // (33) Multiple Windows
    public MultipleWindowsPage clickMultipleWindowsLink() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    // (34) Nested Frames - Not implemented yet
    // (35) Notification Messages - Not implemented yet
    // (36) Redirect Link - Not implemented yet
    // (37) Secure File Download - Not implemented yet
    // (38) Shadow DOM - Not implemented yet
    // (39) Shifting Content - Not implemented yet
    // (40) Slow Resources - Not implemented yet
    // (41) Sortable Data Tables - Not implemented yet
    // (42) Status Codes - Not implemented yet
    // (43) Typos - Not implemented yet
    // (44) WYSIWYG Editor - Not implemented yet
}
