package com.testautomation.StepDef;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.AppV6LoginPage;
import com.testautomation.PageObjects.InspirePromotionPage;
import com.testautomation.Utility.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Inspire_promo_Stepdefs extends ExtentReportListener {

    PropertiesFileReader obj= new PropertiesFileReader();
    private WebDriver driver;

    public Inspire_promo_Stepdefs(WebDriver driver) {
        super();
    }


}
