package com.qa.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
    public static WebDriver driver;

    // This method is called manually by your Step Definition
    public static WebDriver browserInitialization(String browser) {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

}