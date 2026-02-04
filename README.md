#Selenium Java BDD Framework
This repository contains an automated testing framework developed for the assessment, utilizing Selenium WebDriver with Java and Cucumber BDD. The project follows the Page Object Model (POM) design pattern to ensure code reusability, maintainability, and clear separation of concerns.

🛠 Tech Stack
Language: Java 21

Automation Tool: Selenium WebDriver (v3.141.59)

Framework: Cucumber BDD (JUnit 4 Runner)

Design Pattern: Page Object Model (POM)

Build Tool: Maven

Driver Management: WebDriverManager

🏗 Project Structure
The project is organized to separate test logic from page-specific interactions:

src/main/java

com.qa.setup.baseClass: Contains driver initialization and global configuration.

com.qa.pageObjects: Contains Page Classes (e.g., loginPage.java) where locators and action methods (including assertions) are defined.

src/test/java

com.qa.stepDefinations: Contains the glue code (testAssessment.java) and Hooks.java for browser lifecycle management.

com.qa.runner: The TestRunner class to execute the feature files.

src/test/resources

Features: Contains Gherkin .feature files defining the test scenarios.

🚀 Key Features
Dynamic Grid Handling: Includes a reusable method to find and assert values of any cell on a grid using row/column coordinates.

Explicit Waits: Implementation of WebDriverWait to handle random delays in UI elements (e.g., Test 5 button).

Automatic Scroll: Integrated scrollIntoView functionality to ensure elements are visible before interaction.

Encapsulated Assertions: Following best practices, assertions are performed within the Page Object methods to keep Step Definitions clean.

📊 Reporting & Outputs
After executing the tests, the generated reports providing a detailed breakdown of passed/failed scenarios can be found in the target folder:

📂 Location: [Project_Root]/target/

Depending on your runner configuration, check for:

target/cucumber-reports/index.html (for HTML reports)

target/surefire-reports (for JUnit execution summaries)

💻 Execution
To run the tests via Maven, use the following command:

Bash
mvn clean test
