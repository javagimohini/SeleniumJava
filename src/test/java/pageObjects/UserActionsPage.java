package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

import helpers.ConfigFileReader;
import managers.FileReaderManager;

public class UserActionsPage extends BasePO {

	public UserActionsPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		initialise(this);
	}
	
	@FindBy(how = How.ID, using = "cpar1")
	private WebElement percentageinputbox;

	@FindBy(how = How.ID, using = "caddoptional")
	private WebElement checkbox;
	@FindBy(how = How.ID, using = "cpayoff1")
	private WebElement radiobutton;

	@FindBy(how = How.ID, using = "ccompound")
	private WebElement dropdownElement;
	
	@FindBy(how = How.ID, using = "ContentHolder_lbFeatures_LBT")
	private WebElement Features;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j3_7']/a")
	private WebElement dragFrom;

	@FindBy(how = How.XPATH, using = ".//*[@id='j3_1']/a")
	private WebElement DropTo;

	
	@FindBy(how = How.TAG_NAME, using = "a")
	private List<WebElement> link;
	

	Actions action = new Actions(driver);
	SoftAssert sa = new SoftAssert();
	static Logger log = Logger.getLogger(UserActionsPage.class);

	public void launchHomePage() {
		try {
			String url = FileReaderManager.getInstance().getConfigFileReader().getHomePageURL();
			driver.get(url);
			waitForPageToLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectType(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void textboxinput() throws InterruptedException {
		// Enter value 10 in the first number of the percent Calculator
		percentageinputbox.sendKeys("10");
		Thread.sleep(500);
		// Get the text box from the application
		String result = percentageinputbox.getAttribute("value");
		System.out.println(" The Result retrieved from text input " + result);
		// log.info("The result from log" + result);
	}

	public void checkbox() throws InterruptedException {
		// Click on check Box
//		checkbox.click();
		System.out.println("The checkbox is selected" + checkbox.isSelected());
		System.out.println("The checkbox is Enabled" + checkbox.isEnabled());
		System.out.println("The checkbox is Displayed" + checkbox.isDisplayed());

	}

	public void radiobutton() throws InterruptedException {
		// Click on radiobutton
		radiobutton.click();
		System.out.println("The radiobutton is selected" + radiobutton.isSelected());
		System.out.println("The radiobutton is Enabled" + radiobutton.isEnabled());
		System.out.println("The radiobutton is Displayed" + radiobutton.isDisplayed());

	}

	public void dropdown() throws InterruptedException {
		// select dropdown item with text
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("continuously");
		// can also use index to select second element as
		// dropdown.selectByIndex(1);
		// once the item is selected get the value of the element
		// System.out.println("The dropdown item ------" + dropdownElement.getAttribute("value"));
		// can also use by value where index starts with zero
		// dropdown.selectByValue("annually");

		System.out.println("The dropdown item is selected" + dropdownElement.isSelected());
		System.out.println("The dropdown item is Enabled" + dropdownElement.isEnabled());
		System.out.println("The dropdwn item is Displayed" + dropdownElement.isDisplayed());

	}

	public void dragAndDrop() throws InterruptedException {
		// drag the element "Disabled node" from to
		//For right click can use context click
//		action.contextClick(dragFrom);
//		Thread.sleep(1000);
		Action dragAndDrop = action.clickAndHold(dragFrom).moveToElement(DropTo).release(DropTo).build();
		dragAndDrop.perform();
	}
	
	
	public void MultiSelect() throws InterruptedException {		
		//perform Multiple select
		List<WebElement> options = Features.findElements(By.tagName("td"));
		
		System.out.println(options.size());
		Action multiselect = action.keyDown(Keys.CONTROL).click(options.get(2)).click(options.get(4)).click(options.get(6)).build();
		multiselect.perform();
		
	}
	
	
	public void FindAllLinks() throws InterruptedException {		
		System.out.println("Number of links on the page is" + link.size());
		
		
		//Boundary exception is thrown when the size is 60 , changed below as i <=30 
		//for ( int i = 0; i<=link.size();i++) {

		
		for ( int i = 0; i<=30;i++) {
			System.out.println("Name of the Link#" + i + link.get(i).getText());
			
			
		}
		
	}
	
	

}
