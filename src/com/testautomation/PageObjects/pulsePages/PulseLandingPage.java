package com.testautomation.PageObjects.pulsePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PulseLandingPage {

    WebDriver driver;

    public PulseLandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//table[@class='ApplicationMenuTopGroup']//tr//td[contains(text(),'%s')]")
    public WebElement emailTxtBx;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    public WebElement toggleShowRange;

    @FindBy(how = How.CSS, using = ".css-1yxmbwk > .MuiSvgIcon-root")
    public WebElement btnConfig;

    @FindBy(how = How.XPATH, using = "//div[@id='period-select']")
    public WebElement periodDropDown;

    @FindBy(how = How.CSS, using = ".MuiMenuItem-root:nth-child(3)")
    public WebElement dd91Days;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Average')]")
    public WebElement ddAvg;


    public String getTitle() throws Exception {
        Thread.sleep(2000);
        return driver.getTitle();
    }

    // Method to create dynamic XPath and find the element
    public WebElement getMenuElement(String menuItem) {
        String xpath = String.format("//li[contains(.,'%s')]", menuItem);
        return driver.findElement(By.xpath(xpath));
    }

    // Method to click the dynamic element
    public void validatePageIsLoading(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Assert.assertEquals(menuElement.getText(),"Diagnose","KPIs page not found");
        Assert.assertTrue(menuElement.isDisplayed(),menuItem+" tab button is not found");
        //menuElement.click();
    }

    public void validateToggleShowRangeBtn() {
        Assert.assertTrue(toggleShowRange.isSelected(),"Toggle already checked");
    }


    public boolean isToggleShowRangeSelected() {
        return toggleShowRange.isSelected();
    }

    public void clickBtnShowRange() {
        toggleShowRange.click();
    }

    public void clickConfigureBtn() {
        btnConfig.click();
    }

    public void selectDays(String days) {
        periodDropDown.click();
        dd91Days.click();
    }

    public void selectTypeFromConfig() {
        ddAvg.click();
    }


    // Method to create dynamic XPath and find the element
    public WebElement getGraph(String graphName) {
        //String xpath = String.format("//li[contains(.,'%s')]", graphName);
        String xpath = String.format("//div[contains(.,'%s') and @class='kpi-graph-title']", graphName);
        return driver.findElement(By.xpath(xpath));
    }


    public void verifyGraphisDisplayed(String graphName) {
        WebElement graphElement = getGraph(graphName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(graphElement.isDisplayed(), "Graph " + graphName + " is not displayed");
    }


    public void ClickMainMenu(String menuItem) {
        WebElement menuElement = getMenuElement(menuItem);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Assert.assertEquals(menuElement.getText(),"KPI","KPIs page not found");
        Assert.assertTrue(menuElement.isDisplayed(),"KPI tab button ix not found");
        menuElement.click();
    }

    // Method to create dynamic XPath and find the element
    public WebElement getDiagnoseGraph(String graphName) {
        //String xpath = String.format("//li[contains(.,'%s')]", graphName);
        String xpath = String.format("//p[contains(.,'%s')]", graphName);
        return driver.findElement(By.xpath(xpath));
    }

    public void verifyDiagnoseGraphisDisplayed(String graphName) {
        WebElement graphElement = getDiagnoseGraph(graphName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(graphElement.isDisplayed(), "Graph " + graphName + " is not displayed");
    }

    // Method to create dynamic XPath and find the element
    public WebElement getCustomerFlowGraph(String graphName) {
        //String xpath = String.format("//li[contains(.,'%s')]", graphName);
        String xpath = String.format("//div[@class='graph-filter-title' and contains(.,'%s')]", graphName);
        return driver.findElement(By.xpath(xpath));
    }

    public void verifyCustomerFlowGraphisDisplayed(String graphName) {
        WebElement graphElement = getCustomerFlowGraph(graphName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(graphElement.isDisplayed(), "Graph " + graphName + " is not displayed");
    }
}
