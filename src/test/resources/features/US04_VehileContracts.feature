@wip
Feature: User should be able to access to Vehicle contracts page
  Agile story: As a user, I want to access to Vehicle contracts page

  Background: For all the scenarios user is on the log in page.

  Scenario: Menu option for the Store managers
    Given user is on the home page
    When the user hover over the mouse on the Fleet button
    And the user click the Vehicle Contract button
    Then the user should see "All - Vehicle Contract - Entities - System - Car -Entities - System" in the Title

  Scenario: Menu option for the Sales managers
    Given user is on the home page
    When the user hover over the mouse on the Fleet button
    And the user click the Vehicle Contract button
    Then the user should see "All - Vehicle Contract - Entities - System - Car -Entities - System" in the Title

  Scenario: No Permission message for the Drivers
    Given user is on the home page
    When the user hover over the mouse on the Fleet button
    And the user click the Vehicle Contract button
    Then App should display "You do not have permission to perform this action."

















