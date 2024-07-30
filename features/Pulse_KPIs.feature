@Pulse
Feature: AppV6 login validation

  @KPIs @Pulse
  Scenario Outline: Pulse sanity validations
    Given Open Chrome browser with a URL
    When Enter email address "<email>"
    And Enter password "<password>"
    And Click Login button
    Then Validate report page name "<pagename>"
    And Verify show ranges button in unchecked
    And Toggle show ranges button
    And Verify graph are displayed
      | Total revenue             |
      | Total transactions        |
      | Transaction value         |
      | HealthScore               |
      | Active customers          |
      | Transactions per customer |
      | Spend per customer        |
      | Customer lifetime value   |
      | Repeat purchase cycle     |
      | SafeSpot                  |
    And Click configure button
    And Select period as days "<days>"
    And Click configure button


    Examples:
      | email                            | password    | pagename | days    |
      | shammika.dahanayaka@kognitiv.com | Shammi4144* | KPI      | 91 days |