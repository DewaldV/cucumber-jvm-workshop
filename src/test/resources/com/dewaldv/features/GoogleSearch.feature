Feature: Google Search
  Scenario: Search for hello world
    Given I am on the google homepage
    When I type in "hello world"
    Then I should see the top 10 results