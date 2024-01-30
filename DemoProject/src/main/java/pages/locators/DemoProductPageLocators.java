package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoProductPageLocators {
	
	@SuppressWarnings("unused")
    private WebDriver driver;
	
	 public DemoProductPageLocators(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 public By productPageText() {
	        return By.xpath("//span[@class='title']"); 
	    }

}
