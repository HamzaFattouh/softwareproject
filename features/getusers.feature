Feature: Retrieving users information from database

Scenario: Retrieving a list of users from the database
    Given there are users in the database
    When I retrieve the list of users
    Then the list of users should not be empty
    
