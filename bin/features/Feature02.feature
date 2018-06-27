Feature: Application tests that covers 
	clicks and title using scena Outline

Background: 
	Given I am on the HomePage 
	
@test1
Scenario Outline: Multiple User login 
	When I click on SignIn button 
	Then I should be on the Authentication page 
	And I enter <Username> and <Password> 
	When I click on LogIn button 
	Then I should be on the MyAccount page 
	And I click on SignOut button 
	
	Examples: 
		|Username|Password|
		|UserName01|Password01|
#		|UserName02|Password02|
		
@test
Scenario: out sc ex 
When I click on women button 
Then I should see WomenTitle displayed 