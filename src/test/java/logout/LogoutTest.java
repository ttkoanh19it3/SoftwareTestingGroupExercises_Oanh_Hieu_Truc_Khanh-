package logout;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class LogoutTest extends BaseTests  {
    @Test
    @DisplayName("TC_000-Logout successfully")
    public void testLogoutSuccessfully(){
        HomePage homePage = loginPage.loginToHomePage();
        homePage.logout();
    }
}
