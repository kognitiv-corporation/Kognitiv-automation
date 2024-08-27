package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.CHARACTERS;

public class InspireClubCreatePage {
    WebDriver driver;
    public static String clubName;
    private static final int USERNAME_LENGTH = 8;

    public InspireClubCreatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtLoyaltyClub")
    public WebElement txtClubName;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtClubExternalRef")
    public WebElement txtClubRef;

    @FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ControlStripBottom_lnkSave")
    public WebElement btnSave;


    public void enterName(String name) {
        txtClubName.sendKeys(generateUsername(name));
    }

    public static String generateUsername(String name) {
        clubName = name+generateRandomString(USERNAME_LENGTH);
        return clubName;
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public void enterRef(String name) {
        txtClubRef.sendKeys(clubName);
    }

    public void clickSaveBtn() {
        btnSave.click();
    }
}
