@blin
Feature: Access Oronic Documentation

  Scenario Outline: Verify users access the Oronic Documentation page by clicking the question icon
    Given the user logged in with username as "<username>" and password as "<password>"
    When the users clicks on the question mark
    Then the users should see the Oronic Documentation page

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |