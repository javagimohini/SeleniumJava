package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.ConfigFileReader;
import managers.FileReaderManager;


public class HomePage extends BasePO{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		initialise(this);
	}

	@FindBy(how=How.LINK_TEXT, using = "Sign in") private WebElement signIn; 
	@FindBy(how=How.LINK_TEXT, using = "Women") private WebElement womenType;
	@FindBy(how=How.XPATH, using ="//a[contains(text(),'Dresses')])[5]") private WebElement dressType;	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'T-shirts')])[2]") private WebElement Tshirts ;
	
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
	
	public void clickSignInLink() {
		wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
	}

	public void selectWomenType() {		
		wait.until(ExpectedConditions.elementToBeClickable(womenType)).click();
	}
	
	public void selectDressType() {		
		wait.until(ExpectedConditions.elementToBeClickable(dressType)).click();
	}
	
//	public String getMyField()
//	{
//	    return this.myField;
//	}
	
//	public WebElement getWomenElement() {
//		return this.womenType;		
//	}
}
