@rina
Feature: User should be able to see edit car info icons from the Vehicle page.



  Scenario Outline: users should see “view, edit, delete” when they hover the mouse over the 3 dots “…”

    Given the user logged in with username as "<username>" and password as "<password>"
    When  user launch on the Vehicle page
    And   user hover the mouse to the dropdown
    Then  user should see icons as expected: View
    Then  user should see icons as expected: Edit
    Then  user should see icons as expected: Delete

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |



