Feature: To validate the fields available on the app

Background:
Given  User launches the app in "chrome"

Scenario: Validate the email and password fields available
	Then I should see the email address input field
    And I should see the password input field
	And I should see the login button
    When I enter "user@example.com" as the email address
    And I enter "securePassword123" as the password
    
Scenario: Validate the list available
	Then I validate the number of items available in the list
    And I validate the second list item value
	And I validate the badge value for second item
	
Scenario: Validate the drop down values
	Then in the test 3 div, "Option 1" should be the default selected value
    And I select "Option 3" from the dropdown list
    
Scenario: Verify button states in Test 4
    Then in the test 4 div, I assert that the first button is enabled
    And in the test 4 div, I assert that the second button is disabled

Scenario: Verify delayed button and success message in Test 5
	Then I validate the success message and button state
	
Scenario: Validate grid cell value at specific coordinates
    Then I verify the cell value at row 2 and column 2 is "Ventosanzap"

  