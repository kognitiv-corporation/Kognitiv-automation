package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BlueMenuBar {

    WebDriver driver;

    public BlueMenuBar(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH,using="//table[@class='ApplicationMenuTopGroup']//nobr[contains(.,'Web')]")
    public WebElement emailTxtBx;

    // Method to create dynamic XPath and find the element
    public WebElement getMenuElement(String menuItem) {
        String xpath = String.format("//table[@class='ApplicationMenuTopGroup']//nobr[contains(.,'%s')]", menuItem);
        return driver.findElement(By.xpath(xpath));
    }

    // Method to click the dynamic element
    public void ClicktabMenuBlueBar(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        menuElement.click();
    }
}




