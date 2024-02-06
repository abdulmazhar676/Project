Feature: feature to search google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google home page
    When user enters a text in search box
    And hits enter
    Then user is navigated to the search page
