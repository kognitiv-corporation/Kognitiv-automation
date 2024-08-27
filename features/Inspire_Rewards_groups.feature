@Inspire
Feature: AppV6 promotion group validation

  @Promotion
  Scenario Outline: Appv6 promotion group validations
    Given Open Chrome browser with a Inspire URL
    When Enter user name as email address "<email>"
    And Enter user password "<password>"
    And Click the Login button
    Then Validate application name
    When I click "<tabName>" from tab menu
    And Validate page name
    And Select Groups from left side menu
    When Select "Rewards" from left side menu
    And Click create reward button
    And Select a reward type "<rewardType>"
    And Click Confirm Selection button
    Then Make sure user list page is appeared

    Examples:
      |email|password|tabName|groupName|
      |shammika.dahanayaka@kognitiv.com|Summer2023|Inspire|NewGroup1|
      |shammika.dahanayaka@kognitiv.com|Summer2023|Inspire|NewGroup2|