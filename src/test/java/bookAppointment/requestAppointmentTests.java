package bookAppointment;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

public class requestAppointmentTests extends BaseTests {
    @Test
    @DisplayName("TC_067-Verify appointment booking in Appointment Requests")
    public void requestNewAppointment(){
        HomePage homePage = loginPage.loginToHomePage();
        FindPatientRecordPage findPatientRecordPage = homePage.redirectToFindPatientRecord();
        findPatientRecordPage.setInputField("");
        ViewThePatientPage viewThePatientPage = findPatientRecordPage.viewThePage();

        RequestAppointmentPage requestAppointmentPage = viewThePatientPage.redirectToRequestAppointmentPage();
//        requestAppointmentPage.setAppointmentType("Dermatology");
//        requestAppointmentPage.clickSaveButton();
    }
}
