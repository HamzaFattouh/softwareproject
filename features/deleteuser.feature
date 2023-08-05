Feature: Deleting a User

  Scenario: Deleting an existing user
    Given a user with username "hamza1" exists in the database
    When the user "hamza1" is deleted
    Then the user "hamza1" should be successfully deleted from the database

  Scenario: Deleting a non-existent user
    Given a user with username "unvalid" does not exist in the database
    When the user "unvalid" is deleted
    Then the system should display a message that the user "unvalid" does not exist