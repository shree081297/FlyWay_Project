Feature: This feature file is used to automate Flyway Login functionality
@Regression
  Scenario: This scenario is used to Login to Flyway application by Valid Credentails
    Given I have landed on Loginpage of the application
    When I have to click on Sigup/Login button
    And I have to validate the Title
    And I have to enter Valid Email and Valid password and click on Login button
      | Email         | Password |
      | abc@gmail.com | abc@123  |
    Then I have to land on Dashboard page
@Sanity
  Scenario: This scenario is used to Login to Flyway application by InValid Credentails
	 Given I have landed on Loginpage of the application for invalid scenario
    When I have to click on Sigup/Login button for Invalid scenario
    And I have to validate the Title with invalid scenario
    And I have to enter InValid Email and InValid password and click on Login button
      | InValidEmail         | InValidPassword |
      | abc123@gmail.com | abc@12345  |
    Then I have to validate an error message