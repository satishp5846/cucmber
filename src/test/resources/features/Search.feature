Feature: Amazon search

  Scenario: search a product
    Given I have a search field on amazon page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" should be displayed