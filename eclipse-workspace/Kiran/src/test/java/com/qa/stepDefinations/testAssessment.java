package com.qa.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.qa.pageObjects.loginPage;
import com.qa.setup.baseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class testAssessment {
	
	private loginPage loginPage;
	private WebDriver driver;
	
	@Given("User launches the app in {string}")
	public void user_launches_the( String string2) throws InterruptedException {
		// launching the browser
		this.driver = baseClass.browserInitialization(string2);
		loginPage = new loginPage(this.driver);
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/src/test/resources/QE-index.html"; 
		driver.get("file://" + filePath);
		
	}

	@Then("I should see the email address input field")
	public void i_should_see_the_email_address_input_field() {
		loginPage.visibilityOfEmailField();
		
	}

	@And("I should see the password input field")
	public void i_should_see_the_password_input_field() {
		
		loginPage.visibilityOfPasswordField();
		
	}
	
	@And("I should see the login button")
	public void i_should_see_the_login_button() {
		
		loginPage.visibilityOfLoginBtn();
		
	}
	
	@When("I enter {string} as the email address")
	public void i_enter_the_email( String email ) {
		
		loginPage.enterEmail(email);
		
	}
	
	@And("I enter {string} as the password")
	public void i_enter_the_password( String pass ) {
		
		loginPage.enterPassword(pass);
		
	}
	
	@Then("I validate the number of items available in the list")
	public void i_validate_the_count() {
		loginPage.validateListCount();
		
	}
	
	
	@And("I validate the second list item value")
	public void i_validate_the_second_item_value() {
		
		loginPage.validateSecondListItemText();
		
	}
	
	@And("I validate the badge value for second item")
	public void i_validate_the_badge_item_value() {
		
		loginPage.verifyBadgeValue();
		
	}
	
	@Then("in the test 3 div, {string} should be the default selected value")
	public void verify_default_selected_value(String expectedValue) {
	    loginPage.verifyDefaultDropdownText(expectedValue);
	}

	@And("I select {string} from the dropdown list")
	public void i_select_option_from_dropdown(String optionName) {

	    loginPage.selectOption3();
	}
	
	@Then("in the test 4 div, I assert that the first button is enabled")
	public void verify_first_button_enabled() {
	    loginPage.verifyButtonState(1, true);
	}

	@And("in the test 4 div, I assert that the second button is disabled")
	public void verify_second_button_disabled() {

	    loginPage.verifyButtonState(2, false);
	}
	
	@Then("I validate the success message and button state")
	public void validate_the_disable_button() {
	    loginPage.handleTest5DelayedButton();
	}
	
	@Then("I verify the cell value at row {int} and column {int} is {string}")
	public void verify_grid_cell_value(int row, int col, String expectedValue) {
	    // One single call to handle everything
	    loginPage.verifyTableCellValue(row, col, expectedValue);
	}

}
