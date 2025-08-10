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
    public BrokenImagesPage clickOnbrokenImagesPage() {
        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }

    // (5) Challenging DOM
    public ChallengingDOMPage clickOnChallengingDOMPage() {
        clickLink("Challenging DOM");
        return new ChallengingDOMPage(driver);
    }

    // (6) Checkboxes
    public CheckboxesPage clickOncheckboxesPage() {
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

    // (9) Disappearing Elements
    public DisappearingElementsPage clickOnDisappearingElements() {
        clickLink("Disappearing Elements");
        return new DisappearingElementsPage(driver);
    }

    // (10) Drag and Drop - Not implemented yet
    public DragandDropPage clickOndragandDropPage() {
        clickLink("Drag and Drop");
        return new DragandDropPage(driver);
    }

    // (11) Dropdown
    public DropDownPage clickOnDropdown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    // (12) Dynamic Content
    public DynamicContentPage clickOnDynamicContentPage() {
        clickLink("Dynamic Content");
        return new DynamicContentPage(driver);
    }

    // (13) Dynamic Controls
    public DynamicControlsPage clickOndynamicControlsPage() {
        clickLink("Dynamic Controls");
        return new DynamicControlsPage(driver);
    }

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

    // (16) Exit Intent

    // (17) File Download
    public FileDownloadPage clickOmfileDownloadPage() {
        clickLink("File Download");
        return new FileDownloadPage(driver);
    }

    // (18) File Upload
    public FileUploadPage clickOnFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    // (19) Floating Menu
    public FloatingMenuPage clickOnfloatingMenuPage() {
        clickLink("Floating Menu");
        return new FloatingMenuPage(driver);
    }

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

    // (23) Geolocation
    public GeolocationPage clickOnGeolocationPage() {
        clickLink("Geolocation");
        return new GeolocationPage(driver);
    }

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

    // (27) Inputs
    public InputsPage clickOninputsPage() {
        clickLink("Inputs");
        return new InputsPage(driver);
    }

    // (28) JQuery UI Menus
    public JQueryUIMenusPage clickOnjQueryUIMenusPage() {
        clickLink("JQuery UI Menus");
        return new JQueryUIMenusPage(driver);
    }

    // (29) JavaScript Alerts
    public JavaScriptAlertsPage clickOnJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    // (30) JavaScript onload event error
    public JavaScriptErrorPage clickOnJavaScriptErrorPage() {
        clickLink("JavaScript onload event error");
        return new JavaScriptErrorPage(driver);
    }

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

    // (35) Notification Messages
    public NotificationMessagesPage clickOnnotificationMessagesPage() {
        clickLink("Notification Messages");
        return new NotificationMessagesPage(driver);
    }

    // (36) Redirect Link
    public RedirectLinkPage clickOnredirectLinkPage() {
        clickLink("Redirect Link");
        return new RedirectLinkPage(driver);
    }

    // (37) Secure File Download
    public FileDownloadSecurePage clickOnFileDownloadSecurePage() {
        // فتح الصفحة مباشرة مع Basic Authentication
        driver.get("https://admin:admin@the-internet.herokuapp.com/download_secure");
        return new FileDownloadSecurePage(driver);
    }

    // (38) Shadow DOM
    // (39) Shifting Content
    public ShiftingContentPage clickOnshiftingContentPage() {
        clickLink("Shifting Content");
        return new ShiftingContentPage(driver);
    }

    // (40) Slow Resources
    public SlowResourcesPage clickOnSlowResources() {
        clickLink("Slow Resources");
        return new SlowResourcesPage(driver);
    }

    // (41) Sortable Data Tables
    public SortableDataTablesPage clickOnsortableDataTablesPage() {
        clickLink("Sortable Data Tables");
        return new SortableDataTablesPage(driver);
    }

    // (42) Status Codes
    public StatusCodesPage clickOnstatusCodesPage() {
        clickLink("Status Codes");
        return new StatusCodesPage(driver);
    }

    // (43) Typos
    public TyposPage clickOnTypos() {
        clickLink("Typos");
        return new TyposPage(driver);
    }



}
