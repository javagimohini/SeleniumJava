package helpers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {

	Properties properties;
	private final String configFilePath = ".\\src\\test\\resources\\config\\configuration.properties";

	public ConfigFileReader() {
	
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(configFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + configFilePath);
		}
	}

	public String getChromeDriverPath() {
		return properties.getProperty("chromeDriverPath");
	}
	
	public String getFirefoxDriverPath() {
		return properties.getProperty("firefoxDriverPath");
	}
	
	public String getIEDriverPath() {
		return properties.getProperty("ieDriverPath");
	}
	
	public EnvironmentType getEnvironmentType() {
		String envType = properties.getProperty("environment");
		if(envType == null || envType.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(envType.equalsIgnoreCase("grid")) return EnvironmentType.GRID;
		else throw new RuntimeException("Environment Name Key value in Configuration.properties is not matched : " + envType);
	}
	
	public DriverType getBrowserType() {
		String browserName = properties.getProperty("browserType");
		if(browserName == null || browserName.equalsIgnoreCase("chrome"))return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox"))return DriverType.FIREFOX;
		else if(browserName.equalsIgnoreCase("ie"))return DriverType.IE;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	public String getHomePageURL() {
		return properties.getProperty("homePageURL");
	}
}
