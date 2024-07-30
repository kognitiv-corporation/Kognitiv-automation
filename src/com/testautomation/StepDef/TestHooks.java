package com.testautomation.StepDef;

import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class TestHooks {

	private WebDriver driver;
	private Properties properties;

/*	@Before
	public void setUp(Scenario scenario) throws Throwable {
		properties = new PropertiesFileReader().getProperty();
		driver = BrowserUtility.getDriver(properties.getProperty("browser.name"), properties.getProperty("browser.baseURL"));
	}

	@After
	public void tearDown(Scenario scenario) {
		if (driver != null) {
			BrowserUtility.quitDriver();
		}
	}*/

}
