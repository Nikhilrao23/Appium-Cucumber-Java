@boohoo
Feature: Boohoo Application

  Scenario: On-boarding screen via the app and Location Services

    When I launch Boohoo App
    Then I select Location services option
    And Click on Hamburger Menu
    Then Sign In with Existing Account
    When I click on Bell Icon
    And User is redirected to Notifications Screen
    Then Click on PN To Search
    And Click the Back button
    Then Navigate to Side Navigational Panel
    And Move to Shop page
    Then Click on Men Category

