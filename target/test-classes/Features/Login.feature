Feature: Login to BuggyCarsRating

  @FunctionalTests
  Scenario Outline: User should be able to login successfully with valid credentials
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<UserName>" and "<Password>"
    And I click on Login button
    Then I should be able to see home page

    Examples:Login.feature
      |UserName| Password |
      |test121|Password01! |
