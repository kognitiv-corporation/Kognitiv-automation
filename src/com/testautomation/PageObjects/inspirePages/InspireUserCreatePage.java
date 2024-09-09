package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.testng.AssertJUnit.assertTrue;

public class InspireUserCreatePage {
    WebDriver driver;

    public InspireUserCreatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[text()='User']")
    public WebElement userDropDown;

    @FindBy(how = How.ID, using = "ctl05_ControlTitle_btnAddItem")
    public WebElement addAppUserBtn;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtName")
    public WebElement txtname;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtEmail")
    public WebElement txtEmail;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_cboRoles")
    public WebElement txtRole;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_cboDepartment")
    public WebElement txtDept;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_cboTimezone")
    public WebElement txtTimeZone;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ControlStripBottom_lnkSave")
    public WebElement btnSave;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkLockout")
    public WebElement ClearLockOut;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkHost")
    public WebElement HostSetting;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkIssueLookupInteraction")
    public WebElement UsageSettings;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkExecuteExports")
    public WebElement GeneralApplicationSecuritySettings;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkPerformPtAdjustments")
    public WebElement SpecificSecuritySettings;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtMinPoints")
    public WebElement minPoint;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtMaxPoints")
    public WebElement maxPoint;

    @FindBy(how = How.ID, using = "NavMenu_35")
    public WebElement subMenuSurveySets;





/*    public void clickDropdown(String dp) {
        userDropDown.click();
    }*/

    // Method to create dynamic XPath and find the element
    public WebElement getMenuElement(String menuItem) {
        String xpath = String.format("//*[text()='%s']", menuItem);
        return driver.findElement(By.xpath(xpath));
    }

    public void clickDropdown(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        menuElement.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //menuElement.submit();
    }

    public void enterName(String name) {
        txtname.sendKeys(name);
    }

    public void enterEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void clickAddAppUserBtn() {
        addAppUserBtn.click();
    }

    public void clickSaveBtn() {
        btnSave.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectADept(String dept){
        Select selectTimeZone = new Select(txtDept);
        //selectTimeZone.selectByVisibleText(dept);
    }

    public void selectARole(String role){
        Select selectTimeZone = new Select(txtRole);
        selectTimeZone.selectByVisibleText(role);
    }

    public void selectATimeZone(String timeZone){
        Select selectTimeZone = new Select(txtTimeZone);
        selectTimeZone.selectByVisibleText(timeZone);
    }

    public void IsUserListPage() {
        //addAppUserBtn.isDisplayed();
        assertTrue("The Add App User button should be displayed", addAppUserBtn.isDisplayed());
    }

    public void tickClearLockOut() {
        ClearLockOut.click();
    }


    public void clickTickHostSetting() {
        HostSetting.click();
    }


    public void tickUsageSettings() {
        UsageSettings.click();
    }

    public void tickGeneralApplicationSecuritySettings() {
        GeneralApplicationSecuritySettings.click();
    }

    public void tickSpecificSecuritySettings() {
        SpecificSecuritySettings.click();
    }

    public void enterMinimumAdjustmentOfAndPointsToMaximumPoints(String min, String max) {
        minPoint.sendKeys(min);
        maxPoint.sendKeys(max);
    }
}
