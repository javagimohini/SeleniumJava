package managers;

import helpers.ConfigFileReader;
import helpers.TestDataFileReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static TestDataFileReader testDataFileReader;

	private FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigFileReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

	public TestDataFileReader getTestDataFileReader() {
		return (testDataFileReader == null) ? new TestDataFileReader() : testDataFileReader;
	}
}
