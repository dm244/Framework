Feature: Google search feature test

  Scenario: Search for a topic in google
    Given user on google homepage
    When user types  a topic name on search box
    Then user hits the search button
    And user navigates to result page
    
