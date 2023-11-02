@B30G2-76
Feature: Default

  Background:
		#@B30G2-73
    Given the user is on the login page

  @B30G2-74
  Scenario Outline: US05AC1 Verify visibility of ten columns on Fleet Vehicles Model page for sales manager and store manager
    Given the user logged in as "<userType>"
    When User clicks on Vehicles Model option
    Then User sees ten columns on Fleet Vehicles Model page
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | userType      |
      | sales manager |
      | store manager |


  @B30G2-75
  Scenario: US05AC2 Verify visibility of ten columns on Fleet Vehicles Model page for driver
    Given the user logged in with username as "user1" and password as "UserUser123"
    When User clicks on Vehicles Model option
    Then User sees “You do not have permission to perform this action.”