@all
Feature: Uber Booking feature

  @smoke
  Scenario: Booking cab sedan
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point "Banglore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then Uber get paid 1000 USD

  @regression
  Scenario: Booking cab SUV
    Given User wants to select a car type "SUV" from uber app
    When User selects car "SUV" and pick up point "Pune" and drop location "Banglore"
    Then Driver starts the journey
    And Driver ends the journey
    Then Uber get paid 1500 USD

  @prod
  Scenario: Booking cab Mini
    Given User wants to select a car type "Mini" from uber app
    When User selects car "Mini" and pick up point "Hyderabad" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then Uber get paid 1200 USD