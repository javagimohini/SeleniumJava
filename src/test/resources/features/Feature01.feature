Feature: Application tests that covers 
	Links Presence, Successful Registration, Unsuccessful Registration

Background: 
	Given I am on the HomePage 
	
@test @ignore 
Scenario: Simple sign in scenario 
	When I click on SignIn button 
	Then I should be on the Authentication page 
	And I enter credentials 
		|UserName|UserName01|		
		|Password|Password01|
	When I click on LogIn button 
	Then I should be on the MyAccount page 
	And I click on SignOut button 

@test3
Scenario: out sc ex 
	When I click on women button 
	Then I should see WomenTitle displayed 