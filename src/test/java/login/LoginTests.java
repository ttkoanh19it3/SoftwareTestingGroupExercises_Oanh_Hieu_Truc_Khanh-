package login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {
    @Test
    @DisplayName("TC_001-Verify User is able to login with CORRECT User Id and Password")
    public void testLoginSuccessfully(){
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin123");
        loginPage.clickInpatientButton();
        loginPage.clickLoginButton();
    }
    @Test
    @DisplayName("TC_002 - Verify User is NOT able to login with INCORRECT User Id and CORRECT Password")
    public void tc002(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("Adminna");
        loginPage.setPassword("Admin123");
        loginPage.clickLoginButton();
        String statusAlert = loginPage.getAlert();
        Assertions.assertTrue(statusAlert.contains("User or Password is not valid"));
    }
    @Test
    @DisplayName("TC_003 - Verify User is NOT able to login with CORRECT User Id and INCORRECT Password")
    public void tc003(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin");
        loginPage.setPassword("12345");
        loginPage.clickLoginButton();
        String statusAlert = loginPage.getAlert();
        Assertions.assertTrue(statusAlert.contains("User or Password is not valid"));
    }

}
