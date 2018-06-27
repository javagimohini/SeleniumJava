package runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = "src/test/resources/features", glue = { "stepDefinitions" },
		// features = "classpath:features/",
		// glue = {"stepDefinitions", "hooks"},
		// tags = {"@test","~@ignore"},
		tags = { "@test1" }, 
		format = { "pretty", "html:RunReports/cucumber-pretty",
				"json:RunReports/CucumberTestReport.json", 
				"json:RunReports/rerun.txt" })
public class testRunner1 extends AbstractTestNGCucumberTests {

}
