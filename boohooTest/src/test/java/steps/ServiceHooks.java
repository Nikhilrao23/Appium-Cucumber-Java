package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class ServiceHooks {
    public AppiumDriver driver;
    public AppiumDriver initializeTest() throws Throwable {
        // Code to setup initial configurations
        DesiredCapabilities bh = new DesiredCapabilities();

        bh.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus");
        bh.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        bh.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.gpshopper.cpa.MainActivity");
        bh.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.poqstudio.app.platform.boohoo");

        driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),bh);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}