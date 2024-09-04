package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.CHARACTERS;

public class InspireChoiceRewardPage {
    WebDriver driver;
    public static String choiceRewardname;
    private static final int USERNAME_LENGTH = 8;

    public InspireChoiceRewardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtRewardType")
    public WebElement txtName;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDescription")
    public WebElement txtDesc;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtRetail")
    public WebElement txtReatial;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtPoint")
    public WebElement txtPoint;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtCost")
    public WebElement txtCost;

    public void enterAChoiceRewardName(String name) {
        txtName.sendKeys(generateUsername(name));
    }

    public static String generateUsername(String name) {
        choiceRewardname = name+generateRandomString(USERNAME_LENGTH);
        return choiceRewardname;
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public void enterADescriptionForChoiceReward(String desc) {
        txtDesc.sendKeys(desc);
    }

    public void enterARetailValue(String value) {
        txtReatial.sendKeys(value);
    }

    public void enterAPointAmount(String value) {
        txtPoint.sendKeys(value);
    }

    public void enterAYourCost(String value) {
        txtCost.sendKeys(value);
    }
}
