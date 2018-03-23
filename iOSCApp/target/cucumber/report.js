$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onboard.feature");
formatter.feature({
  "line": 2,
  "name": "Onboarding Scenario",
  "description": "",
  "id": "onboarding-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@appium"
    }
  ]
});
formatter.before({
  "duration": 10437707441,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User has to go through Onboarding sreen in the app",
  "description": "",
  "id": "onboarding-scenario;user-has-to-go-through-onboarding-sreen-in-the-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch Boohoo App",
  "keyword": "When "
});
formatter.match({
  "location": "Ans.iLaunchBoohooApp()"
});
formatter.result({
  "duration": 481362767,
  "status": "passed"
});
formatter.before({
  "duration": 104988074,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: A new session could not be created. Details: Problem getting session data for driver type AndroidDriver; does it implement \u0027get driverData\u0027? (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 11 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027USGPSNYCM212936.local\u0027, ip: \u0027fe80:0:0:0:41b:c7aa:555b:649%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_152\u0027\nDriver info: driver.version: AndroidDriver\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$new$0(JsonWireProtocolResponse.java:53)\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$getResponseFunction$2(JsonWireProtocolResponse.java:91)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$24(ProtocolHandshake.java:359)\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:362)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:136)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:89)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:217)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:140)\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:38)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:83)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:93)\n\tat io.appium.java_client.android.AndroidDriver.\u003cinit\u003e(AndroidDriver.java:72)\n\tat utility.hook.setUpAppium(hook.java:32)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat runner.RunTest.feature(RunTest.java:26)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\n\tat org.testng.TestRunner.run(TestRunner.java:505)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\n\tat org.testng.TestNG.run(TestNG.java:1017)\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 8,
  "name": "User Allows Location Service option",
  "description": "",
  "id": "onboarding-scenario;user-allows-location-service-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I Click Allow",
  "keyword": "When "
});
formatter.match({
  "location": "Ans.iClickAllow()"
});
formatter.result({
  "status": "skipped"
});
});