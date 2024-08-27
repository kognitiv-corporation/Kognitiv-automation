package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InspireRewardPage {
    WebDriver driver;

    public InspireRewardPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH,using = "//span[text()='Create Reward']")
    public WebElement btnCreateReward;

    @FindBy(how= How.XPATH,using="//div[@class='ng-star-inserted']/a/descendant::span[contains(.,'Rewards')]")
    public WebElement RewardtabMenuLeftSide;

    @FindBy(how = How.XPATH,using="//span[text()='Confirm Selection']")
    public WebElement btnConfirmSelection;

    @FindBy(how =How.XPATH,using = "//p-card[@styleclass='flex-1']/descendant::span[contains(.,'Recurring Reward')]")
    public WebElement btnSelectionType;

    // Method to create dynamic XPath and find the element
    public WebElement getMenuElement(String menuItem) {
        String xpath = String.format("//div[@class='ng-star-inserted']/a/descendant::span[contains(.,'%s')]", menuItem);
        return driver.findElement(By.xpath(xpath));
    }

    // Method to click the dynamic element
    public void ClickMenuItem(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        menuElement.click();
    }

    public void clickCreateReward(){
        btnCreateReward.click();
    }

    public void clickConfirmSelectionbutton(){
        btnConfirmSelection.click();
    }



    // Method to create dynamic XPath and find the element
    public WebElement getRewardTypeElement(String menuItem) {
        String xpath = String.format("//p-card[@styleclass='flex-1']/descendant::span[contains(.,'%s')]", menuItem);
        return driver.findElement(By.xpath(xpath));
    }

    // Method to click the dynamic element
    public void clickRewardType(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        menuElement.click();
    }
}
