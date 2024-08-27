package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.inspirePages.*;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Inspire_user_management_StepDefs extends ExtentReportListener {

    PropertiesFileReader obj = new PropertiesFileReader();
    private WebDriver driver;
    ExtentTest logInfo = null;

    public Inspire_user_management_StepDefs(BaseTest baseTest) throws Throwable {
        this.driver = baseTest.getDriver();
    }

    @And("Click {string} from drop down menu of main items")
    public void clickFromDropDownMenuOfMainItems(String dp) {

        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click drop down "+dp+" menuitem");
            new InspireUserCreatePage(driver).clickDropdown(dp);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Click add new app user button")
    public void clickAddNewAppUserButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click add app button");
            new InspireUserCreatePage(driver).clickAddAppUserBtn();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("add app name {string}")
    public void addAppName(String appName) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering app name");
            String loginsUser = LoginsPage.userName;
            new InspireUserCreatePage(driver).enterName(loginsUser);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("add email {string}")
    public void addEmail(String email) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering app email");
            String loginsEmail = LoginsPage.email;
            new InspireUserCreatePage(driver).enterEmail(loginsEmail);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("add department {string}")
    public void addDepartment(String dept) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Selecting department");
            new InspireUserCreatePage(driver).selectADept(dept);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("add security role {string}")
    public void addSecurityRole(String role) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Selecting role");
            new InspireUserCreatePage(driver).selectARole(role);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("add time zone {string}")
    public void addTimeZone(String timeZone) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Selecting time Zone");
            new InspireUserCreatePage(driver).selectATimeZone(timeZone);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Click Save application user button")
    public void clickSaveApplicationUserButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking save app button");
            new InspireUserCreatePage(driver).clickSaveBtn();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Make sure user list page is appeared")
    public void makeSureUserListPageIsAppeared() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Making sure user list page is appeared");
            new InspireUserCreatePage(driver).IsUserListPage();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Tick Clear Lock Out")
    public void tickClearLockOut() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Making sure user list page is appeared");
            new InspireUserCreatePage(driver).tickClearLockOut();
            logInfo.pass("Making sure user list page is appeared");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Tick Host Setting")
    public void tickHostSetting() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Tick Host Setting");
            new InspireUserCreatePage(driver).clickTickHostSetting();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Tick Usage Settings")
    public void tickUsageSettings() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Tick Host Setting");
            new InspireUserCreatePage(driver).tickUsageSettings();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Tick General Application Security Settings")
    public void tickGeneralApplicationSecuritySettings() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Tick Host Setting");
            new InspireUserCreatePage(driver).tickGeneralApplicationSecuritySettings();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Tick Specific Security Settings")
    public void tickSpecificSecuritySettings() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Tick Host Setting");
            new InspireUserCreatePage(driver).tickSpecificSecuritySettings();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("enter Minimum Adjustment of {string} and Points to Maximum {string} Points")
    public void enterMinimumAdjustmentOfAndPointsToMaximumPoints(String min, String max) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Tick Host Setting");
            new InspireUserCreatePage(driver).enterMinimumAdjustmentOfAndPointsToMaximumPoints(min, max);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @When("Enter club name {string}")
    public void enterClubName(String name) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering name");
            new InspireClubCreatePage(driver).enterName(name);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter external refernce {string}")
    public void enterExternalRefernce(String name) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering name");
            new InspireClubCreatePage(driver).enterRef(name);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click save button")
    public void clickSaveButton() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Click save button");
            new InspireClubCreatePage(driver).clickSaveBtn();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter reward name {string}")
    public void enterRewardName(String name) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering name");
            new InspireForceRewardPage(driver).enterName(name);
            logInfo = test.createNode(new GherkinKeyword("And"), "Rewardname "+ InspireForceRewardPage.rewardname);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter description")
    public void enterDescription() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering name");
            new InspireForceRewardPage(driver).enterDescription();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter retail value {string}")
    public void enterRetailValue(String value) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering Retail value");
            new InspireForceRewardPage(driver).enterReatilValue(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter point level value {string}")
    public void enterPointLevelValue(String value) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering point value");
            new InspireForceRewardPage(driver).enterPointValue(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter your cost value {string}")
    public void enterYourCostValue(String value) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering cost");
            new InspireForceRewardPage(driver).enterCostValue(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select eligibility member club")
    public void selectEligibilityBemberClub() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Selecting club");
            new InspireForceRewardPage(driver).tickClub(InspireClubCreatePage.clubName);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click reward save button")
    public void clickRewardSaveButton() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Click save button");
            new InspireForceRewardPage(driver).clickRewardSaveButton();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Starts At value {string}")
    public void enterStartsAtValue(String value) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering cost");
            new InspireForceRewardPage(driver).enterStartAt(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Interval - Recur every value {string}")
    public void enterIntervalRecurEveryValue(String value) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering cost");
            new InspireForceRewardPage(driver).enterIntervalRecurEveryValue(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Member Issue Limits {string}")
    public void enterMemberIssueLimits(String value) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering cost");
            new InspireForceRewardPage(driver).enterMemberIssueLimits(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Survey Set Name name {string}")
    public void enterSurveySetNameName(String name) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering name");
            new InspireSurveySetPage(driver).enterName(name);
            logInfo = test.createNode(new GherkinKeyword("And"), "Rewardname "+ InspireForceRewardPage.rewardname);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }
}
