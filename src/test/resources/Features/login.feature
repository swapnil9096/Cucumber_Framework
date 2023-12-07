
Feature: Login fetaure

  Scenario: Verify login functionality with valid credentials
    Given User should be on login page
    When User enters "Admin" and "admin123"
    And Clicks on login button
    Then User should be navigated to the homepage
