Feature: Checking login Functionality of Orange HRM

  Scenario: Checking user login with valid credentials

    Given user is on login page
    When user is clicking on forgot password button
    Then user enters username and passowrd in username textbox and click on login button
    Then user is on Homepage
    Then Closing browser
