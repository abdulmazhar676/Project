Feature: Feature to test login functionality

  Scenario: check login successful with valid credentials
    Given user is on login page
    When enters username and password
    And clicks on the login button
    Then user navigate to the home page
