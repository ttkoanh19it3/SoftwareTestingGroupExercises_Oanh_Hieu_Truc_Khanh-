package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By userNameTxt = By.id("username");

    private By passwordTxt = By.id("password");

    private By inpatientButton = By.id("Inpatient Ward");

    private By loginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName) {

        driver.findElement(userNameTxt).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordTxt).sendKeys(password);
    }

    public void clickInpatientButton() {
        driver.findElement(inpatientButton).click();
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public HomePage loginToHomePage() {
        this.setUserName("Admin");
        this.setPassword("Admin123");
        this.clickInpatientButton();
        this.clickLoginButton();
        return new HomePage(driver);
    }
}
