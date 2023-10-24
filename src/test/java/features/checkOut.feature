Feature: CheckOut Product

  Scenario: User can checkout with valid information
    Given User on Login page
    When User input username and password
    And Click login button
    Then User on Products page
    When User click add to cart button
    And User click shopping cart button
    Then User success add product to cart
    And Click checkout button
    And Input first name column
    And Input last name column
    And Input postal code
    And Click continue button
    And Click finish button
    Then User success checkout the product

  Scenario: User cannot checkout without filling in all the information
    Given User on Login page
    When User input username and password
    And Click login button
    Then User on Products page
    When User click add to cart button
    And User click shopping cart button
    Then User success add product to cart
    And Click checkout button
    And Input first name column
    And Input postal code
    And Click continue button
    Then an error message appears