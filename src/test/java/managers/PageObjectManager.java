package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.AuthenticationPage;
import pageObjects.BasePO;
import pageObjects.DressesSelectionPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.WomenSelectionPage;

public class PageObjectManager {

	private WebDriver driver;
	private WebDriverWait wait;
	private BasePO basePO;
	private HomePage homePage;
	private AuthenticationPage authPage;
	private MyAccountPage myAccPage;
	private WomenSelectionPage womenSelectPage;
	private DressesSelectionPage dressSelectPage;
	
	public PageObjectManager(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public BasePO getBasePO() {
		return (basePO == null) ? basePO = new BasePO(driver,wait) : basePO;
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver,wait) : homePage;
	}
	
	public AuthenticationPage getAuthenticationPage() {
		return (authPage == null)? authPage = new AuthenticationPage(driver,wait) : authPage;
	}
	
	public MyAccountPage getMyAccountPage() {
		return (myAccPage == null)? myAccPage = new MyAccountPage(driver,wait) : myAccPage;
	}
	
	public WomenSelectionPage getWomenSelectionPage() {
		return (womenSelectPage == null)? womenSelectPage = new WomenSelectionPage(driver,wait) : womenSelectPage;
	}
	
	public DressesSelectionPage getDressesSelectionPage() {
		return (dressSelectPage == null)? dressSelectPage = new DressesSelectionPage(driver,wait) : dressSelectPage;
	}
	
	
}
