package com.satish.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

    @Given("User wants to select a car type {string} from uber app")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Step 1 : User wants to select a car type " +carType + " from uber app");
    }

    @When("User selects car {string} and pick up point {string} and drop location {string}")
    public void user_selects_car_and_pick_up_point_and_drop_location(String carType, String fromLocation, String toLocation) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Step 2 : User selects car " +carType + " and pick up point " +fromLocation + " and drop location " +toLocation);
    }

    @Then("Driver starts the journey")
    public void driver_starts_the_journey() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Step 3 : Driver starts the journey");
    }

    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Step 4 : Driver ends the journey");
    }

    @Then("Uber get paid {int} USD")
    public void uber_get_paid_usd(Integer amount) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Step 5 : Uber get paid " +amount + " USD");
    }
}
