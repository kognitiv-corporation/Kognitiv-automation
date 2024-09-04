@Inspire
Feature: Inspire Member Creation and transaction validation

  @member
  Scenario: KLS-4012 Test 01: Create a new member, KLS-4076 Test 13: Verify Enrollment data, KLS-4077 Test 14: Verify member received enrollment points, KLS-4082 Test 15: Verify survey appears at enrollment, KLS-4083 Test 16: Verify survey question issue points
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Member-Services" button from top blue main menu
    And Click "Member Enrollment" from drop down menu of main items
    And Select enroll at business unit "Default"
    And Select enroll at location
    And Give Account ID "unique"
    And Enter first name "Mark"
    And Enter last name "Zuckerberg"
    And Enter birthday MM "June" DD "11" and YR "2020"
    And Select the club "createdClub"
    Then Click Save application user button
    Then Click Discard changes button
    And Click "Member-Services" button from top blue main menu
    And Click "Clienteling Services" from drop down menu of main items
    And Enter accId for search "preCreatedAccId"
    And Tick Enrollment Survey Questions
    And Click Search Now button
    Then Verify profile is displayed for the search accId
    And Verify first name and last name "Mark" "Zuckerberg"
    And Click Activity tab from left side menu
    Then Verify transaction type "auto_tr_type_4" value should be "5"


  @member
  Scenario: KLS-4084 Test 17: Verify Enrollment transaction cancellation.
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Member-Services" button from top blue main menu
    And Click "Member Enrollment" from drop down menu of main items
    And Select enroll at business unit "Default"
    And Select enroll at location
    And Give Account ID "unique"
    And Enter first name "Mark"
    And Enter last name "Zuckerberg"
    And Enter birthday MM "June" DD "11" and YR "2020"
    And Select the club "createdClub"
    Then Click Save application user button
    Then Click Discard changes button
    And Click "Member-Services" button from top blue main menu
    And Click "Clienteling Services" from drop down menu of main items
    And Enter accId for search "preCreatedAccId"
    And Tick Enrollment Survey Questions
    And Click Search Now button
    Then Verify profile is displayed for the search accId
    And Verify first name and last name "Mark" "Zuckerberg"
    And Click Activity tab from left side menu
    And Click edit button of transaction type "auto_tr_type_4"
    And click checkbox of Check To Cancel Transaction
    And Click save button
    Then Verify transaction type "auto_tr_type_4" value should be "5"

  @member @ChoiceReward
  Scenario: KLS-4089 Test 19: Verify Issue Choice Reward
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Offers" button from top blue main menu
    And Click "Choice Rewards" from drop down menu of main items
    And Click add new app user button
    And Enter a choice reward name "Auto_cr_"
    And Enter a description for choice reward "Choice reward Description"
    And Enter a Retail Value "10"
    And Enter a Point Amount "6"
    And Enter a Your Cost "11"
    And Select the club "Default Club"
    Then Click Save application user button