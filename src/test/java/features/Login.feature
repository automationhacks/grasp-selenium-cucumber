Feature: Login test
  Scenario: Successful login to app
    Given i navigate to app URL
    And i enter below login details
      | username  | password  |
      | student   | MaharaDemo|
    And i click login button
    Then i should see home page