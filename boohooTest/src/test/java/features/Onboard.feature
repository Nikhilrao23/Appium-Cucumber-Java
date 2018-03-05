@On-boardingScreen
Feature: Boohoo Application
  Scenario: On-boarding screen via the app and Location Services

    When I launch Boohoo App
    Then I select Location services option

  Scenario: Sign Up or Create an Account

    When I click ME on Side Navigational Panel
    Then User is moved to Account page
    And Click Log In / Create Account
    Then Enter FN, LN, Email, PWD and Click Submit

