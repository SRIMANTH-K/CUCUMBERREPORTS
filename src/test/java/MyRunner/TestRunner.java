package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		 features = "C:\\Users\\srima\\workspace1\\CUCUMBERREPORTS\\src\\test\\java\\FeatureFile\\login.feature",
	        glue = {"stepDefinition"},
	        
	        format = {
	                "pretty",
	                "html:test-output",
	                "html:target/cucumber-reports/cucumber-pretty",
	                "json:target/cucumber-reports/CucumberTestReport.json",
	                "rerun:target/cucumber-reports/rerun.txt"}, 
	                monochrome=true,
		
		dryRun=false
		
		)


public class TestRunner {

}
