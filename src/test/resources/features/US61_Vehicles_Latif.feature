@lat1
Feature: As a user, I should be able to select any vehicle from the Vehicle page(web table)


  Scenario Outline: once the users launch on the Vehicle page, all the checkboxes should be unchecked.
    Given the user logged in with username as "<username>" and password as "<password>"
    When the user launches on the Vehicle page
    Then the user should see all the checkBox are unchecked

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |


  Scenario Outline: user checks the first checkbox to check all the cars
    Given the user logged in with username as "<username>" and password as "<password>"
    When the user launches on the Vehicle page
    And the user check the first checkBox
    And the checkbox is selected
    Then the user should see all the checkBoxes checked

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |


  Scenario Outline: users can select any car
    Given the user logged in with username as "<username>" and password as "<password>"
    When the user launches on the Vehicle page
    And the user selects any car
    Then that car should be selected

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |