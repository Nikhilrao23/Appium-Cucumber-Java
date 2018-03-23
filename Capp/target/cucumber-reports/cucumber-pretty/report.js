$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Onboard.feature");
formatter.feature({
  "line": 2,
  "name": "CoreApp Application",
  "description": "",
  "id": "coreapp-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@first"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "On-boarding screen via the app and Location Services",
  "description": "",
  "id": "coreapp-application;on-boarding-screen-via-the-app-and-location-services",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I launch Core App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select Location services option",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Hamburger Menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Sign In with Existing Account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Bell Icon",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User is redirected to Notifications Screen",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on PN To Search",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click the Back button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Navigate to Side Navigational Panel",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Move to Shop page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click on Men Category",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Search Icon",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Enter Shoe as Search Text and Click Search Icon",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Tap on Refine and select Men",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on 3 Pack T Shirts",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Color and Size",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Tapping on Clothing Category",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Select Size and Add to bag",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Open Cart from Top Right Corner",
  "keyword": "Then "
});
formatter.match({
  "location": "Onboard.iLaunchCoreApp()"
});
formatter.result({
  "duration": 11595291210,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3406901419,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnHamburgerMenu()"
});
formatter.result({
  "duration": 1725380115,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.signInWithExistingAccount()"
});
formatter.result({
  "duration": 16729748989,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iClickOnBellIcon()"
});
formatter.result({
  "duration": 2904938600,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.userIsRedirectedToNotificationsScreen()"
});
formatter.result({
  "duration": 77837,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnPNToSearch()"
});
formatter.result({
  "duration": 9701869330,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickTheBackButton()"
});
formatter.result({
  "duration": 926180440,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.navigateToSideNavigationalPanel()"
});
formatter.result({
  "duration": 3131608429,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.moveToShopPage()"
});
formatter.result({
  "duration": 3416352148,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnMenCategory()"
});
formatter.result({
  "duration": 2955387786,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnSearchIcon()"
});
formatter.result({
  "duration": 853430976,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.enterShirtsAsSearchTextAndClickSearchIcon()"
});
formatter.result({
  "duration": 8814200541,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.tapOnRefineAndSelectMen()"
});
formatter.result({
  "duration": 7512752954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 9
    }
  ],
  "location": "Onboard.clickOnPackTShirts(int)"
});
formatter.result({
  "duration": 2920901653,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.selectColorAndSize()"
});
formatter.result({
  "duration": 2915003741,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.tappingOnClothingCategory()"
});
formatter.result({
  "duration": 8379639552,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.selectSizeAndAddToBag()"
});
formatter.result({
  "duration": 7946425106,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.openCartFromTopRightCorner()"
});
formatter.result({
  "duration": 595775268,
  "status": "passed"
});
formatter.after({
  "duration": 589882,
  "status": "passed"
});
});