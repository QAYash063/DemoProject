package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","html:target/RunCuke/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},   //,"com.cucumber.listener.ExtentCucumberFormatter"
		features = "src/test/resources/feature",
		glue = "steps",
		tags = "@Login"		
		
		)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
