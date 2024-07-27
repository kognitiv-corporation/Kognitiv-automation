@AppV6
Feature: AppV6 login validation

  @Promotion
  Scenario Outline: Appv6 login validations
    Given Open Chrome browser with a URL
    When Enter email address "<email>"
    And Enter password "<password>"
    And Click Login button
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