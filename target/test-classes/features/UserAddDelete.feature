@Regression
Feature: Create and Delete user on Teladoc test page

  Background:
    When I navigate to the url
    And I verify url by title

  @AddUser
  Scenario Outline: Add a user and validate the user has been added to the table
    Then I click on Add User button on the right side
    Then I enter "<First Name>" as first name
    Then I enter "<Last Name>" as last name
    Then I enter "<User Name>" as username
    Then I set "<Password>"
    Then I select "<Customer>" type
    Then I choose user "<Role>"
    Then I enter user "<E-mail>"
    Then I enter "<Cell Phone>" in numeric format with dashes
    Then I click on the Save button
    Then I verify that the "<User Name>" I created is present in the table
    Examples: I fill out the form as followed from the table below:
      | First Name | Last Name | User Name       | Password    | Customer    | Role     | E-mail                       | Cell Phone   |
      | Monster    | The Drink | monsterthedrink | testPass123 | Company BBB | Customer | monsterthedrink@testmail.com | 222-333-4455 |

  @Delete
  Scenario: Delete user User Name: novak and validate user has been delete
    Then I click on the delete user button to delete user novak
    Then Confirmation Dialog window should display on the screen
    Then I click on the OK button
    Then Verify that "novak" name does not exist in the list



