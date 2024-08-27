@Inspire
Feature: Inspire user application adding

  @user
  Scenario: KLS-4012 Test 01: Create a new user with all flags off
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    When I click "Enterprise" from tab menu
    And Click "Logins" from dropdown
    And Click Add login button
    And Enter name
    And Enter Local Login Email random generated
    And Enter Password random generated
    And Enter Password Confirm
    And Click save user login button
    And Click "System" button from top blue main menu
    And Click "User" from drop down menu of main items
    Then Click add new app user button
    And add app name "LoginsUserName"
    And add email "LoginsEmail"
    And add department "Default Department"
    And add security role "View Only"
    And add time zone "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi"
    Then Click Save application user button
    Then Make sure user list page is appeared

  @user
  Scenario: KLS-4013 Test 02: Create a new user with all flags on
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    When I click "Enterprise" from tab menu
    And Click "Logins" from dropdown
    And Click Add login button
    And Enter name
    And Enter Local Login Email random generated
    And Enter Password random generated
    And Enter Password Confirm
    And Click save user login button
    And Click "System" button from top blue main menu
    And Click "User" from drop down menu of main items
    Then Click add new app user button
    And add app name "LoginsUserName"
    And add email "LoginsEmail"
    And add department "Default Department"
    And add security role "View Only"
    And add time zone "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi"
    And Tick Clear Lock Out
    And Tick Host Setting
    And Tick Usage Settings
    And Tick General Application Security Settings
    And Tick Specific Security Settings
    And enter Minimum Adjustment of "0" and Points to Maximum "2" Points
    Then Click Save application user button
    Then Make sure user list page is appeared


  @user
  Scenario: KLS-4014 Test 03: Create a new user with flags interspersed
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    When I click "Enterprise" from tab menu
    And Click "Logins" from dropdown
    And Click Add login button
    And Enter name
    And Enter Local Login Email random generated
    And Enter Password random generated
    And Enter Password Confirm
    And Click save user login button
    And Click "System" button from top blue main menu
    And Click "User" from drop down menu of main items
    Then Click add new app user button
    And add app name "LoginsUserName"
    And add email "LoginsEmail"
    And add department "Default Department"
    And add security role "View Only"
    And add time zone "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi"
    Then Click Save application user button
    Then Make sure user list page is appeared

  @user
  Scenario: KLS-4014 Test 03: Create a new user with flags interspersed
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    When I click "Enterprise" from tab menu
    And Click "Logins" from dropdown
    And Click Add login button
    And Enter name
    And Enter Local Login Email random generated
    And Enter Password random generated
    And Enter Password Confirm
    And Click save user login button
    And Click "System" button from top blue main menu
    And Click "User" from drop down menu of main items
    Then Click add new app user button
    And add app name "LoginsUserName"
    And add email "LoginsEmail"
    And add department "Default Department"
    And add security role "Administrator"
    And add time zone "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi"
    Then Click Save application user button
    Then Make sure user list page is appeared

  @user
  Scenario: KLS-4009 Test 05: Verify Login with created user
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "CreatedUser"
    And Enter user password "123456"
    And Click the Login button
    Then Validate application name

