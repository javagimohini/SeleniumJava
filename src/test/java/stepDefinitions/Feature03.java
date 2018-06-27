package stepDefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
import pageObjects.TShirtsProductPage;
import pageObjects.UserActionsPage;
import pageObjects.WomenSelectionPage;

public class Feature03 {

	HomePage homePage;
	TShirtsProductPage tShirtsProductPage;
	UserActionsPage userActionspage;

	TestContext testContext;

	public Feature03(TestContext context) {
		testContext = context;

		homePage = testContext.getPageObjectManager().getHomePage();
		tShirtsProductPage = testContext.getPageObjectManager().getTShirtsProductPage();
		userActionspage = testContext.getPageObjectManager().getUserActionsPage();
		
	}

	SoftAssert sa = new SoftAssert();

	@When("^I click on women mouseover and select Tshirts$")
	public void i_click_on_women_mouseover_and_select() throws Throwable {
		homePage.selectWomenMouseover();

	}

	@Then("^I should see Tshirts text in Tshirts product page$")
	public void i_should_see_tshirts_text_in_tshirts_product_page() throws Throwable {
		tShirtsProductPage.getTShirtsTitle();

	}
	
	@And("^I verify textinput and retrieve value$")
    public void i_verify_textinput_and_retrieve_value() throws Throwable {
		userActionspage.textboxinput();
		
    }
	
	@And("^I click on checkbox and verify selected enabled and displayed status$")
    public void i_click_on_checkbox_and_verify_selected_enabled_and_displayed_status() throws Throwable {
		userActionspage.checkbox();
    }
	
	@And("^I click on radiobutton and verify selected enabled and displayed status$")
    public void i_click_on_radiobutton_and_verify_selected_enabled_and_displayed_status() throws Throwable {
		userActionspage.radiobutton();
    }
	
	@And("^I click on dropdownbutton select an item and verify selected enabled and displayed status$")
    public void i_click_on_dropdownbutton_select_an_item_and_verify_selected_enabled_and_displayed_status() throws Throwable {
         userActionspage.dropdown();
	}
	
    @And("^I verify drag and drop from one position to other$")
    public void i_verify_drag_and_drop_from_one_position_to_other() throws Throwable {
    userActionspage.dragAndDrop();
    
    }
	
    @And("^I verify multiselect option$")
    public void i_verify_multiselect_option() throws Throwable {
    	userActionspage.MultiSelect();
    	
    	
	}
	
    @And("^I verify finding all links on page$")
    public void i_verify_finding_all_links_on_page() throws Throwable {
       userActionspage.FindAllLinks();
    
    }
	 
	
	
	
	
	
}
