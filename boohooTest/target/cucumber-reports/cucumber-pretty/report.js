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
formatter.step({
  "line": 20,
  "name": "Click on 3 Pack T Shirts",
  "keyword": "And "
});
formatter.match({
  "location": "Onboard.iLaunchBoohooApp()"
});
formatter.result({
  "duration": 12255028121,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3470201112,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnHamburgerMenu()"
});
formatter.result({
  "duration": 1405646291,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.signInWithExistingAccount()"
});
formatter.result({
  "duration": 20705993810,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iClickOnBellIcon()"
});
formatter.result({
  "duration": 2947286469,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.userIsRedirectedToNotificationsScreen()"
});
formatter.result({
  "duration": 96843,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnPNToSearch()"
});
formatter.result({
  "duration": 6515818370,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickTheBackButton()"
});
formatter.result({
  "duration": 676765514,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.navigateToSideNavigationalPanel()"
});
formatter.result({
  "duration": 3128530282,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.moveToShopPage()"
});
formatter.result({
  "duration": 3311623003,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnMenCategory()"
});
formatter.result({
  "duration": 6007526579,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnSearchIcon()"
});
formatter.result({
  "duration": 779934150,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.enterShirtsAsSearchTextAndClickSearchIcon()"
});
formatter.result({
  "duration": 5779208316,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.tapOnRefineAndSelectMen()"
});
formatter.result({
  "duration": 18978987168,
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
  "duration": 101024208,
  "error_message": "org.openqa.selenium.UnsupportedCommandException: The requested resource could not be found, or a request was received using an HTTP method that is not supported by the mapped resource. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027USGPSNYCM212936.local\u0027, ip: \u0027fe80:0:0:0:808:b2f0:cccd:bb1f%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_152\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities [{appPackage\u003dcom.poqstudio.app.platform.boohoo, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003demulator-5554, platform\u003dLINUX, deviceUDID\u003demulator-5554, appActivity\u003dcom.gpshopper.cpa.MainActivity, desired\u003d{appActivity\u003dcom.gpshopper.cpa.MainActivity, appPackage\u003dcom.poqstudio.app.platform.boohoo, platformName\u003dAndroid, deviceName\u003dNexus}, platformVersion\u003d7.1.1, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, deviceModel\u003dAndroid SDK built for x86, deviceManufacturer\u003dGoogle, platformName\u003dLINUX}]\nSession ID: fd2da684-0ae8-4dbc-9e28-f5bc45a7f834\n*** Element info: {Using\u003d-android uiautomator, value\u003dnew UiScrollable(new UiSelector()).scrollIntoView(text(\"3 Pack T Shirts\")}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:89)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.MobileBy.findElement(MobileBy.java:63)\n\tat io.appium.java_client.MobileBy$ByAndroidUIAutomator.findElement(MobileBy.java:232)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat steps.Onboard.clickOnPackTShirts(Onboard.java:180)\n\tat ✽.And Click on 3 Pack T Shirts(Onboard.feature:20)\n",
  "status": "failed"
});
formatter.after({
  "duration": 588370,
  "status": "passed"
});
});