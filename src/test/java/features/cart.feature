Feature: Cart feature

  Scenario: Add product to cart
    Given User on Login page
    When User input username and password
    And Click login button
    Then User on Products page
    When User click add to cart button
    And User click shopping cart button
    Then User success add product to cart

  Scenario: Remove product from shopping cart
    Given User on Login page
    When User input username and password
    And Click login button
    Then User on Products page
    When User click add to cart button
    And User click shopping cart button
    And User click remove button
    Then User success remove product from cart
