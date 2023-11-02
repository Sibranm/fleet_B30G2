@B30G2-96
Feature: Default

  Background:
		#@B30G2-73
    Given the user is on the login page


  @B30G2-94

  Scenario Outline: Verify the error message when a too small number is entered into the calendar repeat day input box
    Given the user logged in as "<userType>"
    Then The user clicks on Create Events
    Then The user clicks on Create Calender Events
    Then The user clicks on Repeat checkbox
    Then The user enters a number less than one into the day input box
    Then The user should see error message "The value have not to be less than 1."
    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | driver        |


  @B30G2-95

  Scenario Outline: Verify the error message when a too large number is entered into the calendar repeat day input box
    Given the user logged in as "<userType>"
    Then The user clicks on Create Events
    Then The user clicks on Create Calender Events
    Then The user clicks on Repeat checkbox
    Then The user enters a number more than ninety-nine into the day input box
    Then The user should see error message "The value have not to be more than 99."
    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | driver        |