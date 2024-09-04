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
    And Enter Transaction Type Name "Auto_tr_type_2$%^&$##"
    And Enter Transaction Type Public Name "Auto_tr_type_2%$$##%^&*"
    And Entrt Transaction Type "Promotional Transaction"
    And Tick transaction Entry Issues Club Enrollment
    And Select the club
    Then Click Save application user button
    Then Make sure user list page is appeared

  @Promotion_Tr_type
  Scenario: KLS-4074 Test 11: Verify create an enrollment promotion
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Promotions" button from top blue main menu
    And Click "Enrollment Promotions" from drop down menu of main items
    And Click "Program Enrollment Point Promotion" from drop down menu of main items
    Then Click add new app user button
    And Enter Program Enrollment Point Promotion Name "Point_promotion_1"
    And select Transaction Type as "Auto_tr_type_1"
    And Enter Points to Issue value as "32"
    Then Click Save application user button
    Then Make sure user list page is appeared


