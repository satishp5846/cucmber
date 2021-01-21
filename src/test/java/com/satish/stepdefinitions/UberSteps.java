package com.satish.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

    @Given("User want to select a car type {string} from uber application")
    public void userWantToSelectACarTypeFromUberApplication(String carType) {
        System.out.println("Step 1: User wants to select a car Type " +carType + " from uber application");
    }

    @When("User selects car {string} and pick up point {string} and drop location {string}")
    public void userSelectsCarAndPickUpPointAndDropLocation(String carType, String fromLocation, String toLocation) {
        System.out.println("Step 2 : User selects a car " +carType + " and pick up point " +fromLocation + " and drop location " +toLocation);
    }

    @Then("Driver starts the journey")
    public void driverStartsTheJourney() {
        System.out.println("Step 3 : Driver starts the journey");
    }

    @And("Driver ends the journey")
    public void driverEndsTheJourney() {
        System.out.println("Stpe 4 : Driver ends the journey");
    }

    @Then("User pays {int} USD")
    public void userPaysUSD(int amount) {
        System.out.println("Step 4 : User pays " +amount + " USD");
    }
}
