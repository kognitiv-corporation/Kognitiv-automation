package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.AppV6LoginPage;
import com.testautomation.PageObjects.InspirePromotionPage;
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

            logInfo=test.createNode(new GherkinKeyword("And"), "enter_password");
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
            logInfo.pass("Clicking login");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @Then("Validate application name")
    public void validateApplicationName() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("And"), "Verifying title");
            new InspirePromotionPage(driver).getTitle();
            logInfo.pass("Title : "+ new InspirePromotionPage(driver).getTitle());
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @When("I click {string} from tab menu")
    public void iClickFromTabMenu(String menuItem) {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "Click_main_menu_item");
            new InspirePromotionPage(driver).ClickMenuItem(menuItem);
            logInfo.pass("Clicking main menu item "+menuItem);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @And("Select Groups from left side menu")
    public void selectGroupsFromLeftSideMenu() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "Click_groups_tab_item");
            new InspirePromotionPage(driver).ClickGroups();
            Thread.sleep(1000);
            logInfo.pass("Clicking groups tab");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @And("Validate page name")
    public void validatePageName() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("And"), "Verifying title");
            new InspirePromotionPage(driver).getTitle();
            logInfo.pass("Title : "+ new InspirePromotionPage(driver).getTitle());
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @And("Select Create Product Group")
    public void selectCreateProductGroup() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "Click_create_products");
            new InspirePromotionPage(driver).ClickCreateProducts();
            logInfo.pass("Clicking create products link");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }


    @And("Enter group name {string}")
    public void enterGroupName(String groupName) {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "enter_group_name");
            new InspirePromotionPage(driver).enterGroupName(groupName);
            logInfo.pass("Entering group name");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @And("Click continue button")
    public void clickContinueButton() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "click_continue_button");
            new InspirePromotionPage(driver).ClickGroupcreateContinueBtn();
            logInfo.pass("click continue button");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @And("Remove existing rules applying")
    public void removeExistingRulesApplying() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "click_remove_rules");
            new InspirePromotionPage(driver).RemoveRulesSection();
            logInfo.pass("click remove rules icon");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }

    @And("Click create product group button")
    public void clickCreateProductGroupButton() {
        ExtentTest logInfo=null;
        try {

            logInfo=test.createNode(new GherkinKeyword("When"), "click_create_product_group_button");
            new InspirePromotionPage(driver).ClickFinishGroupCrerate();
            logInfo.pass("click crerate product group button");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
            driver.quit();

        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL",driver,logInfo,e);
        }
    }
}
