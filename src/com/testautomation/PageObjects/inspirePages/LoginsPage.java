package com.testautomation.PageObjects.inspirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class LoginsPage {
    WebDriver driver;
    public static String email;
    public static String userName;

    public LoginsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH,using="//a[@id='ctl05_ControlTitle_btnAddItem']")
    public WebElement btnAddItem;

    @FindBy(how= How.XPATH,using="//input[@id='ctl00_ContentPlaceHolder1_txtName']")
    public WebElement txtname;

    @FindBy(how= How.XPATH,using="//input[@id='ctl00_ContentPlaceHolder1_txtEmail']")
    public WebElement txtLocalLoginEmail;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtPassword")
    public WebElement txtPassword;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_txtConfirm")
    public WebElement txtConfirmPassword;

    @FindBy(how= How.ID,using="ctl00_ContentPlaceHolder1_ControlStripBottom_lnkSave")
    public WebElement btnSave;

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

    public void ClickAdduser() {
        btnAddItem.click();
    }

    public void enterName() {
        txtname.sendKeys(generateUsername());
    }

    public void enterEmail() {

        txtLocalLoginEmail.sendKeys(generateEmail());
    }

    public void enterPassword() {
        txtPassword.sendKeys("123456");
    }

    public void enterConfirmPassword() {
        txtConfirmPassword.sendKeys("123456");
    }

    public void clickSaveBtn() {
        btnSave.click();
    }


    private static final String DOMAIN = "@example.com"; // Set your domain
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int USERNAME_LENGTH = 8;
    private static final int PASSWORD_LENGTH = 10;

    // Method to generate a random email
    public static String generateEmail() {
        String username = generateUsername();
        email = username + DOMAIN;
        return username + DOMAIN;
    }

    // Method to generate a random username
    public static String generateUsername() {
        userName = generateRandomString(USERNAME_LENGTH);
        return userName;
    }

    // Method to generate a random password
    public static String generatePassword() {
        return generateRandomString(PASSWORD_LENGTH);
    }

    // Helper method to generate a random string of specified length
    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Generate email, username, and password
        String email = generateEmail();
        String username = generateUsername();
        String password = generatePassword();

        // Print generated values
        System.out.println("Generated Email: " + email);
        System.out.println("Generated Username: " + username);
        System.out.println("Generated Password: " + password);
    }
}
