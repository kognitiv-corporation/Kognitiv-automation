@AppV6
Feature: AppV6 login validation

@Login
Scenario Outline: Appv6 login validations
	Given Open Chrome browser with a URL
	When Enter email address "<email>"
	And Enter password "<password>"
	And Click Login button
	Then Validate application name

	Examples:
		|email|password|
		|shammika.dahanayaka@kognitiv.com|Summer2023|

