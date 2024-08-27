package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class InspireRewardStepDefs {

    PropertiesFileReader obj = new PropertiesFileReader();
    private WebDriver driver;
    ExtentTest logInfo = null;

    public InspireRewardStepDefs(BaseTest baseTest) throws Throwable {
        this.driver = baseTest.getDriver();
    }

    @When("Select {string} from left side menu")
    public void selectFromLeftSideMenu(String arg0) {
    }

    @And("Click create reward button")
    public void clickCreateRewardButton() {

    }

    @And("Select a reward type {string}")
    public void selectARewardType(String arg0) {
    }

    @And("Click Confirm Selection button")
    public void clickConfirmSelectionButton() {
    }
}
