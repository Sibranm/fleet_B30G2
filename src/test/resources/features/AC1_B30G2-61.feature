Feature: Default

	
	@B30G2-80
	Scenario Outline: once the users launch on the Vehicle page, all the checkboxes should be unchecked.
		Given the user logged in with username as "<username>" and password as "<password>"
		    When the user launches on the Vehicle page
		    Then the user should see all the checkBox are unchecked
		
		    Examples:
		      | username        | password    |
		      | user1           | UserUser123 |
		      | salesmanager101 | UserUser123 |
		      | storemanager85  | UserUser123 |