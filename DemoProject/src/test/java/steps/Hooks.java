package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utlis.SeleniumDriver;

public class Hooks {
	
	 @Before
	    public void setup(Scenario scenario) {
		
				
				SeleniumDriver.setUpDriver();
				
			
	    }
	     
	    @After
	    public void teardown(Scenario scenario) {
	        try {
	            String screenshotName = scenario.getName().replaceAll(" ", "_");
	            if (scenario.isFailed()) {
	                TakesScreenshot ts = (TakesScreenshot) SeleniumDriver.getDriver();
	                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	                scenario.attach(screenshot, "img/png", screenshotName);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        SeleniumDriver.tearDown();
	    }
	

}
