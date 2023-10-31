@smoke
Feature: User should be able to access to Vehicle contracts page
  Agile story: Store managers and Sales managers access the Vehicle page

  Background: For all scenarios user is logged in

  @storeManager
  Scenario: Menu option for the Store managers
    Given the user is logged in
    When the user hover over the mouse on the Fleet button
    And the user click the Vehicle Contract button
    Then User should see the following page title
      | All              |
      | Vehicle Contract |
      | Entities         |
      | System           |
      | Car              |
      | Entities         |
      | System           |

  @salesManager
  Scenario: Menu option for the Sales managers
    Given the user is logged in
    When the user hover over the mouse on the Fleet button
    And the user click the Vehicle Contract button
    Then User should see the following page title
      | All              |
      | Vehicle Contract |
      | Entities         |
      | System           |
      | Car              |
      | Entities         |
      | System           |


