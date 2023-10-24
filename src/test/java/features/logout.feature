Feature: Logout

  Scenario: User logout from website
    Given User on Login page
    When User input username and password
    And Click login button
    Then User on Products page
    And Click menu button
    And Click logout button
    Then User on Login page