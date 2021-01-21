package com.satish.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Note: set the glue to stepdefination package in run configuration
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Uber.feature",
        glue = "com.satish.stepdefinitions",
        tags = "@smoke or @regression",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/json/cucumber.json", "junit:target/xml/cucumber.xml"},
        dryRun = true,
//        strict = true,
        monochrome = true
)
public class TestRunner {



}



