package steps;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
	  /*      
	    
	            if (scenario.isFailed()) {
	            	TakesScreenshot scrShot = (TakesScreenshot) SeleniumDriver.getDriver();
	    			Date date = new Date();
	    			System.setProperty("org.uncommons.reportng.escape-output", "false");
	    			String FileName = date.toString().replace(":", "_").replace(" ", "_") + ".png";
	    			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	    			File DestFile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshot\\" + FileName);
	    			try {
	    				FileUtils.copyFile(SrcFile, DestFile);
	    			} catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    			String st = DestFile.toString();
	    			System.out.println(st);
	    		}
	    	*/	
	    		WebDriver driver=SeleniumDriver.getDriver();
	        	System.out.println(scenario.isFailed());
	        	 if (scenario.isFailed()) {
	                 byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	                 scenario.attach(screenshotBytes, "image/png", "screenshot");
	                 
	              
	             }
	        SeleniumDriver.tearDown();
	    }
	

}
