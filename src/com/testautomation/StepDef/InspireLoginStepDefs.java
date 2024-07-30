package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.InspireLoginPage;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class InspireLoginStepDefs extends ExtentReportListener {

    PropertiesFileReader obj = new PropertiesFileReader();
    private WebDriver driver;
    ExtentTest logInfo = null;

    @Before("@Inspire")
    public void setUpDriver() throws Throwable {
        Properties properties = obj.getProperty();
        driver = BrowserUtility.getDriver(properties.getProperty("browser.name"), properties.getProperty("browser.baseURL"));
        System.out.println("Inspire :" + properties.getProperty("browser.baseURL"));
    }

    @After("@Inspire")
    public void tearDown() {
        BrowserUtility.quitDriver();
    }

    @Given("Open Chrome browser with a Inspire URL")
    public void openChromeBrowserWithAInspireURL() {
        try {
            test = extent.createTest(Feature.class, "AppV6 Login validation");
            test = test.createNode(Scenario.class, "AppV6 Login - Success validations");
            logInfo = test.createNode(new GherkinKeyword("Given"), "open_Chrome_browser_with_URL");
            Properties properties = obj.getProperty();
            logInfo.pass("Opened chrome browser and entered url");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @When("Enter user name as email address {string}")
    public void enterUserNameAsEmailAddress(String emailaddress) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "enter_email_address");
            new InspireLoginPage(driver).enterEmail(emailaddress);
            logInfo.pass("Entering email address");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter user password {string}")
    public void enterUserPassword(String password) {
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "enter_password");
            new InspireLoginPage(driver).enterPassword(password);
            logInfo.pass("Entering password");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click the Login button")
    public void clickTheLoginButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Click_login_button");
            new InspireLoginPage(driver).ClickLoginBtn();
            Thread.sleep(7000);
            logInfo.pass("Clicking login");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }
}
