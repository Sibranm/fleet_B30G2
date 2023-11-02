@B30G2-89
Feature: Default

  Background:
		#@B30G2-70
    Given the user is on the login page


  @B30G2-71
  Scenario Outline: US4AC1 Verify the Store managers and Sales managers access the Vehicle page

    Given the user logged in as "<userType>"
    When Store manager click the Fleet button
    And Store manager click the Vehicle Contract button
    Then URL is as expected
    Then Store manager see title is as expected
    Examples:
      | userType      |
      | Store manager |
      | Sales manager |


  @B30G2-72
  Scenario: US4AC2 Verify the Drivers should NOT able to access the Vehicle contract page
    Given the user logged in as "Driver"
    When Driver click the Fleet button
    And Driver click the Vehicle Contract button
    Then App should display no permission message