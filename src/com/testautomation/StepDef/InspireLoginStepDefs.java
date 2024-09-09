package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.inspirePages.BlueMenuBar;
import com.testautomation.PageObjects.inspirePages.InspireLoginPage;
import com.testautomation.PageObjects.inspirePages.InspirePromotionPage;
import com.testautomation.PageObjects.inspirePages.LoginsPage;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class InspireLoginStepDefs extends ExtentReportListener {

    PropertiesFileReader obj = new PropertiesFileReader();
    WebDriver driver;
    ExtentTest logInfo = null;

    public InspireLoginStepDefs(BaseTest baseTest) throws Throwable {
        this.driver = baseTest.getDriver();
    }



/*    @Given("Open Chrome browser with a Inspire URL")
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
    }*/

    @Given("Open Chrome browser with a Inspire URL")
    public void openChromeBrowserWithAInspireURL() {
        try {
            logInfo = test.createNode(new GherkinKeyword("Given"), "Opened chrome browser and entered url");
            Properties properties = obj.getProperty();
            //logInfo.pass("Opened chrome browser and entered url");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @When("Enter user name as email address {string}")
    public void enterUserNameAsEmailAddress(String emailaddress) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Entering email address");
            String loginsEmail = LoginsPage.email;
            if (emailaddress.equalsIgnoreCase("CreatedUser")) {
                new InspireLoginPage(driver).enterEmail(loginsEmail);
            } else {
                new InspireLoginPage(driver).enterEmail(emailaddress);
            }
            //logInfo.pass("Entering email address");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter user password {string}")
    public void enterUserPassword(String password) {
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Entering password");
            if (password.equalsIgnoreCase("123456")) {
                new InspireLoginPage(driver).enterPassword("123456");
            } else {
                new InspireLoginPage(driver).enterPassword(password);
            }
            ///logInfo.pass("Entering password");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click the Login button")
    public void clickTheLoginButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Clicking login button");
            new InspireLoginPage(driver).ClickLoginBtn();
            Thread.sleep(7000);
            //logInfo.pass("Clicking login");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }


    @And("Click {string} button from top blue main menu")
    public void clickButton(String menuOption) {
        try {
           logInfo = test.createNode(new GherkinKeyword("When"), "Click main menu item " +menuOption);
            new BlueMenuBar(driver).ClicktabMenuBlueBar(menuOption);
            //logInfo.pass("Clicking main menu item " + menuOption);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
            Thread.sleep(2000);
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }


    @And("Click {string} from dropdown")
    public void clickFromDropdown(String dp) {

        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Clicking sub menu item " + dp);
            new InspirePromotionPage(driver).clickLoginsDropdown();
            //logInfo.pass("Clicking main menu item " + dp);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click Add login button")
    public void clickAddLoginButton() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Clicking add user button");
            new LoginsPage(driver).ClickAdduser();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }

    }

    @And("Enter name")
    public void enterName() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering name");
            new LoginsPage(driver).enterName();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Local Login Email random generated")
    public void enterLocalLoginEmailRandomGenerated() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering email");
            new LoginsPage(driver).enterEmail();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Password random generated")
    public void enterPasswordRandomGenerated() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering password");
            new LoginsPage(driver).enterPassword();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter Password Confirm")
    public void enterPasswordConfirm() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Entering confirm password");
            new LoginsPage(driver).enterConfirmPassword();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click save user login button")
    public void clickSaveUserLoginButton() {
        ExtentTest logInfo = null;
        try {

            logInfo = test.createNode(new GherkinKeyword("And"), "Click save button");
            new LoginsPage(driver).clickSaveBtn();
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

}
