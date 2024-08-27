package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.inspirePages.InspirePromotionPage;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Inspire_promo_Stepdefs extends ExtentReportListener {

    PropertiesFileReader obj = new PropertiesFileReader();
    private WebDriver driver;
    ExtentTest logInfo = null;

    public Inspire_promo_Stepdefs(BaseTest baseTest) throws Throwable {
        this.driver = baseTest.getDriver();
    }

    @Then("Validate application name")
    public void validateApplicationName() {
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Verifying title");
            String title = new InspirePromotionPage(driver).getTitle();
            logInfo.pass("Title : " + title);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @When("I click {string} from tab menu")
    public void iClickFromTabMenu(String menuItem) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click main menuitem");
            new InspirePromotionPage(driver).ClickMenuItem(menuItem);
            logInfo.pass("Clicking main menu item " + menuItem);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select Groups from left side menu")
    public void selectGroupsFromLeftSideMenu() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click_groups_tab_item");
            new InspirePromotionPage(driver).ClickGroups();
            Thread.sleep(1000);
            logInfo.pass("Clicking groups tab");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Validate page name")
    public void validatePageName() {
        try {
            logInfo = test.createNode(new GherkinKeyword("And"), "Verifying title");
            String title = new InspirePromotionPage(driver).getTitle();
            logInfo.pass("Title : " + title);
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Select Create Product Group")
    public void selectCreateProductGroup() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "Click_create_products");
            new InspirePromotionPage(driver).ClickCreateProducts();
            logInfo.pass("Clicking create products link");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Enter group name {string}")
    public void enterGroupName(String groupName) {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "enter_group_name");
            new InspirePromotionPage(driver).enterGroupName(groupName);
            logInfo.pass("Entering group name");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click continue button")
    public void clickContinueButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "click_continue_button");
            new InspirePromotionPage(driver).ClickGroupcreateContinueBtn();
            logInfo.pass("click continue button");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Remove existing rules applying")
    public void removeExistingRulesApplying() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "click_remove_rules");
            new InspirePromotionPage(driver).RemoveRulesSection();
            logInfo.pass("click remove rules icon");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

    @And("Click create product group button")
    public void clickCreateProductGroupButton() {
        try {
            logInfo = test.createNode(new GherkinKeyword("When"), "click_create_product_group_button");
            new InspirePromotionPage(driver).ClickFinishGroupCrerate();
            logInfo.pass("click create product group button");
            logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
        } catch (AssertionError | Exception e) {
            testStepHandle("FAIL", driver, logInfo, e);
        }
    }

}
