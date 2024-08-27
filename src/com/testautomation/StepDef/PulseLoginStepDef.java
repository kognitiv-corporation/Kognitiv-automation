package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.pulsePages.PulseLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class PulseLoginStepDef extends ExtentReportListener {
    ExtentTest logInfo = null;
    WebDriver driver;

    public PulseLoginStepDef(BaseTest baseTest) throws Throwable {
        this.driver = baseTest.getDriver();

    }

    @Given("^Open Chrome browser with a URL$")
    public void open_Chrome_browser_with_a_URL() throws Throwable {
        ExtentTest logInfo = null;
        try {
            test = extent.createTest(Feature.class, "Pulse feature Test");
            test = test.createNode(Scenario.class, "Pulse success login");
            logInfo = test.createNode(new GherkinKeyword("Given"), "open_Chrome_browser_with_URL");
            //Properties properties = obj.getProperty();
            //driver= BrowserUtility.getDriver(properties.getProperty("browser.name"), properties.getProperty("browser.pulse_baseURL"));

            logInfo.pass("Opened chrome browser and entered url");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @When("Enter email address {string}")
    public void enterEmailAddress(String emailaddress) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("When"), "enter_email_address");
            new PulseLoginPage(driver).enterEmail(emailaddress);
            logInfo.pass("Entering email address");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "enter_password");
            new PulseLoginPage(driver).enterPassword(password);
            logInfo.pass("Entering password");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }

    }

    @And("Click Login button")
    public void clickLoginButton() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Click_login_button");
            new PulseLoginPage(driver).ClickLoginBtn();
            Thread.sleep(7000);
            logInfo.pass("Clicking login");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }


    @And("Validate login message {string}")
    public void validateLoginMessage(String status) {

        ExtentTest logInfo = null;
        PulseLoginPage loginPage = new PulseLoginPage(driver); // Correctly instantiate the login page object

        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Verifying login scenario");

            if (Boolean.parseBoolean(status)) {
                loginPage.verifyNoErrorMessage();
                logInfo.pass("No error message displayed as expected.");
            } else {
                loginPage.verifyErrorMessage();
                logInfo.pass("Error message displayed as expected.");
            }

            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }



}


