package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.CHARACTERS;

public class InspireSurveySetPage {
    WebDriver driver;
    public static String survayName;
    private static final int USERNAME_LENGTH = 8;

    public InspireSurveySetPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID,using = "ctl00_ContentPlaceHolder1_txtSurveySetName")
    public WebElement txtSurvayName;

    public void enterName(String name) {
        txtSurvayName.sendKeys(generateUsername(name));
    }

    public static String generateUsername(String name) {
        survayName = name+generateRandomString(USERNAME_LENGTH);
        return survayName;
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}
