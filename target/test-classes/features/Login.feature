@login
Feature: Tests for Login page functionalities

  @login1
  Scenario: Title of your scenario
    Given User open OHRM application with Admin role
    When User enter valid username "Admin" and password "admin123"
    And User click on login button
    Then User logged in successfully
    
  @login2
  Scenario Outline: Title of your scenario
    Given User open OHRM application with Admin role
    When User enter valid username "<UserName>" and password "<Password>"
    And User click on login button
    Then User logged in successfully
    
    Examples:
    
    | UserName | Password |
    | Admin    | admin123 |

    @login3
  Scenario Outline: Title of your scenario
  example of data table
    Given User open OHRM application with Admin role
    When User enter valid username UserName and Password
    | UserName | Password |
    | Admin1   | admin1234 |
    | Admin2   | admin123 |
    And User click on login button
    Then User logged in successfully