Feature: Retrieving house from database

Scenario: house Existing in database
	Given There are house in database
	When  I retrieving the house
	Then  The house retrieving successfuly
	
Scenario: house not Existing in data base
	Given The house not in database
	When  I retrieving the house
	Then  the house not retrieving