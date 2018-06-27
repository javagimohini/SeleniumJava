package stepDefinitions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.TestContext;
import managers.WebDriverManager;

public class BeforeAfterHooks {

	static Logger log = Logger.getLogger(BeforeAfterHooks.class);
	
	TestContext testContext;
	
	public BeforeAfterHooks(TestContext context) {
		testContext = context;
	}
	
	 @Before
	 public void beforeScenario() {
	 log.info("Clear cookies -- start");
	 testContext.getWebDriverManager().getDriver().manage().deleteAllCookies();
	 log.info("Clear cookies -- end");
	 }

	 @After
	 public void captureScreenshot(Scenario scenario) {
	 if(scenario.isFailed()) {
	// scenario.write("Failed screenshot Url is" + driver.getCurrentUrl());
	 byte[] screenshot = ((TakesScreenshot)
			 testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
	 scenario.embed(screenshot, "image/png");
	 log.info("Screenshot captured");
	 }
	 WebDriverManager.quit();
	 }

}
