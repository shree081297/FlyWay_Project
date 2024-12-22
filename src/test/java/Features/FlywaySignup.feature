Feature: This feature file is used to automate Flyway Signup functionality

  Scenario: This scenario is used to book a flight
    Given I have launched the application
    When I have to click on Login/signup button
    And I have to validate the FLYAWAY - MEMBER LOGIN page is displayed
    And I have to click on Not a Member? Signup button
    Then I have to land on FLYAWAY - MEMBER REGISTRATION page validate the title of the page
    And I have to enter Signup details
      | Email            | Password | Confirm_Password | Name   | Address | City      |
      | abc123@gmail.com | abc@123  | abc@123          | admin1 | India   | Hyderabad |
    And After clicking on signup button click on Login to continue checking flights
    Then I have to land on LoginPage
