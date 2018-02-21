Feature: OfferUpApp


  Scenario: Login Flow on app
    As a user I should be able to login in to my account
    With a existing user account

    When I launch OfferUp app
    And I chose Allow on Location Services
    And Click on Account on Bottom Navigational Panel
    And Tap on Continue with Google
    And I see my existing google account "nikhilraoqaintern@gmail.com"
    Then Work on Drag-Drop / Swipe
