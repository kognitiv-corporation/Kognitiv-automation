package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseTest extends ExtentReportListener {

    private WebDriver driver;
    private String baseUrl;
    PropertiesFileReader obj = new PropertiesFileReader();

    @Before
    public void setUpDriver(cucumber.api.Scenario scenario) throws Throwable {
        String scenarioName = scenario.getName(); // Get scenario name
        Properties properties = obj.getProperty();

        // Determine base URL based on tags
        if (scenario.getSourceTagNames().contains("@Pulse")) {
            baseUrl = properties.getProperty("browser.pulse_baseURL");
        } else if (scenario.getSourceTagNames().contains("@Inspire")) {
            baseUrl = properties.getProperty("browser.inspire_baseURL");
        }

        // Initialize driver if not already done
        if (driver == null) {
            driver = BrowserUtility.getDriver(properties.getProperty("browser.name"), baseUrl);
            System.out.println("Base URL: " + baseUrl);
        }

        // Create the test in the Extent report with the scenario name
        test = extent.createTest(Feature.class, scenarioName); // Create a feature node
        test = test.createNode(new GherkinKeyword("Scenario"), scenarioName); // Create a scenario node
    }



    @After
    public void tearDown() {
        BrowserUtility.quitDriver();
        driver = null;
    }

/*    @Before
    public void setUpDriver(Scenario scenario) throws Throwable {
        String scenarioName = scenario.getName(); // Get scenario name
        Properties properties = obj.getProperty();

        if (scenario.getSourceTagNames().contains("@Pulse")) {
            baseUrl = properties.getProperty("browser.pulse_baseURL");
        } else if (scenario.getSourceTagNames().contains("@Inspire")) {
            baseUrl = properties.getProperty("browser.inspire_baseURL");
        }

        if (driver == null) {
            driver = BrowserUtility.getDriver(obj.getProperty().getProperty("browser.name"), baseUrl);
            System.out.println("Base URL: " + baseUrl);
        }

        // Create the test with the scenario name
        test = extent.createTest(Feature.class, scenarioName);
    }*/



    public WebDriver getDriver() {
        return driver;
    }

}
