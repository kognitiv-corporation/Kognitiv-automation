package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.InspirePromotionPage;
import com.testautomation.PageObjects.pulsePages.PulseLandingPage;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Properties;

public class PulseLandingStepdefs extends ExtentReportListener {

    PropertiesFileReader obj = new PropertiesFileReader();
    private WebDriver driver;
    ExtentTest logInfo = null;

   @Before("@Pulse")
    public void setUpDriver() throws Throwable {
        Properties properties = obj.getProperty();
        //driver = BrowserUtility.getDriver(properties.getProperty("browser.name"), properties.getProperty("browser.pulse_baseURL"));
        driver = BrowserUtility.getDriver();
        System.out.println("Pulse :" + properties.getProperty("browser.pulse_baseURL"));
    }

    @After("@Pulse")
    public void tearDown() {
        BrowserUtility.quitDriver();
    }



    @Then("Validate report page name {string}")
    public void validateReportPageName(String pageName) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Verifying expected " + pageName + " page is loaded");
            new PulseLandingPage(driver).validatePageIsLoading(pageName);
            new PulseLandingPage(driver).getTitle();
            logInfo.pass("Title : " + new InspirePromotionPage(driver).getTitle());
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }


    @And("Verify show ranges button in unchecked")
    public void verifyShowRangesButtonInUnchecked() {
        ExtentTest logInfo = null;
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Verifying show range button is unchecked");
            PulseLandingPage pulseLandingPage = new PulseLandingPage(driver);
            if (pulseLandingPage.isToggleShowRangeSelected()) {
                logInfo.fail("Toggle already checked");
                throw new AssertionError("Toggle already checked");
            } else {
                logInfo.pass("Show range button is unchecked");
            }
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Toggle show ranges button")
    public void toggleShowRangesButton() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Clicking show range button");
            new PulseLandingPage(driver).clickBtnShowRange();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click configure button")
    public void clickConfigureButton() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Clicking configure button");
            new PulseLandingPage(driver).clickConfigureBtn();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select period as days {string}")
    public void selectPeriodAsDays(String days) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Select period from config drop down");
            new PulseLandingPage(driver).selectDays(days);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select Calculation for typical values as {string}")
    public void selectCalculationForTypicalValuesAs(String type) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Select period from config drop down");
            new PulseLandingPage(driver).selectTypeFromConfig();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Verify graph are displayed")
    public void verifyGraphAreDisplayed(DataTable graphNames) {
        ExtentTest logInfo = null;
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Verify graphs are displayed");
            List<String> graphs = graphNames.asList(String.class);
            PulseLandingPage pulseLandingPage = new PulseLandingPage(driver);
            for (String graphName : graphs) {
                pulseLandingPage.verifyGraphisDisplayed(graphName);
                logInfo.pass("Graph " + graphName + " is displayed");
            }
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }
}
