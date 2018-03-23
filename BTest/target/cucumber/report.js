$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Onboard.feature");
formatter.feature({
  "line": 1,
  "name": "Boohoo Application",
  "description": "",
  "id": "boohoo-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "On-boarding screen via the app",
  "description": "User can Select Location Services",
  "id": "boohoo-application;on-boarding-screen-via-the-app",
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
  "duration": 15352192753,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3504039779,
  "status": "passed"
});
});