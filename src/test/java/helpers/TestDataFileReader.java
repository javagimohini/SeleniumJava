package helpers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestDataFileReader {

	String testDataFilePath = ".\\src\\test\\resources\\testData\\testData.properties";
	Properties properties;

	public TestDataFileReader() {
		BufferedReader reader;
		properties = new Properties();
		try {
			reader = new BufferedReader(new FileReader(testDataFilePath));
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			throw new RuntimeException("Test Data file has not found at the location path:" + testDataFilePath);
		}
	}
	
	public String getTestDatavalue(String key) {
		return properties.getProperty(key);		
	}

}
