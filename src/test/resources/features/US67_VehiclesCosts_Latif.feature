@lat3
Feature: As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox)


  Scenario Outline: Users should see 3 columns on the Vehicle Costs page.
    Given the user logged in with username as "<username>" and password as "<password>"
    When the user launches on the Vehicle Costs page
    Then Users should see column on the Vehicle Costs page. Expected Column names: TYPE
    Then Users should see column on the Vehicle Costs page. Expected Column names: TOTAL PRICE
    Then Users should see column on the Vehicle Costs page. Expected Column names: DATE

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |


  Scenario Outline: Users check the first checkbox to check all the Vehicle Costs
    Given the user logged in with username as "<username>" and password as "<password>"
    When the user launches on the Vehicle Costs page
    Then Users check the first checkbox to check all the Vehicle Costs

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |







