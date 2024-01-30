package pages.action;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.DemoLoginPageLocators;



public class DemoLoginPageAction {
	
	private WebDriverWait wait;
    private DemoLoginPageLocators demoLoginPageLocators;

    public DemoLoginPageAction(WebDriver driver) {
        this.wait = new WebDriverWait(driver,(10));
        this.demoLoginPageLocators = new DemoLoginPageLocators(driver);
    }
    
    public void checkContent() {
        WebElement logoLogin = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.loginPageLogo()));
        logoLogin.isDisplayed();

        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.usernameField()));
        usernameField.isDisplayed();

        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.passwordField()));
        passwordField.isDisplayed();

        WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.loginButton()));
        loginButton.isDisplayed();
    }
    
    public void enterUsername(String username) {
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.usernameField()));
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.passwordField()));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.loginButton()));
        loginButton.click();
    }

    public String checkErrorMessage() {
        WebElement errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(demoLoginPageLocators.loginErrorMessage()));
        String errorText = errorMessage.getText();

        return errorText;
    }

	
	

}
