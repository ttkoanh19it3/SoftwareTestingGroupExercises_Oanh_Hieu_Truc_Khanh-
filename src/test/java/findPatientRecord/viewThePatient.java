package findPatientRecord;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FindPatientRecordPage;
import pages.HomePage;

public class viewThePatient extends BaseTests {
    @Test
    @DisplayName("TC_059-Verify patient records with patient health monitoring information through DIAGNOSES, VITALS, LATEST OBSERVATIONS, HEALTH TREND SUMMARY, WEIGHT GRAPH, RECENT VISITS, FAMILY, CONDITIONS, ATTACHMENTS, ALLERGIES")
    public void viewThePatientRecord(){
        HomePage homePage = loginPage.loginToHomePage();
        FindPatientRecordPage findPatientRecordPage = homePage.redirectToFindPatientRecord();
        findPatientRecordPage.setInputField("");
        findPatientRecordPage.viewThePage();
    }
}
