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
      "name": "@On-boardingScreen"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "On-boarding screen via the app and Location Services",
  "description": "",
  "id": "boohoo-application;on-boarding-screen-via-the-app-and-location-services",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch Boohoo App",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I select Location services option",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Hamburger Menu",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Sign In with Existing Account",
  "keyword": "Then "
});
formatter.match({
  "location": "Onboard.iLaunchBoohooApp()"
});
formatter.result({
  "duration": 13922446715,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3776501906,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnHamburgerMenu()"
});
formatter.result({
  "duration": 1423211531,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.signInWithExistingAccount()"
});
formatter.result({
  "duration": 21176792370,
  "status": "passed"
});
formatter.after({
  "duration": 160549,
  "status": "passed"
});
});