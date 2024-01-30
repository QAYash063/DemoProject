package steps;

import static org.testng.Assert.assertEquals;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.DemoLoginPageAction;
import pages.action.DemoProductPageAction;
import utlis.SeleniumDriver;

public class Login_Demo_Steps {

	private DemoLoginPageAction demoLoginPageAction = new DemoLoginPageAction(SeleniumDriver.getDriver());
	private DemoProductPageAction demoProductPageAction = new DemoProductPageAction(SeleniumDriver.getDriver());

	@Given("I am on the Home Page {string} of website")
	public void i_am_on_the_home_page_of_jp_loft_website(String webSiteURL) {
		SeleniumDriver.getDriver().get(webSiteURL);
	}

	@When("I enter {string} as my username")
	public void i_enter_as_my_username(String username) {
		demoLoginPageAction.enterUsername(username);
	}

	@And("I enter {string} as my password")
	public void i_enter_as_my_password(String password) {
		demoLoginPageAction.enterPassword(password);
	}

	@And("I click login button")
	public void i_click_login_button() {
		demoLoginPageAction.clickLogin();
	}

	@Then("I success to access the website")
	public void i_success_to_access_the_website() {
		Boolean result = demoProductPageAction.checkTitleIsDisplayed();
		String text = demoProductPageAction.checkTextTitle();
		assertEquals(result, true);
		assertEquals(text, "Products");
	}

	@Then("I see an error message about invalid credential")
	public void i_see_an_error_message_about_invalid_credential() {
		String errorText = demoLoginPageAction.checkErrorMessage();

        assertEquals(errorText, utlis.AssertData.InvalidAccountErrorMessage);

	}

}
