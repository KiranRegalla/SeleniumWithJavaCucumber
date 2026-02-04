package com.qa.pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginPage {
	WebDriver driver;
	
	@FindBy(id="inputEmail")
	WebElement emailField;
	
	@FindBy(id="inputPassword")
	WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement loginBtn;
	
	@FindBy(id="dropdownMenuButton")
	WebElement dropDownBtn;
	
	@FindBy(xpath="//a[text()='Option 3']")
	WebElement dropDownOption3;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void visibilityOfEmailField() {
		assertTrue("Email address input field is not visible on the page.", emailField.isDisplayed());
	}
	
	public void visibilityOfPasswordField() {
		
		assertTrue("password input field is not visible on the page.", passwordField.isDisplayed());

	}
	
	public void visibilityOfLoginBtn() {
		
		assertTrue("login button is not visible on the page.", loginBtn.isDisplayed());

	}
	
	public void enterEmail(String email) {
		
		emailField.sendKeys(email);

	}
	
	public void enterPassword(String pass) {
		
		emailField.sendKeys(pass);
		driver.close();

	}
	
	public void validateListCount() {
		
	    List<WebElement> listItems = driver.findElements(By.xpath("//h1[text()='Test 2']/following::ul[1]/li"));
	    int actualCount = listItems.size();
	    int expectedCount = 3;
	    assertEquals(expectedCount, actualCount);
	}
	
	public void validateSecondListItemText() {
		
	    List<WebElement> listItems = driver.findElements(By.xpath("//h1[text()='Test 2']/following::ul[1]/li"));
	    String actualText = listItems.get(1).getText().trim();
	    assertTrue(actualText.contains("List Item 2"));
	}
	
	public void verifyBadgeValue() {
		
	    WebElement badge = driver.findElement(By.xpath("//ul[@class='list-group']/li[2]/span"));
	    assertEquals("6", badge.getText().trim());
	}
	
	public void verifyDefaultDropdownText(String expectedText) {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", dropDownBtn);
        String actualText = dropDownBtn.getText().trim();
        assertEquals("Default dropdown value is incorrect!", expectedText, actualText);
        
    }
	
	public void selectOption3() {
		
        dropDownBtn.click();
        dropDownOption3.click();
    }
	
	public void verifyButtonState(int buttonIndex, boolean shouldBeEnabled) {
	    WebElement button = driver.findElement(By.xpath("//div[@id='test-4-div']//button[" + buttonIndex + "]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", button);
	    boolean actualState = button.isEnabled();
	    assertEquals(
	        "Button " + buttonIndex + " state mismatch!", 
	        shouldBeEnabled, 
	        actualState
	    );
	}
	
	public void handleTest5DelayedButton() {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    WebElement delayedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test5-button")));
	    
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", delayedButton);
	    delayedButton.click();

	    WebElement successMessage = driver.findElement(By.xpath("//button[@type='button']/preceding-sibling::div[1]"));
	    org.junit.Assert.assertTrue("Success message was not displayed!", successMessage.isDisplayed());

	    org.junit.Assert.assertFalse("Button should be disabled after click!", delayedButton.isEnabled());
	}
	
	public void verifyTableCellValue(int row, int col, String expectedValue) {
	    // 1. Convert 0-based coordinates to 1-based XPath indices
	    int xpathRow = row + 1;
	    int xpathCol = col + 1;

	    // 2. Build the dynamic XPath for the specific cell
	    String cellXpath = "//table//tr[" + xpathRow + "]/td[" + xpathCol + "]";
	    WebElement cell = driver.findElement(By.xpath(cellXpath));
	    
	    // 3. Scroll to the table for visibility
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", cell);
	    
	    // 4. Get text and perform the assertion internally
	    // JUnit 4 order: (message, expected, actual)
	    String actualValue = cell.getText().trim();
	    assertEquals("Grid value at (" + row + "," + col + ") mismatch!", expectedValue, actualValue);
	}
	
}
