package com.testautomation.PageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AppV6LoginPage {

    WebDriver driver;

    public AppV6LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH,using="//input[@id='email']")
    public WebElement emailTxtBx;

    @FindBy(how= How.XPATH,using="//input[@id='password']")
    public WebElement passwordTxtBx;

    @FindBy(how= How.XPATH,using="//button[@id='next']")
    public WebElement loginBtn;

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


}
