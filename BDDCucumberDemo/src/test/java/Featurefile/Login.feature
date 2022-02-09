Feature: Checking login Functionality of Orange HRM

  Scenario: Checking user login with valid credentials

    Given user is on login page
    When user is clicking on forgot password button
    Then user enters username in username textbox
    Then user enters password in password textbox
    When user clicks on login button
    Then user is on Homepage
    Then user is logging out
    Then Closing browser
