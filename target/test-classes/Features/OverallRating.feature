Feature: Overall Rating

  @FunctionalTests
  Scenario Outline: User should be able to Rate a car
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<UserName>" and "<Password>"
    And I click on Login button
    And I click on Popular Make image

    Examples:
      |UserName| Password |
      |test121|Password01! |

