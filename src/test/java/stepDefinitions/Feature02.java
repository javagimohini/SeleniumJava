package stepDefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.api.*;
import cucumber.api.java.en.*;
import helpers.TestContext;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.AuthenticationPage;
import pageObjects.BasePO;
import pageObjects.DressesSelectionPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.WomenSelectionPage;

public class Feature02 {

	HomePage homePage;
	AuthenticationPage authPage;
	WomenSelectionPage womenSelectPage;
	
	TestContext testContext;
	
	public Feature02(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		authPage = testContext.getPageObjectManager().getAuthenticationPage();
		womenSelectPage = testContext.getPageObjectManager().getWomenSelectionPage();
	}

	SoftAssert sa = new SoftAssert();
	
	@When("^I click on women button$")
	public void selectType() throws Throwable {
		homePage.waitForPageToLoad();
		homePage.selectWomenType();
	}

	@Then("^I should see WomenTitle displayed$")
	public void validateWomenTitle() throws Throwable {
		womenSelectPage.waitForPageToLoad();
		sa.assertEquals("Women - My Store", womenSelectPage.getTitle());
	}
	
    @And("^I enter (.+) and (.+)$")
    public void setCredentialDetails(String userName, String password) throws Throwable {
    	authPage.setCredentialsUsingSceOut(userName, password);
    }
}
