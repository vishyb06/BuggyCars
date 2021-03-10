Feature: View and Vote Popular Model

  @FunctionalTests
  Scenario Outline: User should be able to see Popular model with login
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<UserName>" and "<Password>"
    And I click on Login button
    And I click on Popular Model image
    And I can see list of Popular model cars with rank and votes

    Examples:
      |UserName| Password |
      |test121|Password01! |


