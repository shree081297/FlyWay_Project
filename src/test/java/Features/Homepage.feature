@FlyWay
Feature: This feature file is used to automate Flyway website

  Scenario: This scenario is used to Login to the application
    Given user should land on Loginpage of the application
    When user should click on Sigup/Login button
    And user should validate the Title
    And user should enter Valid Email and Valid password and click on Login button
      | Email         | Password |
      | abc@gmail.com | abc@123  |
    And user should  land on Dashboard page validate the login page
    When I have to click on Home
    Then Select the flights from Bangalore to Chennai and click on submit button
    And Flights shout be displayed on the screen
    And click on Book Flight
    And Click on complete booking
    And click on See your bookings
    And I have to land on Your bookings page
    And validate the Airline and cost
