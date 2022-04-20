package registerPatient;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RegisterPatientPage;

public class registerPatientTests extends BaseTests {


 @Test
    @DisplayName("TC_009-Verify click on the Unidentified Patient textbox")
    public void testUnIdentifiedChecked() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.checkUnidentifiedBox();
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

  @Test
    @DisplayName("TC_016-Verify the Required field of patient's name is not filled ")
    public void testNotFilledAndUnChecked() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC_018-Verify Gender Selected male or female")
    public void testGenderIsChosen() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "Trung", "Hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC019-Verify if No Gender Selected")
    public void testGenderIsNotChosen() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "trung", "hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
  @DisplayName("TC_026-Check if the month is not selected")
    public void testUnselectedMonth() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setBirthdateDayField("9","", "2021");
        registerPatientPage.setDayField("32");
//        registerPatientPage.setMonthField(("1"));
        registerPatientPage.setYearField(("2001"));
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC_027-Check Invalid Year: Year < 1902 and Year > 2022")
    public void testInvalidYear() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setBirthdateDayField("9","2", "1901");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

@Test
    @DisplayName("TC_027-Check Invalid Year: Year < 1902 and Year > 2022")
    public void testInvalidDateInput() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setBirthdateDayField("a","2", "2030");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC_028-Check the date is valid but in the future")
    public void testFutureDate() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setBirthdateDayField("15","12", "2022");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

   / @Test
    @DisplayName("TC_029-Verify the patient's birth date by entering Estimated Years, Estimated Month")
    public void testFilledEstimate() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setEstimatedTime("15","8");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }




   / @Test
    @DisplayName("TC_039-Verify that the phone number is invalid")
    public void testInvalidPhoneNumber() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "Trung", "Hieu");
        registerPatientPage.clickNextButton();
        registerPatientPage.setGender("Male");
        registerPatientPage.clickNextButton();
        registerPatientPage.setEstimatedTime("21","10");
        registerPatientPage.clickNextButton();
        registerPatientPage.setAddress("1", "Da Nang");
        registerPatientPage.clickNextButton();
        registerPatientPage.setPhoneNumber("abc123");
        Thread.sleep(5000);
    }
}
