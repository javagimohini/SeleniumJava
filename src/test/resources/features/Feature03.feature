Feature: Application tests that covers 
	Links Presence, Successful Registration, Unsuccessful Registration

Background: 
	Given I am on the HomePage 
	
@mouseover 
Scenario: Mouseover action
	And I click on women mouseover and select Tshirts
#	Then I should see Tshirts text in Tshirts product page


@magnifyingsearch
Scenario: Search on magnifying button
    And I input text in search box
    When I click on Search button
    Then I should see list of items


@textinput
Scenario: verify textinput
    And I verify textinput and retrieve value
    
 @checkbox
Scenario: verify checkbox
    And I click on checkbox and verify selected enabled and displayed status
    
@radiobutton
Scenario: verify radio
    And I click on radiobutton and verify selected enabled and displayed status
 
 
 @dropdown
Scenario: verify dropdownbutton functionality
    And I click on dropdownbutton select an item and verify selected enabled and displayed status
 
@dragdrop
Scenario: verify drag and drop functionality
    And I verify drag and drop from one position to other
    
@Multiselect
Scenario: Verify Multiselect
 And I verify multiselect option
 
 @findalllinks
 Scenario: Verify finding all links
 And I verify finding all links on page

    
 
#@list
#Scenario: Verify list item
#
#@

	
	
#Scenario: Actionitem
#   When I select item in list
#   Then I should see that item selected
   