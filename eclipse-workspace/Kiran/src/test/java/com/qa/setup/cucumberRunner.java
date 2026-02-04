package com.qa.setup;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features", // Path to your .feature files
    glue = {"com.qa.stepDefinations"},               // Package for your step definitions
    plugin = {"pretty", "html:target/cucumber-report.html"} // Output formats
)

public class cucumberRunner {

}
