package com.satish.stepdefinitions;

import com.satish.Product;
import com.satish.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    Product product;
    Search search;

    @Given("I have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Step 1: I am on search paged");
    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 2: search the product with : " +productName + " price : " +price );
        product = new Product(productName, price);

    }

    @Then("Produce with name {string} should be displayed")
    public void produce_with_name_should_be_displayed(String productName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 3: product : " +productName + " is displayed");
        search = new Search();
        String actualProductName = search.displayProduct(product);
        System.out.println("searched product is : " +actualProductName);
        Assert.assertEquals(product.getProductName(),actualProductName);


    }


}
