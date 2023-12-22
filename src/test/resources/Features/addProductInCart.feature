

@sanitytest
Feature: Validate user is able to add the product in cart

  @addTocart
  Scenario: Validate LoginPage for saucedemo
    Given user is on landing page
    When user clicks on add to cart
    Then prodcut shohuld be added in cart
    And check whether product is added in cart

