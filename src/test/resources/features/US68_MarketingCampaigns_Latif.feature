@lat4
Feature: As a user, I want to manage filters on the Marketing page.


  Scenario Outline: Store and sales managers should see all 5 filter options are checked by default.
    Given the user logged in with username as "<username>" and password as "<password>"
    When sales and store join in Marketing Campaigns page
    And sales and store sees Menage filters
    Then sales and store sees 5 filter options are checked

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |


  Scenario Outline: any amount of boxes should be unchecked. (can check only 1, or multiple)
    Given the user logged in with username as "<username>" and password as "<password>"
    When sales and store join in Marketing Campaigns page
    And sales and store sees Menage filters
    Then they can uncheck 1 or all boxes

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |