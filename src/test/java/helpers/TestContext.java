package helpers;

import org.openqa.selenium.support.ui.WebDriverWait;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {
		webDriverManager = new WebDriverManager();
		WebDriverWait wait = new WebDriverWait(webDriverManager.getDriver(), 10);
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver(),wait);
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}


}
