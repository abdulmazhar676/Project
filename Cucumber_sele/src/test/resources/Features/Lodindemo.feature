Feature: Login functionality check
Scenario: To check login with valid credentials

@Given Browser is open
And User is on login page
When user enters username and password
Then User is navigated to the home page
