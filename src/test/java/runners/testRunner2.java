package runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "classpath:features/",
		glue = {"stepDefinitions", "hooks"},
//		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}, // not working
//		tags = {"@test","~@ignore"},
				tags = {"@test2"},
		format= {
                "pretty",
                "html:RunReports/cucumber-pretty",
                "json:RunReports/CucumberTestReport.json",
                "json:RunReports/rerun.txt"
		})
public class testRunner2 extends AbstractTestNGCucumberTests{

}
