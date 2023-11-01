@am
Feature: Access main modules
  US1- As a user, I should be accessing all the main modules of the app.

  Background:
    Given User is on the login page

  Scenario: Store and sales managers should view 8 module names
    When User enters store manager <username> and <password>
    And user should be able to login
    Then User should see all the main <Modules>:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario: Drivers should view 4 module names
    When User enters driver <username> and <password>
    And user is able to login
    Then User should see the following <Modules>:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |
