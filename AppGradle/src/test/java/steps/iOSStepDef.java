package steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class iOSStepDef {
    private AppiumDriver driver;
    @When("^I launch OfferUp app on iPhone$")
    public void iLaunchOfferUpAppOnIPhone() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        DesiredCapabilities ting = new DesiredCapabilities();

        ting.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
        ting.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        ting.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.offerup");
        ting.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.offerup.android.search.SearchActivity");
        ting.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),ting);

    }
}
