package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {

	// private WebDriver driver;
	// private static DriverType driverType;
	// private static EnvironmentType environmentType;
	//
	// public WebDriverManager() {
	// driverType =
	// FileReaderManager.getInstance().getConfigFileReader().getBrowserType();
	// environmentType =
	// FileReaderManager.getInstance().getConfigFileReader().getEnvironmentType();
	// }
	//
	// public WebDriver getDriver() {
	// if (driver == null)
	// driver = createDriver();
	// return driver;
	// }
	//
	// private WebDriver createDriver() {
	// switch (environmentType) {
	// case LOCAL:
	// createLocalDriver();
	// break;
	// case GRID:
	// createGridDriver();
	// break;
	// }
	// return driver;
	// }
	//
	// private WebDriver createLocalDriver() {
	// switch (driverType) {
	// case CHROME:
	// System.setProperty("webdriver.chrome.driver",
	// FileReaderManager.getInstance().getConfigFileReader().getChromeDriverPath());
	// ChromeOptions chromeOptions = new ChromeOptions();
	// chromeOptions.addArguments("--start-maximized");
	// chromeOptions.addArguments("--ignore-certificate-errors");
	// chromeOptions.addArguments("--disable-popup-blocking");
	// // chromeOptions.addArguments("--incognito");
	// driver = new ChromeDriver(chromeOptions);
	// break;
	// case FIREFOX:
	// System.setProperty("webdriver.gecko.driver",
	// FileReaderManager.getInstance().getConfigFileReader().getFirefoxDriverPath());
	// FirefoxOptions firefoxOptions = new FirefoxOptions();
	// firefoxOptions.setCapability("AcceptUntrustedCertificates", true);
	// firefoxOptions.setCapability("AssumeUntrustedCertificateIssuer", true);
	// driver = new FirefoxDriver(firefoxOptions);
	// driver.manage().window().maximize();
	// break;
	// case IE:
	// System.setProperty("webdriver.ie.driver",
	// FileReaderManager.getInstance().getConfigFileReader().getIEDriverPath());
	// InternetExplorerOptions ieOptions = new InternetExplorerOptions();
	// ieOptions.setCapability("ignoreProtectedModeSettings", true);
	// ieOptions.setCapability("ignoreZoomSettings", true);
	// driver = new InternetExplorerDriver(ieOptions);
	// driver.manage().window().maximize();
	// break;
	// }
	//
	// return driver;
	// }
	//
	// private void createGridDriver() {
	// System.out.println("Code to create Grid driver");
	// }
	//
	// public void closeDriver() {
	// driver.close();
	// driver.quit();
	// }

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private static DriverType driverType;
	private static EnvironmentType environmentType;

	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowserType();
		environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnvironmentType();
	}

	public WebDriver getDriver() {
		if (driver.get() == null)
			createDriver();
		return driver.get();
	}

	private void createDriver() {
		switch (environmentType) {
		case LOCAL:
			createLocalDriver();
			break;
		case GRID:
			createGridDriver();
			break;
		}
	}

	private void createLocalDriver() {
		switch (driverType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver",
					FileReaderManager.getInstance().getConfigFileReader().getChromeDriverPath());
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--ignore-certificate-errors");
			chromeOptions.addArguments("--disable-popup-blocking");
			// chromeOptions.addArguments("--incognito");
			driver.set(new ChromeDriver(chromeOptions));
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver",
					FileReaderManager.getInstance().getConfigFileReader().getFirefoxDriverPath());
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("AcceptUntrustedCertificates", true);
			firefoxOptions.setCapability("AssumeUntrustedCertificateIssuer", true);
			driver.set(new FirefoxDriver(firefoxOptions));
			driver.get().manage().window().maximize();
			break;
		case IE:
			System.setProperty("webdriver.ie.driver",
					FileReaderManager.getInstance().getConfigFileReader().getIEDriverPath());
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			ieOptions.setCapability("ignoreProtectedModeSettings", true);
			ieOptions.setCapability("ignoreZoomSettings", true);
			driver.set(new InternetExplorerDriver(ieOptions));
			driver.get().manage().window().maximize();
			break;
		}
	}

	private void createGridDriver() {
		System.out.println("Code to create Grid driver");
	}

	public static void quit() {
		WebDriver currentDriver = driver.get();
		if (currentDriver != null) {
			currentDriver.quit();
			driver.remove();
//			driver.set(null);
		}
	}

}
