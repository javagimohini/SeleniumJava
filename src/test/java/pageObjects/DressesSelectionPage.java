package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesSelectionPage extends BasePO{

	public DressesSelectionPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
