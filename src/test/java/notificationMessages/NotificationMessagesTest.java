package notificationMessages;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagesPage;

import java.util.Arrays;
import java.util.List;

public class NotificationMessagesTest extends BaseTests {

    @Test
    public void testNotificationMessages() {
        NotificationMessagesPage notificationPage = homePage.clickOnnotificationMessagesPage();

        notificationPage.clickHereLink();
        String message = notificationPage.getNotificationMessage();

        List<String> possibleMessages = Arrays.asList(
                "Action successful",
                "Action unsuccessful, please try again",
                "Action unsuccesful" // intentional typo in site
        );

        boolean match = possibleMessages.stream().anyMatch(message::contains);

        Assert.assertTrue(match, "Unexpected message: " + message);
    }
}
