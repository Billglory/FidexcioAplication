@FIX10-257
Feature:  Login Functionality

  User Story:
  As a user, I should be able to log in so that I can land on homepage.

Accounts are: posmanager, salesmanager

   Background: User should access the login page
    Given user is on the login page

@FIX10-337
  Scenario: Verify user should be able to login(PosManager, SalesManager)
  When user enters username
  Then user enters password
  And user clicks login button
  Then user logged in


  | username                | password     |
  | salesmanager15@info.com | salesmanager |
  | salesmanager16@info.com | salesmanager |
  | osmanager15@info.com    | posmanager   |
  | posmanager16@info.com   | posmanager   |


  @FIX10-338
  Scenario Outline:

    When  user enters wrong username
    Then user enters wrong password
    And user clicks login button
    Then user cannot login warning

    Examples:
      | user         | username                | password        |
      | posmanager   | posmanager15@info.com   | invalidpassword |
      | posmanager   | invalidusername         | posmanager      |
      | posmanager   | invalidusername         | invalidpassword |
      | salesmanager | salesmanager15@info.com | invalidpassword |
      | salesmanager | invalidusername         | salesmanager    |
      | salesmanager | invalidusername         | invalidpassword |



 @FIX10-339
  When user enters  <username>
  And user enters  <password>
  And user clicks on the log in button
  Then user should see the error message

    Examples:
      | username                | password     |
      | salesmanager15@info.com | salesmanager |

    @FIX10-340

    When user enters  <username>
    And user enters <password>
    Then user should not be able to see the password

    Examples:
      | username                | password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |

    @FIX10-341

    When user enters  <username>
    And user enters  <password>
    And user clicks on the enter key
    Then user logged in the home page

    Examples:
      | user         | username                | password     |
      | posmanager   | posmanager15@info.com   | posmanager   |
      | posmanager   | posmanager16@info.com   | posmanager   |
      | salesmanager | salesmanager15@info.com | salesmanager |
      | salesmanager | salesmanager16@info.com | salesmanager |
