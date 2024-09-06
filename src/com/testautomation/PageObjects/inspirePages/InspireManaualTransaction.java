package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InspireManaualTransaction {
    WebDriver driver;
    public static String accId;
    private static final int USERNAME_LENGTH = 8;

    public InspireManaualTransaction(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID,using="ctl05_NavMenu_68")
    public WebElement tabManualTransaction;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_cboTransactionType")
    public WebElement dropDownTrType;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ctrlProductBasket_txtBasketItemAmount")
    public WebElement txtProductValue;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ctrlProductBasket_txtProductQty")
    public WebElement txtQty;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtAmount")
    public WebElement txtTrValue;

    @FindBy(how= How.ID,using="ctl05_NavMenu_57")
    public WebElement tabTools;

    @FindBy(how= How.ID,using="ctl05_NavMenu_60")
    public WebElement btnProscessForceReward;

    @FindBy(how= How.ID,using="ctl05_lnkPickup")
    public WebElement btnPendingDelivery;

    @FindBy(how= How.ID,using="ctl05_NavMenu_61")
    public WebElement btnProcessRecurringRewards;


    public void clickManualTransactionTabFromLeftSideMenu() {
        tabManualTransaction.click();
    }

    public void selectTransactionType(String trType) {
        Select ddtrType = new Select(dropDownTrType);
        ddtrType.selectByVisibleText(trType);
    }

    public void enterTheProductValue(String value) {
        txtProductValue.sendKeys(value);
    }

    public void enterTheQuantity(String qnt) {
        txtQty.sendKeys(qnt);
    }

    public void enterTheTransactionValue(String trValue) {
        txtTrValue.sendKeys(trValue);
    }

    public void clickToolsFromLeftSideMenu() {
        tabTools.click();
    }

    public void clickProcessForcedRewards() {
        btnProscessForceReward.click();
    }

    public void clickPendingDelivery() {
        btnPendingDelivery.click();
    }

    public void clickProcessRecurringRewards() {
        btnProcessRecurringRewards.click();
    }
}
