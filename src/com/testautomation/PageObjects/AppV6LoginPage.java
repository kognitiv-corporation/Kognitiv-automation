package com.testautomation.PageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AppV6LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public AppV6LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10); // 10 seconds wait time
    }

    @FindBy(how= How.XPATH,using="//input[@id='email']")
    public WebElement emailTxtBx;

    @FindBy(how= How.XPATH,using="//input[@id='password']")
    public WebElement passwordTxtBx;

    @FindBy(how= How.XPATH,using="//button[@id='next']")
    public WebElement loginBtn;

    @FindBy(how= How.XPATH,using="//p[contains(.,'Your password is incorrect')]")
    public static WebElement errorMessage;



    public void enterEmail(String emailAddress) throws Exception
    {
        emailTxtBx.sendKeys(emailAddress);
    }

    public void enterPassword(String password)
    {
        passwordTxtBx.sendKeys(password);
    }

    public void ClickLoginBtn()
    {
        loginBtn.click();
    }

    public void verifyErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed as expected.");
    }

    public void verifyNoErrorMessage() {
        wait.until(ExpectedConditions.invisibilityOf(errorMessage));
        Assert.assertFalse(errorMessage.isDisplayed(), "Error message is displayed unexpectedly.");
    }
}
