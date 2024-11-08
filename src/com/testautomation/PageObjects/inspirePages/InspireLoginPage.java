package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InspireLoginPage {

    WebDriver driver;

    public InspireLoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID,using="Email")
    public WebElement emailTxtBx;

    @FindBy(how= How.ID,using="Password")
    public WebElement passwordTxtBx;

    @FindBy(how= How.NAME,using="button")
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
