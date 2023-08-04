Feature: Adding a User

  Scenario: Adding a valid user
    Given a user with the following details:
      | username     | password | user_type | address            | phone_number | gender | birth_date  | email              |
      | hamza1       | 12345    | owner     | nablus             | "0591234567" | Male   | "1990-01-15"| hamza1@gmail.com   |
    When the user is added
    Then the user added successfully
    
    Scenario: Adding a user with duplicate username
    Given a user with the following details:
      | username       | password | user_type | address | phone_number | gender | birth_date  | email            |
      | tanentusername | 12345  | Normal    | nablus  | "0595555555" | Male   | "1985-07-20"| dup@example.com  |
    And a user with username "Duplicate" already exists in the database
    When the user is added
    Then the user not added
    