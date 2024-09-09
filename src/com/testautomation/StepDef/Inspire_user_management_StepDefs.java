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
            logInfo = test.createNode(new GherkinKeyword("When"), "Click sub menu item "+dp);
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

    @Then("Click edit program question settings")
    public void clickEditProgramQuestionSettings() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Clicking edit program question settings");
            new InspireSurveySetPage(driver).clickEditProgramQuestionSettings();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select Device Global Survey Sets for club {string}")
    public void selectDeviceGlobalSurveySetsForClub(String club) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Selecting Device Global Survey Sets for club");
            new InspireSurveySetPage(driver).selectDeviceGlobalSurveySetsForClub(club);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Transaction Type Name {string}")
    public void enterTransactionTypeName(String name) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering Transaction Type Name");
            new InspireTransactionTypePage(driver).enterTransactionTypeName(name);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Transaction Type Public Name {string}")
    public void enterTransactionTypePublicName(String publicName) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering Transaction Type Public Name");
            new InspireTransactionTypePage(driver).enterTransactionTypePublicName(publicName);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Entrt Transaction Type {string}")
    public void entrtTransactionType(String type) {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering Transaction Type");
            new InspireTransactionTypePage(driver).entrtTransactionType(type);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Tick transaction Entry Issues Club Enrollment")
    public void tickTransactionEntryIssuesClubEnrollment() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Tick transaction Entry Issues Club Enrollment");
            new InspireTransactionTypePage(driver).tickTransactionEntryIssuesClubEnrollment();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select the club")
    public void vselectTheClub() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Select the club");
            //new InspireTransactionTypePage(driver).selectTheClub(InspireClubCreatePage.clubName);
            new InspireTransactionTypePage(driver).selectTheClub("Default Club");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select enroll at business unit {string}")
    public void selectEnrollAtBusinessUnit(String arg0) {
    }

    @And("Select enroll at location")
    public void selectEnrollAtLocation() {
    }

    @And("Give Account ID {string}")
    public void giveAccountID(String accId) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering Account ID");
            new InspireEnrollMemberPage(driver).giveAccountID(accId);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter first name {string}")
    public void enterFirstName(String firstName) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering first name");
            new InspireEnrollMemberPage(driver).enterFirstName(firstName);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter last name {string}")
    public void enterLastName(String lastname) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering Account ID");
            new InspireEnrollMemberPage(driver).enterLastName(lastname);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter birthday MM {string} DD {string} and YR {string}")
    public void enterBirthdayMMDDAndYR(String mm, String dd, String yr) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering Account ID");
            new InspireEnrollMemberPage(driver).enterBirthdayMMDDAndYR(mm,dd,yr);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Click Discard changes button")
    public void clickDiscardChangesButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking Discard changes button");
            new InspireEnrollMemberPage(driver).clickDiscardChangesButton();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter accId for search {string}")
    public void enterAccIdForSearch(String accId) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering Account ID");
            new InspireEnrollMemberPage(driver).enterAccIdForSearch(accId);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click Search Now button")
    public void clickSearchNowButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking Search Now button");
            new InspireEnrollMemberPage(driver).clickSearchNowButton();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Verify profile is displayed for the search accId")
    public void verifyProfileIsDisplayedForTheSearchAccId() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Verify profile is displayed for the search accId");
            new InspireEnrollMemberPage(driver).verifyProfileIsDisplayedForTheSearchAccId();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Verify first name and last name {string} {string}")
    public void verifyFirstNameAndLastName(String fname, String lname) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Verify first and last name is displayed in search view");
            new InspireEnrollMemberPage(driver).vwerifyFirstNameAndLastName(fname,lname);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select the club {string}")
    public void selectTheClub(String club) {
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Select the club");

            // Check if clubName is null
            String clubName = InspireClubCreatePage.clubName;
            if (clubName == null) {
                clubName = club;  // Default club name
            }

            // Select the club
            new InspireEnrollMemberPage(driver).tickClub(clubName);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click Activity tab from left side menu")
    public void clickActivityTabFromLeftSideMenu() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking Activity tab from left side menu");
            new InspireEnrollMemberPage(driver).clickActivityTabFromLeftSideMenu();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Tick Enrollment Survey Questions")
    public void tickEnrollmentSurveyQuestions() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Tick Enrollment Survey Questions");
            new InspireEnrollMemberPage(driver).tickEnrollmentSurveyQuestions();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Verify transaction type {string} value should be {string}")
    public void verifyTransactionTypeValueShouldBe(String trType, String valueOfTrType) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Verifying received bonius points for transaction type");
            new InspireEnrollMemberPage(driver).verifyTransactionTypeValueShouldBe(trType,valueOfTrType);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Click edit button of transaction type {string}")
    public void clickEditButtonOfTransactionType(String trType) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking edit button of transaction type");
            new InspireEnrollMemberPage(driver).clickEditButtopnOfTransactionType(trType);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }


    }

    @And("click checkbox of Check To Cancel Transaction")
    public void clickCheckboxOfCheckToCancelTransaction() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking checkbox of Check To Cancel Transaction");
            new InspireEnrollMemberPage(driver).clickCheckboxOfCheckToCancelTransaction();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter a choice reward name {string}")
    public void enterAChoiceRewardName(String name) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering a choice reward name");
            new InspireChoiceRewardPage(driver).enterAChoiceRewardName(name);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter a description for choice reward {string}")
    public void enterADescriptionForChoiceReward(String desc) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Enter a description for choice reward");
            new InspireChoiceRewardPage(driver).enterADescriptionForChoiceReward(desc);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter a Retail Value {string}")
    public void enterARetailValue(String value) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering a Retail Value");
            new InspireChoiceRewardPage(driver).enterARetailValue(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter a Point Amount {string}")
    public void enterAPointAmount(String value) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering a Point Amount");
            new InspireChoiceRewardPage(driver).enterAPointAmount(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter a Your Cost {string}")
    public void enterAYourCost(String value) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering a cost Amount");
            new InspireChoiceRewardPage(driver).enterAYourCost(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click manual transaction tab from left side menu")
    public void clickManualTransactionTabFromLeftSideMenu() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking manual transaction tab from left side menu");
            new InspireManaualTransaction(driver).clickManualTransactionTabFromLeftSideMenu();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select transaction type {string}")
    public void selectTransactionType(String trType) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Select transaction type "+trType);
            new InspireManaualTransaction(driver).selectTransactionType(trType);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter the Product Value	{string}")
    public void enterTheProductValue(String value) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Enter the Product Value "+value);
            new InspireManaualTransaction(driver).enterTheProductValue(value);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter the quantity {string}")
    public void enterTheQuantity(String qnt) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Enter the quantity "+qnt);
            new InspireManaualTransaction(driver).enterTheQuantity(qnt);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter the transaction value {string}")
    public void enterTheTransactionValue(String trValue) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Enter the transaction value "+trValue);
            new InspireManaualTransaction(driver).enterTheTransactionValue(trValue);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click tools from left side menu")
    public void clickToolsFromLeftSideMenu() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Elick tools from left side menu");
            new InspireManaualTransaction(driver).clickToolsFromLeftSideMenu();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }

    }

    @And("Click Process Forced Rewards")
    public void clickProcessForcedRewards() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click Process Forced Rewards");
            new InspireManaualTransaction(driver).clickProcessForcedRewards();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click pending delivery")
    public void clickPendingDelivery() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click pending delivery");
            new InspireManaualTransaction(driver).clickPendingDelivery();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @Then("Verify force reward displayed in pending delivery")
    public void verifyForceRewardDisplayedInPendingDelivery() {
    }

    @And("Click Process Recurring Rewards")
    public void clickProcessRecurringRewards() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click Process Recurring Rewards");
            new InspireManaualTransaction(driver).clickProcessRecurringRewards();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }
}
