package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.CHARACTERS;

public class InspireEnrollmentPointPromotionPage {
    WebDriver driver;
    public static String pointPromotionName;
    private static final int USERNAME_LENGTH = 8;

    public InspireEnrollmentPointPromotionPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtEnrollmentPromoName")
    public WebElement txtPointPromotiondName;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_cboTransactionType")
    public WebElement dropDownTrType;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtPointsToIssue")
    public WebElement txtPoints;


    public void enterName(String name) {
        txtPointPromotiondName.sendKeys(generateUsername(name));
    }

    public static String generateUsername(String name) {
        pointPromotionName = name+generateRandomString(USERNAME_LENGTH);
        return pointPromotionName;
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public void selectTheClub(String clubName) {
        Select selectTimeZone = new Select(dropDownTrType);
        selectTimeZone.selectByVisibleText(clubName);

    }

    public void enterPointvalue(String points) {
        txtPoints.sendKeys(points);
    }

}
