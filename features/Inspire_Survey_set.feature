@Inspire
Feature: Inspire Survey set adding

  @Survey
  Scenario: KLS-4047 Test 08: Verify survey set creation
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Survey" button from top blue main menu
    And Click "Question Sets" from drop down menu of main items
    And Click "Survey Sets" from drop down menu of main items
    Then Click add new app user button
    And Enter Survey Set Name name "Survey_Set_"
    And Click save button

