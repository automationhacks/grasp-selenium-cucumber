Feature: Login test

  Scenario: Successful login to app
    Given i navigate to app URL
    And i enter below login details
      | username | password   |
      | student  | MaharaDemo |
    And i click login button
    Then i should see home page

  Scenario Outline: Successful login to app using scenario outline
    Given i navigate to app URL
    And i enter <username> and <password>
    And i click login button
    Then i should see home page

    Examples:
      | username | password   |
      | learner  | MaharaDemo |
      | student  | MaharaDemo |