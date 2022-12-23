@Amazon

Feature: Tests for amazon
  I want to use this template for my feature file

  @test1
  Scenario: Title of your scenario
    Given I open amazon application
    When I go to categories section
    Then I should be able to select books categories from categories
    And I click on search
    Then I expect the top picks of books should be displayed
    But Not any other products from any other category

  