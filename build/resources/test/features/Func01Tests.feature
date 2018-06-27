Feature: Application tests that covers 
	Links Presence, Successful Registration, Unsuccessful Registration

Background: 
	Given I am on the HomePage 
	
Scenario: Simple sign in scenario 
	When I click on SignIn button 
	Then I should be on the Authentication page 
	And I enter credentials 
		|UserName|tester@tet.com|		
		|Password|test1234|
	When I click on LogIn button 
	Then I should be on the MyAccount page 
	And I click on SignOut button 
	
	
	#Scenario: Links Presence 
	#	Then I click below links
	#		|Link01|ContactUs|
	#		|Link02|SignIn|
	
	#Scenario Outline: Successful Registration 
	#	When I click on "SignIn button" 
	#	Then I should be on the "AUTHENTICATION" page 
	#	And I enter "Email Address" 
	#	When I click on "Create an account button" 
	#	Then I should be on the "CREATE AN ACCOUNT" page 
	#	And I select "Title" 
	#	And I enter "Personal details" 
	#	And I select "checkboxes" 
	#	And I enter "Your address details" 
	#	When I click on "Register button" 
	#	Then I should be on the "MY ACCOUNT" page 
	#	And I should see the "Registration Success" message 
	#	And I click on "sign out button" 
	#	Then I should be on the "AUTHENTICATION" page 
	#	Examples: 
	#		|Email Address|Notes|
	#		|EmailAddress01|Personal details: title,firstName,lastName,email,password,dob|
	#		|EmailAddress02|Your address details: addressFirstName,addressLastName,address,city,state,postalCode,country,mobilePhone,aliasAddress|
	#		
	#Scenario: Unsuccessful Registration with email & dob details 
	#	When I click on "SignIn button" 
	#	Then I should be on the "AUTHENTICATION" page 
	#	And I enter "Personal details" 
	#	When I click on "Register button" with incorrect email and dob 
	#		|test|01/01|
	#		|test@|/1990|
	#		|||
	#	And I should see the "Email & DOB Error" message