# 🚀 Selenium Java BDD Framework

A robust, scalable automated testing framework designed for technical assessments and real-world web application testing.  
This project follows **industry best practices** using **Cucumber BDD** and the **Page Object Model (POM)** to ensure clean separation of concerns, maintainability, and readability.

---

## 🛠 Tech Stack

| Component          | Technology |
|--------------------|------------|
| Language           | Java 21 |
| Automation Tool    | Selenium WebDriver (v3.141.59) |
| BDD Framework      | Cucumber |
| Test Runner        | JUnit 4 |
| Design Pattern     | Page Object Model (POM) |
| Build Tool         | Maven |

---

## 📂 Project Architecture

```plaintext
src/
├── main/java/
│   ├── com.qa.setup/
│   │   └── baseClass.java          # Global WebDriver initialization & configuration
│   └── com.qa.pageObjects/
│       └── loginPage.java          # Locators, actions, and page-level assertions
├── test/java/
│   ├── com.qa.stepDefinations/
│   │   ├── testAssessment.java     # Step definitions mapping Gherkin to Java
│   │   └── Hooks.java              # Test hooks and browser lifecycle management
│   └── com.qa.runner/
│       └── TestRunner.java         # JUnit runner configuration
└── test/resources/
    └── Features/
        └── testAssessment.feature  # Gherkin feature file
```

---

## ✨ Key Technical Features

### 1️⃣ Advanced Grid Handling
- Custom reusable methods to interact with dynamic web tables
- **Coordinate-based access** using 0-based `(row, column)` indexing
- **Dynamic XPath generation** for validating specific cell data

---

### 2️⃣ Intelligent Synchronization
- **Explicit waits** using `WebDriverWait` to handle dynamic loading elements
- JavaScript-based `scrollIntoView()` to ensure elements are visible before interaction
- Improves test stability across browsers and environments

---

### 3️⃣ POM-Driven Assertions
- All validations are encapsulated inside **Page Object classes**
- Step Definitions remain clean and readable
- Follows BDD best practices by focusing on **behavior**, not implementation

---

## 📊 Execution & Reporting

### ▶️ Running Tests
Execute all scenarios using Maven:

```bash
mvn clean test
```

---

### 📈 Test Reports

After execution, reports are generated automatically in the `target` directory:

- **Cucumber Report**  
  `target/cucumber-reports/index.html`

- **JUnit Summary Report**  
  `target/surefire-reports/index.html`

---

## 📋 Prerequisites

- **JDK** 21 or higher  
- **Maven** 3.x  
- Any modern browser:
  - Chrome  
  - Firefox  
  - Edge  

---

## ✅ Notes

- Framework is easily extensible for additional features and scenarios
- Designed to be lightweight, maintainable, and assessment-friendly
- Can be integrated with CI tools such as GitHub Actions or Jenkins

---

👨‍💻 **Author:** Kiran
