package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenSelectionPage extends BasePO{

	public WomenSelectionPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
