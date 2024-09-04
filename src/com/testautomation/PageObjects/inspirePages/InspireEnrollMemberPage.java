package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.CHARACTERS;

public class InspireEnrollMemberPage {
    WebDriver driver;
    public static String accId;
    private static final int USERNAME_LENGTH = 8;

    public InspireEnrollMemberPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtIssuedId")
    public WebElement txtAccId;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtFirstName")
    public WebElement txtFname;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtLastName")
    public WebElement txtLname;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ctrlBirthday_ddlBirthdayMonth")
    public WebElement ddMonth;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ctrlBirthday_ddlBirthdayDay")
    public WebElement ddDate;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ctrlBirthday_ddlBirthdayYear")
    public WebElement ddYear;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ControlStrip_lnkClose")
    public WebElement btnDiscardChanges;

    @FindBy(how= How.ID,using="ctl05_txtSearchFor")
    public WebElement txtSearchAccId;

    @FindBy(how= How.ID,using="ctl05_lnkSearch")
    public WebElement btnSearch;

    @FindBy(how= How.ID,using="ctl05_txtQuickInfoTitle")
    public WebElement panelSearchAccId;

    @FindBy(how= How.ID,using="ctl05_txtName")
    public WebElement eleName;

    @FindBy(how= How.ID,using="ctl05_NavMenu_20")
    public WebElement tabActivity;

    @FindBy(how= How.XPATH,using="//input[@id='ctl00_ContentPlaceHolder1_dlQuestions_ctl00_nodeQuestion_dlMutipleAnswers_ctl03_chkAnswer']")
    public WebElement checkBoxSurveyQues;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_chkCancel")
    public WebElement btnCancelTransaction;

    public void giveAccountID(String featureAccId) {
        accId = generateRandomString(USERNAME_LENGTH);
        txtAccId.sendKeys(accId);
    }

    private String generateRandomString(int length) {
        Random random = new Random();
        // Generate a random integer between 1000 and 9999
        int randomID = random.nextInt(90000000) + 10000000;
        // Convert the integer to a string
        String randomIDString = Integer.toString(randomID);
        System.out.println("Random ID as String: " + randomIDString);
        return randomIDString;
    }

    public void enterFirstName(String firstName) {
        txtFname.sendKeys("Auto_"+firstName);
    }

    public void enterLastName(String lastname) {
        txtLname.sendKeys("Auto_"+lastname);
    }

    public void enterBirthdayMMDDAndYR(String mm, String dd, String yr) {
        Select selectMonth = new Select(ddMonth);
        Select selectDate = new Select(ddDate);
        Select selectYear = new Select(ddYear);

        selectMonth.selectByVisibleText(mm);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        selectDate.selectByVisibleText(dd);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        selectYear.selectByVisibleText(yr);
    }

    public void clickDiscardChangesButton() {
        btnDiscardChanges.click();
    }

    public void enterAccIdForSearch(String featureAccId) {
        txtSearchAccId.sendKeys(accId);
    }

    public void clickSearchNowButton() {
        btnSearch.click();
    }

    public void verifyProfileIsDisplayedForTheSearchAccId() {
        Assert.assertTrue(panelSearchAccId.isDisplayed());
    }

    public void vwerifyFirstNameAndLastName(String fname, String lname) {
        Assert.assertTrue(eleName.getText().contains("Auto_"+fname +" Auto_"+lname ));
    }


    public WebElement getMenuElement(String menuItem) {
        String xpath = String.format("//*[text()='%s']/preceding-sibling::input[@type='checkbox']", menuItem);
        //System.out.println("xpath :" +xpath);
        return driver.findElement(By.xpath(xpath));
    }

    // Method to click the dynamic element
    public void tickClub(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        menuElement.click();
    }

    public void clickActivityTabFromLeftSideMenu() {
        tabActivity.click();
    }

    public void tickEnrollmentSurveyQuestions() {
        scrollToBottom();
        checkBoxSurveyQues.click();
        checkBoxSurveyQues.sendKeys();
    }

    public WebElement getTrTypeValue(String trType) {
        String xpath = String.format("//*[text()='%s']/parent::td/following-sibling::td[6]", trType);
        return driver.findElement(By.xpath(xpath));
    }


    public void verifyTransactionTypeValueShouldBe(String trType, String valueOfTrType) {
        WebElement ValueOfTransactionType = getTrTypeValue(trType);
        Assert.assertTrue(ValueOfTransactionType.getText().contains(valueOfTrType));
    }

    public void scrollToBottom(){
        // Scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Optionally, wait for a few seconds to see the scroll effect
/*        try {
            Thread.sleep(2000);  // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }


    public WebElement getEditBtnOfTrType(String trType) {
        String xpath = String.format("//*[text()='%s']/parent::td/preceding-sibling::*[@id='ctl00_ContentPlaceHolder1_gridActivity_cell_2_0']", trType);
        return driver.findElement(By.xpath(xpath));
    }


    public void clickEditButtopnOfTransactionType(String trType) {
        WebElement BtnEditOfTransactionType = getEditBtnOfTrType(trType);
        BtnEditOfTransactionType.click();
    }

    public void clickCheckboxOfCheckToCancelTransaction() {
        btnCancelTransaction.click();
    }
}
