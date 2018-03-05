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
formatter.match({
  "location": "Onboard.iLaunchBoohooApp()"
});
formatter.result({
  "duration": 10883814322,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3502367278,
  "status": "passed"
});
formatter.after({
  "duration": 166541,
  "status": "passed"
});
});