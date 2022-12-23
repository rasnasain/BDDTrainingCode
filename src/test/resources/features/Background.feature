@backgroundtest
Feature: Tests for Login page functionalities

  
  Background: Verify user is able to login
    Given User open OHRM application with Admin role
    When User enter valid username "Admin" and password "admin123"
    And User click on login button
    Then User logged in successfully
    
  
  Scenario: verify user is able to see list of system users
    Given User is on ORHM Dashboard page
    When User click on Admin
    Then User is able to see all available users list