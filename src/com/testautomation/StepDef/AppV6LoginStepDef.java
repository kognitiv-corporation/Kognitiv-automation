package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.AppV6LoginPage;
import com.testautomation.PageObjects.YoutubeSearchPage;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class AppV6LoginStepDef extends ExtentReportListener {

    PropertiesFileReader obj= new PropertiesFileReader();
    private WebDriver driver;

    @Given("^Open Chrome browser with a URL$")
    public void open_Chrome_browser_with_a_URL() throws Throwable
    {
        ExtentTest logInfo=null;
        try {
            test = extent.createTest(Feature.class, "AppV6 Login validation");
            test=test.createNode(Scenario.class, "AppV6 Login - Success validations");
            logInfo=test.createNode(new GherkinKeyword("Given"), "open_Chrome_browser_with_URL");
            Properties properties=obj.getProperty();
            driver= BrowserUtility.OpenBrowser(driver, properties.getProperty("browser.name"), properties.getProperty("browser.baseURL"));

            logInfo.pass("Opened chrome browser and entered url");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @When("Enter email address {string}")
    public void enterEmailAddress(String emailaddress) {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "enter_email_address");
            new AppV6LoginPage(driver).enterEmail(emailaddress);
            logInfo.pass("Entering email address");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("And"), "enter_email_address");
            new AppV6LoginPage(driver).enterPassword(password);
            logInfo.pass("Entering password");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }

    }

    @And("Click Login button")
    public void clickLoginButton() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("And"), "Click_login_button");
            new AppV6LoginPage(driver).ClickLoginBtn();
            logInfo.pass("Entering password");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @Then("Validate application name")
    public void validateApplicationName() {
    }

}
