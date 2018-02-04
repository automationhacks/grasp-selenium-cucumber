Feature: Login test
  Scenario: Successful login to app
    Given i navigate to app URL
    And i enter username as "student"
    And i enter password as "MaharaDemo"
    Then i should see home page