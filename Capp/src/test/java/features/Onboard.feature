@first
Feature: CoreApp Application

  Scenario: On-boarding screen via the app and Location Services

    When I launch Core App
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
    And Click on Search Icon
    And Enter Shoe as Search Text and Click Search Icon
    Then Tap on Refine and select Men
    And Click on 3 Pack T Shirts
    And Select Color and Size
    When Tapping on Clothing Category
    And Select Size and Add to bag
    Then Open Cart from Top Right Corner
