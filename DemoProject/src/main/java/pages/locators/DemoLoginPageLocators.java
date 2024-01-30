package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoLoginPageLocators {

	@SuppressWarnings("unused")
	private WebDriver driver;

	public DemoLoginPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public By loginPageLogo() {
		return By.xpath("//div[@class='login_logo']");
	}

	public By usernameField() {
		return By.id("user-name");
	}

	public By passwordField() {
		return By.id("password");
	}

	public By loginButton() {
		return By.id("login-button");
	}

	public By loginErrorMessage() {
		return By.xpath("//h3[@data-test='error']");
	}

}
