@Pulse
Feature: Pulse login validation

@Login @Pulse
Scenario Outline: Pulse login validations
	Given Open Chrome browser with a URL
	When Enter email address "<email>"
	And Enter password "<password>"
	And Click Login button
	And Validate login message "<status>"

	Examples:
		|email|password|status|
		|shammika.dahanayaka@kognitiv.com|Summer2023|false|
		|shammika.dahanayaka@kognitiv.com|Shammi4144*|true|

