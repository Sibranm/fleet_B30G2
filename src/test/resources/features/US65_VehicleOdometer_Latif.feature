@lat2
Feature: As a user, I want to view car odometer info on the Vehicles Odometers page.

  Scenario Outline: Store and Sales managers should see an error message
  "You do not have permission to perform this action." when they click the “Vehicle Odometer” module.
    Given the user logged in with username as "<username>" and password as "<password>"
    When the user click on the vehicle odometer page
    Then the user should see error message

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |


    Scenario: Drivers should see the default page as 1.
      Given the user logged in as "driver"
      When Driver click on the vehicle odometer page
      Then Diver should see the default page as 1


    Scenario: Divers should see the View Per Page is 25 by default.
      Given the user logged in as "driver"
      When Driver click on the vehicle odometer page
      Then Divers should see the View Per Page is 25 by default.