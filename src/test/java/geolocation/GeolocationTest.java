package geolocation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GeolocationPage;

public class GeolocationTest extends BaseTests {

    @Test
    public void geolocationTest() {
        // Open Geolocation page
        GeolocationPage geolocationPage = homePage.clickOnGeolocationPage();

        // Click "Where am I?" button
        geolocationPage.clickWhereAmIButton();

        // Validate coordinates
        Assert.assertTrue(geolocationPage.checkMyLatitude(), "Latitude is incorrect or not displayed.");
        Assert.assertTrue(geolocationPage.checkMyLongitude(), "Longitude is incorrect or not displayed.");
    }
}
