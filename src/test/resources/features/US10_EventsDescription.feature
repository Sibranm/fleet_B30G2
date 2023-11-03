@B30G2-104
Feature: Default

  Background:
		#@B30G2-73
    Given the user is on the login page


  @B30G2-103
  Scenario Outline: Verify the user is able to type into the “Description” box

    Given the user logged in as "<userType>"
    Then The user clicks on Create Events
    Then The user clicks on Create Calender Events
    And The user types into the Description box "Scrum stand-up meetings."
    Then The text is displayed in the Description box "Scrum stand-up meetings."

    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | driver        |