package com.satish.testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/Uber.feature",
        glue = "com.satish.stepdefinitions",
        plugin = {"pretty", "html:target/html_report", "json:target/json/cucumber.json","junit:target/xml/cucumber.xml" },
        tags = "@smoke or @regression"



)
public class TestRunner {

}

/**
 * tags:
 * or condition : "@a or @b", "@A,@B" : executes both the conditions
 * and condition : "@a and @b", "@a","@b"  : executes if both the condition matches
 * not condition : "~@a", "not @a"  : skips the condition
 **/