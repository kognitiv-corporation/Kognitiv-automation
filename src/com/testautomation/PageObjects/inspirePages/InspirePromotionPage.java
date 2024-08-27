package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InspirePromotionPage {

    WebDriver driver;

    public InspirePromotionPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH,using="//table[@class='ApplicationMenuTopGroup']//tr//td[contains(text(),'%s')]")
    public WebElement emailTxtBx;

    @FindBy(how= How.XPATH,using="//a[@class='ng-star-inserted']/child::span[contains(.,'Groups')]")
    public WebElement groupsTab;

    @FindBy(how= How.XPATH,using="//button[contains(.,'Create Product Group')]")
    public WebElement createProductBtn;

    @FindBy(how= How.XPATH,using="//input[@id='productGroupName']")
    public WebElement groupnameTxt;

    @FindBy(how= How.XPATH,using="//button[contains(.,'Continue')]")
    public WebElement groupContinueBtn;

    @FindBy(how= How.XPATH,using="//span[contains(.,'Discard')]")
    public WebElement removeRuleSection;

    @FindBy(how= How.XPATH,using="//button[contains(.,'Create Product Group')]")
    public WebElement createProductGroupBtn;

    @FindBy(how = How.XPATH,using = "//td[contains(.,'Logins')]")
    public WebElement ddLogins;

    public String getTitle() throws Exception
    {
        Thread.sleep(2000);
        return driver.getTitle();
    }

    // Method to create dynamic XPath and find the element
    public WebElement getMenuElement(String menuItem) {
        String xpath = String.format("//table[@class='UserMenuParentItem']//tr//td[contains(.,'%s')]", menuItem);
        return driver.findElement(By.xpath(xpath));
    }

    // Method to click the dynamic element
    public void ClickMenuItem(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        menuElement.click();
    }

    public void ClickGroups() {
        groupsTab.click();
    }

    public void ClickCreateProducts() {
        createProductBtn.click();
    }

    public void enterGroupName(String groupName) {
        groupnameTxt.sendKeys(groupName);
    }

    public void ClickGroupcreateContinueBtn() {
        groupContinueBtn.click();
    }


    public void RemoveRulesSection() {

        // Use JavaScript to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", removeRuleSection);
        js.executeScript("arguments[0].click();", removeRuleSection);
        //removeRuleSection.click();
    }

    public void ClickFinishGroupCrerate() {
        createProductGroupBtn.click();
    }

    public void clickLoginsDropdown() {
        ddLogins.click();
    }
}
