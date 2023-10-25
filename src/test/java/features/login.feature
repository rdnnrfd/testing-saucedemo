Feature: Login
  @Regression
  Scenario: Login using valid credentials
    Given User on Login page
    When User input username and password
    And Click login button
    Then User on Products page
  @Regression
  Scenario: Login using invalid credentials
    Given User on Login page
    When Input invalid username and password
    And Click login button
    Then Error message should be displayed