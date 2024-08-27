@Pulse
Feature: Pulse report validation

  @KPIs @Pulse @Regression
  Scenario Outline: Pulse KPI-Report validations
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



  @Diagnose @Pulse
  Scenario Outline: Pulse Diagnose-Report validations
    Given Open Chrome browser with a URL
    When Enter email address "<email>"
    And Enter password "<password>"
    And Click Login button
    Then Click report tab name "<reportMenu>"
    Then Validate report page name "<pagename>"
    Then Verify Diagnose graph are displayed
      | Is the spend per customer growing?                                             |
      | Are we reactivating a higher proportion of customers from the At-Risk segment? |
      | Is the average order value (AOV) higher?                                       |



    Examples:
      | email                            | password    | reportMenu | pagename |
      | shammika.dahanayaka@kognitiv.com | Shammi4144* | Diagnose   | Diagnose |

  @CustomerFlows @Pulse @Regression
  Scenario Outline: Pulse KPI-Report validations
    Given Open Chrome browser with a URL
    When Enter email address "<email>"
    And Enter password "<password>"
    And Click Login button
    Then Click report tab name "<reportMenu>"
    Then Validate report page name "<pagename>"
    Then Verify Customer Flows graph are displayed
      | THEN |
      | NOW  |
      | NEXT |



    Examples:
      | email                            | password    | reportMenu     | pagename       |
      | shammika.dahanayaka@kognitiv.com | Shammi4144* | Customer Flows | Customer Flows |