Feature: Register and Vote Popular Model

  @FunctionalTests
  Scenario Outline: User should be able to see Popular model with login
    Given I open BuggyCars home page
    When I enter Registration details with "<Login>" and "<FirstName>" and  "<LastName>" and "<Password>" and "<ConfirmPassword>"
    And I click on Login button
    And I click on Popular Model image
    And I can see list of Popular model cars with rank and votes
    And I

    Examples:
      |Login  |FirstName|LastName|Password   |ConfirmPassword|Comment|
      |Test130|test     | 130   |Password01!|Password01!    | Test   |


