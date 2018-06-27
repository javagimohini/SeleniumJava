package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.TestDataFileReader;
import managers.FileReaderManager;

public class AuthenticationPage extends BasePO{

	public AuthenticationPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		initialise(this);
	}

	@FindBy(how=How.CLASS_NAME, using = "page-heading") private WebElement pageHeading; 
	@FindBy(how=How.ID, using = "email") private WebElement emailTxt;
	@FindBy(how=How.ID, using = "passwd") private WebElement pswdTxt; 
	@FindBy(how=How.ID, using = "SubmitLogin") private WebElement SignIn; 
	
	
	public String getPageHeading() {
		return pageHeading.getText();
	}
	
	public void setCredentials(Map <String,String>map) throws IOException {		
		String user = FileReaderManager.getInstance().getTestDataFileReader().getTestDatavalue(map.get("UserName"));
		String pass = FileReaderManager.getInstance().getTestDataFileReader().getTestDatavalue(map.get("Password"));
		emailTxt.sendKeys(user);
		pswdTxt.sendKeys(pass);
	}
	
	public void setCredentialsUsingSceOut(String userName, String password) {
		String user = FileReaderManager.getInstance().getTestDataFileReader().getTestDatavalue(userName);
		String pass = FileReaderManager.getInstance().getTestDataFileReader().getTestDatavalue(password);
		emailTxt.sendKeys(user);
		pswdTxt.sendKeys(pass);
	}
	
	public void clickSignInBtn() {
		SignIn.click();
	}
}
