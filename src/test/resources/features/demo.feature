Feature: Default

	#{color:#ff0000}*User Story :* {color}As a user, I should be able to log in so that I can land on homepage.
	#
	#_*Acceptance Criteria:*_
	#
	#{color:#ff0000}*1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)*{color}
	#2-"Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials
	#3- "Please fill out this field" message should be displayed if the password or username is empty
	#4-User lands on the ‘reset password’ page after clicking on the "Reset password" link
	#5-User should see the password in bullet signs by default
	#6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
	@FIX10-337
	Scenario: Verify user login with valid credentials
		When user enters username
		Then user enters password
		And user  clicks login button
		Then user logged in