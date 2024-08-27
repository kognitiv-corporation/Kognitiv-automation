package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.CHARACTERS;

public class InspireForceRewardPage {
    WebDriver driver;
    public static String rewardname;
    private static final int USERNAME_LENGTH = 8;

    public InspireForceRewardPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtRewardType")
    public WebElement txtRewardName;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtDescription")
    public WebElement txtDescription;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtRetail")
    public WebElement txtRetailValue;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtPoint")
    public WebElement txtPiointLevel;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtCost")
    public WebElement txtCost;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ControlStripBottom_lnkSave")
    public WebElement btnSave;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtStartsAt")
    public WebElement txtStartAt;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtRecur")
    public WebElement txtInterval;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtMemberLimit")
    public WebElement txtMemberIssueLimit;

    // Method to create dynamic XPath and find the element
    public WebElement getMenuElement(String menuItem) {
        String xpath = String.format("//*[text()='%s']/ancestor::td[1]/preceding-sibling::td[1]/input[@type='checkbox']", menuItem);
        //System.out.println("xpath :" +xpath);
        return driver.findElement(By.xpath(xpath));
    }

    // Method to click the dynamic element
    public void tickClub(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        menuElement.click();
    }

    public void enterName(String name) {
        txtRewardName.sendKeys(generateUsername(name));
    }

    public static String generateUsername(String name) {
        rewardname = name+generateRandomString(USERNAME_LENGTH);
        return rewardname;
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public void enterDescription() {
        txtDescription.sendKeys(txtRewardName +"Description");
    }

    public void enterReatilValue(String value) {
        txtRetailValue.sendKeys(value);
    }

    public void enterPointValue(String value) {
        txtPiointLevel.sendKeys(value);
    }

    public void enterCostValue(String value) {
        txtCost.sendKeys(value);
    }

    public void clickRewardSaveButton() {
        btnSave.click();
    }

    public void enterStartAt(String value) {
        txtStartAt.sendKeys(value);
    }

    public void enterIntervalRecurEveryValue(String value) {
        txtInterval.sendKeys(value);
    }

    public void enterMemberIssueLimits(String value) {
        txtMemberIssueLimit.sendKeys(value);
    }
}
