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
formatter.match({
  "location": "Onboard.iLaunchBoohooApp()"
});
formatter.result({
  "duration": 11038685883,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3487593042,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnHamburgerMenu()"
});
formatter.result({
  "duration": 1340971588,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.signInWithExistingAccount()"
});
formatter.result({
  "duration": 21086024297,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iClickOnBellIcon()"
});
formatter.result({
  "duration": 2960022679,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.userIsRedirectedToNotificationsScreen()"
});
formatter.result({
  "duration": 52270,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnPNToSearch()"
});
formatter.result({
  "duration": 5601258949,
  "status": "passed"
});
formatter.after({
  "duration": 190379,
  "status": "passed"
});
});