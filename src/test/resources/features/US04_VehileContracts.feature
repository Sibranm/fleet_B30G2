@wip
Feature: User should be able to access to Vehicle contracts page
  Agile story: As a user, I want to access to Vehicle contracts page

  Background: For all the scenarios user is on the log in page.
    Given the user is on the login page

  Scenario: Menu option for the Store managers
    Given the user logged in as "Store manager"
    When Store manager click the Fleet button
    And Store manager click the Vehicle Contract button
    Then Store manager see title is as expected
  #expectedTitle: All - Vehicle Contract - Entities - System - Car -Entities - System
  #actualTitle: Vehicle Contract - Entities - System - Car -Entities - System

  Scenario: Menu option for the Sales managers
    Given the user logged in as "Sales manager"
    When Sales manager the Fleet button
    And Sales manager click the Vehicle Contract button
    Then Sales manager see title is as expected
  #expectedTitle: All - Vehicle Contract - Entities - System - Car -Entities - System
  #actualTitle: Vehicle Contract - Entities - System - Car -Entities - System

  Scenario: No Permission message for the Drivers
    Given the user logged in as "Driver"
    When Driver click the Fleet button
    And Driver click the Vehicle Contract button
    Then App should display no permission message
  #expectedMessage: You do not have permission to perform this action.
  #actualMessage: You do not have permission to perform this action.


















