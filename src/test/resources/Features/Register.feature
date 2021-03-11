Feature: Login to BuggyCars

@FunctionalTests
Scenario Outline: User should be able to Register successfully
Given I open BuggyCars home page
And I click on Register button on Home Page
When I enter Registration details with "<Login>" and "<FirstName>" and  "<LastName>" and "<Password>" and "<ConfirmPassword>"
And I click on Register button
Then I should be able to Register
When I enter valid credentials for login with "<Login>" and "<Password>"
And I click on Login button
Then I should be able to see home page

Examples:
|Login  |FirstName|LastName|Password   |ConfirmPassword|
|Test128|test     | 128    |Password01!|Password01!    |

