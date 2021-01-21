Feature: Beer cans

#  Scenario Outline: Counting beer cans
#    Given I have <opening balance> beer cans
#    And I have drunk <processed> beer cans
#    When I go to my fridge
#    Then I should have <in stock> beer cans
#    Examples:
#      | opening balance | processed | in stock |
#      | 123             | 50        | 73       |
#      | 1               | 1         | 0        |

  Scenario: Amazon Search
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Produce with name "Apple MacBook Pro" should be displayed
