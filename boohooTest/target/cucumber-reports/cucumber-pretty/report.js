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
formatter.match({
  "location": "Onboard.iLaunchBoohooApp()"
});
formatter.result({
  "duration": 14366228920,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iSelectLocationServicesOption()"
});
formatter.result({
  "duration": 3642005526,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnHamburgerMenu()"
});
formatter.result({
  "duration": 1909977477,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.signInWithExistingAccount()"
});
formatter.result({
  "duration": 23048412377,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.iClickOnBellIcon()"
});
formatter.result({
  "duration": 3076504230,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.userIsRedirectedToNotificationsScreen()"
});
formatter.result({
  "duration": 471034,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnPNToSearch()"
});
formatter.result({
  "duration": 3592786964,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickTheBackButton()"
});
formatter.result({
  "duration": 704707554,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.navigateToSideNavigationalPanel()"
});
formatter.result({
  "duration": 179226229,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.moveToShopPage()"
});
formatter.result({
  "duration": 7249970500,
  "status": "passed"
});
formatter.match({
  "location": "Onboard.clickOnMenCategory()"
});
formatter.result({
  "duration": 10442505200,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027USGPSNYCM212936.local\u0027, ip: \u0027fe80:0:0:0:1841:f728:4b42:789f%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_152\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities [{appPackage\u003dcom.poqstudio.app.platform.boohoo, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003demulator-5554, platform\u003dLINUX, deviceUDID\u003demulator-5554, appActivity\u003dcom.gpshopper.cpa.MainActivity, desired\u003d{appActivity\u003dcom.gpshopper.cpa.MainActivity, appPackage\u003dcom.poqstudio.app.platform.boohoo, platformName\u003dAndroid, deviceName\u003dNexus}, platformVersion\u003d7.1.1, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, deviceModel\u003dAndroid SDK built for x86, deviceManufacturer\u003dGoogle, platformName\u003dLINUX}]\nSession ID: a1ccfc3f-78e0-49b8-a4fd-5a99f3fc5a54\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.LinearLayout[@index \u003d \u00273\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:89)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:458)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:140)\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\n\tat steps.Onboard.clickOnMenCategory(Onboard.java:141)\n\tat ✽.Then Click on Men Category(Onboard.feature:16)\n",
  "status": "failed"
});
formatter.after({
  "duration": 171272,
  "status": "passed"
});
});