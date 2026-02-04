package com.qa.stepDefinations;

import io.cucumber.java.After;
import com.qa.setup.baseClass;

public class Hooks {

    @After
    public void tearDown() {
        // Use the static driver from baseClass
        if (baseClass.driver != null) {
            baseClass.driver.quit(); 
            baseClass.driver = null; // Reset to null so the next scenario starts fresh
            System.out.println("Browser closed after scenario.");
        }
    }
}