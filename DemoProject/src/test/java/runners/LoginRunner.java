package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","html:target/RunCuke/cucumber.html"},   //,"com.cucumber.listener.ExtentCucumberFormatter"
		features = "src/test/resources/feature",
		glue = "steps",
		tags = "@Login"		
		
		)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
