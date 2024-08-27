@Inspire
Feature: Inspire Force Reward adding

  @Force_reward
  Scenario: KLS-4010 Test 06: Verify Force reward creation with 10 points
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Admin" button from top blue main menu
    And Click "Clubs" from drop down menu of main items
    Then Click add new app user button
    When Enter club name "AutoClub"
    And Enter external refernce "AutoClubRef"
    And Click save button
    And Click "Offers" button from top blue main menu
    And Click "Forced Rewards" from drop down menu of main items
    Then Click add new app user button
    And Enter reward name "RewardName_"
    And Enter description
    And Enter retail value "20"
    And Enter point level value "10"
    And Enter your cost value "25"
    And Select eligibility member club
    And Click reward save button
    Then Make sure user list page is appeared

  @Force_reward
  Scenario: KLS-4010 Test 06: Verify Force reward creation with 10 points
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Admin" button from top blue main menu
    And Click "Clubs" from drop down menu of main items
    Then Click add new app user button
    When Enter club name "AutoClub"
    And Enter external refernce "AutoClubRef"
    And Click save button
    And Click "Offers" button from top blue main menu
    And Click "Forced Rewards" from drop down menu of main items
    Then Click add new app user button
    And Enter reward name "RewardName_"
    And Enter description
    And Enter retail value "2"
    And Enter point level value "1"
    And Enter your cost value "5"
    And Select eligibility member club
    And Click reward save button

  @Force_reward1
  Scenario: KLS-4011 Test 07: Verify Recurring Reward creation
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "automationQaint@mailinator.com"
    And Enter user password "!!!@Pass@!!!"
    And Click the Login button
    Then Validate application name
    And Click "Admin" button from top blue main menu
    And Click "Clubs" from drop down menu of main items
    Then Click add new app user button
    When Enter club name "AutoClub"
    And Enter external refernce "AutoClubRef"
    And Click save button
    And Click "Offers" button from top blue main menu
    And Click "Recurring Rewards" from drop down menu of main items
    Then Click add new app user button
    And Enter reward name "RewardName_"
    And Enter description
    And Enter retail value "20"
    #And Enter point level value "10"
    And Enter your cost value "12"
    And Enter Starts At value "5"
    And Enter Interval - Recur every value "5"
    And Enter Member Issue Limits "5"
    And Select eligibility member club
    And Click reward save button
    Then Make sure user list page is appeared


