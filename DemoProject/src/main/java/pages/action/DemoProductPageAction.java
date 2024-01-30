package pages.action;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import pages.locators.DemoProductPageLocators;

public class DemoProductPageAction {
	
	 private WebDriverWait wait;
	    private DemoProductPageLocators demoProductPageLocators;
	    
	    public DemoProductPageAction(WebDriver driver) {
	        this.wait = new WebDriverWait(driver,10);
	        this.demoProductPageLocators = new DemoProductPageLocators(driver);
	    }
	    
	    public Boolean checkTitleIsDisplayed() {
	    	WebElement productPageText = wait.until(ExpectedConditions.presenceOfElementLocated(demoProductPageLocators.productPageText()));
	    	Boolean isDisplayed = productPageText.isDisplayed();
			return isDisplayed;
	        
	    }
	    
	    public String checkTextTitle() {
	        WebElement productPageTitle = wait.until(ExpectedConditions.presenceOfElementLocated(demoProductPageLocators.productPageText()));
	        String textTitle = productPageTitle.getText();

	        return textTitle;
	    }

}
