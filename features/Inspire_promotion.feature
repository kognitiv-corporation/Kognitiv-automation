@Inspire
Feature: Inspire promotion transaction type adding

  @Promotion_Tr_type
  Scenario: KLS-4049 Test 10: Verify Transaction bonus promotion creation for point adjustment
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Admin" button from top blue main menu
    And Click "Transaction Types" from drop down menu of main items
    Then Click add new app user button
    And Enter Transaction Type Name "Auto_tr_type_1"
    And Enter Transaction Type Public Name "Auto_tr_type_1"
    And Entrt Transaction Type "Promotional Transaction"
    And Tick transaction Entry Issues Club Enrollment
    And Select the club
    Then Click Save application user button
    Then Make sure user list page is appeared


