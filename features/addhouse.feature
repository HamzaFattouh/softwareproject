Feature: Add house to database

Scenario: Adding a valid house
	Given I have house detals
	When  I add the house
	Then  The house is added successfuly

Scenario: Adding a house with duplicate title
	Given I have house detals with duplicate title
	When  I add house 
	Then  the system should display an error message about duplicate title