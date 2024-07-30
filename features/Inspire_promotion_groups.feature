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
    And Select Create Product Group
    And Enter group name "<groupName>"
    And Click continue button
    And Remove existing rules applying
    And Click continue button
    And Click create product group button

    Examples:
      |email|password|tabName|groupName|
      |shammika.dahanayaka@kognitiv.com|Summer2023|Inspire|NewGroup1|
      |shammika.dahanayaka@kognitiv.com|Summer2023|Inspire|NewGroup2|