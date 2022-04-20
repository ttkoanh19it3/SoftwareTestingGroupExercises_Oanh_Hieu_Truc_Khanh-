package captureVital;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FindCaptureVitalPage;
import pages.HomePage;

public class captureVitalTests extends BaseTests {
    @Test
    @DisplayName("TC_072-Verify that the patient record is accessible to Capture Vitals")
    public void viewCaptureVital(){
        HomePage homePage = loginPage.loginToHomePage();
        FindCaptureVitalPage findCaptureVitalPage = homePage.redirectToFindCaptureVital();
        findCaptureVitalPage.setInputField("");
        findCaptureVitalPage.viewThePage();
    }
}
