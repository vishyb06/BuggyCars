@BuggyCarsRatingTest
Feature: Register and Login to BuggyCars

  Scenario Outline: User should be able to Register successfully
    Given I open BuggyCars home page
    And I click on Register button on Home Page
    When I enter Registration details with "<Login>" and "<FirstName>" and  "<LastName>" and "<Password>" and "<ConfirmPassword>"
    And I click on Register button
    Then I should be able to Register
    Then I should be able to see home page

    Examples:
      |Login  |FirstName|LastName|Password   |ConfirmPassword|
      |Test142|test     | 142    |Password01!|Password01!    |



  Scenario Outline: User should be able to login successfully with valid credentials
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<Login>" and "<Password>"
    And I click on Login button
    Then I should be able to see home page

    Examples:
      |Login  |Password   |
      |Test142|Password01!|


  Scenario Outline: User should be able to see Popular make with login
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<Login>" and "<Password>"
    And I click on Login button
    And I click on Popular Make image
    And I click on Next page

    Examples:
      |Login| Password |
      |Test142|Password01! |



  Scenario Outline: User should be able to see Popular model with login
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<Login>" and "<Password>"
    And I click on Popular Model image
    And I can see Popular model car details

    Examples:
      |Login| Password |
      |Test142|Password01! |


  Scenario Outline: login with User and vote car rating with comments
    Given I open BuggyCars home page
    When I enter valid credentials for login with "<Login>" and "<Password>"
    And I click on Login button
    And I click on Overall Rating image
    And I select a Car for voting
    And I enter details for "<Comment>"
    And I click on Vote button
 

    Examples:
      |Login| Password |Comment|
      |Test142|Password01!| Test  |