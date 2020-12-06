Feature: Google Searching

  Scenario: Search from the search bar
    Given a web browser is at the google search page
    When a user types "otter" in the search bar
    And clicks on the search button
    Then links related to "otter" appears on the results page