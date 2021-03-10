Feature: View Popular Make

  @FunctionalTests
  Scenario Outline: User should be able to see Popular model with login
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<UserName>" and "<Password>"
    And I click on Login button
    And I click on Popular Make image
    And I can see list of Popular model cars with rank and votes
    And I click on Next page

    Examples:
      |UserName| Password |
      |test121|Password01! |
