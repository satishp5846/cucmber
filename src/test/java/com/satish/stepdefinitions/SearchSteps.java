package com.satish.stepdefinitions;


import com.satish.Products;
import com.satish.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    Products products;
    Search search;

    @Given("I have a search field on amazon page")
    public void i_have_a_search_field_on_amazon_page() {
        // Write code here that turns the phrase above into concrete actions
        //        throw new io.cucumber.java.PendingException();
        System.out.println("Step 1 : I have search field on amazon page");

    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("Step 2 : I search for a product with name " +productName + " and price " +price);
        products = new Products(productName,price);

    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        System.out.println("Step 3 : Product with name " +productName + " should be displayed");
        search = new Search();
        String actualProductName = search.displayProduct(products);
        System.out.println("Search product is : " +actualProductName);
        Assert.assertEquals(products.getProductName(),actualProductName);
    }

}
