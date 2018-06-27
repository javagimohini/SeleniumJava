package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class MyAccountPage extends BasePO{

	SoftAssert sa = new SoftAssert();
	
	public MyAccountPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		initialise(this);
	}

	@FindBy(how=How.CLASS_NAME, using = "page-heading") private WebElement pageHeading; 
	@FindBy(how=How.CLASS_NAME, using = "logout") private WebElement signOut; 
		
	public String getPageHeading() {
		return pageHeading.getText();
	}
	
	public void clickSignOutBtn() {
		signOut.click();
	}
}
