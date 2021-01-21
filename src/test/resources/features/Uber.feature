@all
Feature: Uber booking Feature

  @smoke
  Scenario: Booking Cab Sedan
    Given User want to select a car type "sedan" from uber application
    When User selects car "sedan" and pick up point "Banglore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

  @smoke @regression
  Scenario: Booking Cab SUV
    Given User want to select a car type "SUV" from uber application
    When User selects car "SUV" and pick up point "Banglore" and drop location "Hyderbad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1500 USD


  @production
  Scenario: Booking Cab Mini
    Given User want to select a car type "Mini" from uber application
    When User selects car "Mini" and pick up point "Pune" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1200 USD