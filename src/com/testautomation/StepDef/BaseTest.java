package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseTest {

    private WebDriver driver;
    private String baseUrl;
    PropertiesFileReader obj = new PropertiesFileReader();

/*    @Before("@Pulse")
    public WebDriver setUpDriver() throws Throwable {
        Properties properties = obj.getProperty();
        if (driver == null) {
            driver = BrowserUtility.getDriver(properties.getProperty("browser.name"), properties.getProperty("browser.pulse_baseURL"));
            System.out.println("Pulse :" + properties.getProperty("browser.pulse_baseURL"));
        }
        return driver;
    }*/

    @After
    public void tearDown() {
        BrowserUtility.quitDriver();
        driver = null;
    }


    @Before
    public void setUpDriver(Scenario scenario) throws Throwable {
        String scenarioName = scenario.getSourceTagNames().toString();
        Properties properties = obj.getProperty();

        if (scenarioName.contains("@Pulse")) {
            baseUrl = properties.getProperty("browser.pulse_baseURL");
        } else if (scenarioName.contains("@Inspire")) {
            baseUrl = properties.getProperty("browser.inspire_baseURL");
        }

        if (driver == null) {
            driver = BrowserUtility.getDriver(obj.getProperty().getProperty("browser.name"), baseUrl);
            System.out.println("Base URL: " + baseUrl);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

}
