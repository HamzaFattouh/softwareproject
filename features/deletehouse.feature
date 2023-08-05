Feature: Delete house from database

Scenario: delete house successfuly
	Given the house Existing in database
	When  I delete the house
	Then  the house deleted successfuly
	
Scenario: the house not Existing in database
	Given the house is not Existing in database
	When  Idelete the house
	Then  Show error message