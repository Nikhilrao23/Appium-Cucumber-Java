$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Onboard.feature");
formatter.feature({
  "line": 2,
  "name": "Boohoo Application",
  "description": "",
  "id": "boohoo-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@boohoo"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "On-boarding screen via the app and Location Services",
  "description": "",
  "id": "boohoo-application;on-boarding-screen-via-the-app-and-location-services",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I launch Boohoo App",
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
  "name": "Enter Shirts as Search Text and Click Search Icon",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Tap on Refine and select Men",
  "keyword": "Then "
});
formatter.match({
  "location": "Onboard.iLaunchBoohooApp()"
});
formatter.result({
  "duration": 10827271249,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3351828888,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnHamburgerMenu()"
});
formatter.result({
  "duration": 1376458111,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.signInWithExistingAccount()"
});
formatter.result({
  "duration": 22350439201,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iClickOnBellIcon()"
});
formatter.result({
  "duration": 2899871220,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.userIsRedirectedToNotificationsScreen()"
});
formatter.result({
  "duration": 56892,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnPNToSearch()"
});
formatter.result({
  "duration": 3459562451,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickTheBackButton()"
});
formatter.result({
  "duration": 677501388,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.navigateToSideNavigationalPanel()"
});
formatter.result({
  "duration": 3127901791,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.moveToShopPage()"
});
formatter.result({
  "duration": 3346598742,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnMenCategory()"
});
formatter.result({
  "duration": 2506072171,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnSearchIcon()"
});
formatter.result({
  "duration": 765820614,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.enterShirtsAsSearchTextAndClickSearchIcon()"
});
formatter.result({
  "duration": 5683719010,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.tapOnRefineAndSelectMen()"
});
formatter.result({
  "duration": 5923987082,
  "status": "passed"
});
formatter.after({
  "duration": 429811,
  "status": "passed"
});
});