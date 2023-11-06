@B30G2-57
Feature: As a user, I want to learn how to use the pinbar.

  Background: User is already in the log in page
    Given the user is on the login page

  @B30G2-90
    Scenario Outline: Verify the text displayed when users click the space link

    When the user logged in as "<userType>"
    And the user click on the "Learn how to use this space" link
    Then the user should see pinbar texts

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |
@B30G2-91
  Scenario Outline: Verify user can see image on the page
    Given the user logged in as "<userType>"
    And the user click on the "Learn how to use this space" link
    Then the users should see an image on the page

  Examples:
    | userType      |
    | driver        |
    | sales manager |
    | store manager |
