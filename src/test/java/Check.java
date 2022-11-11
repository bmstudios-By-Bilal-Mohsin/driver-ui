import Methods.BrowserInitialize;
import Setup.DriverUI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Check extends DriverUI {

    BrowserInitialize browser = new BrowserInitialize();

    @BeforeMethod(alwaysRun = true)
    public void startBrowser() {
        super.startBrowser();
    }

    @Test(description = "Checking the test")
    public void iNavigateToTheHotelBookingFormPage() {

        browser.searchGoogle();
    }
}
