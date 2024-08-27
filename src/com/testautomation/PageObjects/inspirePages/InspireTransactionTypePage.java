package com.testautomation.PageObjects.inspirePages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InspireTransactionTypePage {
    WebDriver driver;
    public static String survayName;
    private static final int USERNAME_LENGTH = 8;

    public InspireTransactionTypePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID,using = "ctl00_ContentPlaceHolder1_txtTransactionType")
    public WebElement txtTransactionTypeName;

    @FindBy(how= How.ID,using = "ctl00_ContentPlaceHolder1_txtTransactionTypePublic")
    public WebElement txtTransactionTypePublicName;

    @FindBy(how= How.ID,using = "ctl00_ContentPlaceHolder1_rdoPromotionalCategory")
    public WebElement btnPromotionalTransaction;

    @FindBy(how= How.ID,using = "ctl00_ContentPlaceHolder1_chkClubEnrollment")
    public WebElement btnTransactionEntryIssuesClubEnrollment;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_cboLoyaltyClub")
    public WebElement dropDownClucb;


    public void enterTransactionTypeName(String name) {
        txtTransactionTypeName.sendKeys(name);
    }

    public void enterTransactionTypePublicName(String publicName) {
        txtTransactionTypePublicName.sendKeys(publicName);
    }

    public void entrtTransactionType(String type) {
        btnPromotionalTransaction.click();
    }

    public void tickTransactionEntryIssuesClubEnrollment() {
        btnTransactionEntryIssuesClubEnrollment.click();
    }

    public void selectTheClub(String clubName) {
        Select selectTimeZone = new Select(dropDownClucb);
        selectTimeZone.selectByVisibleText(clubName);

    }

}
