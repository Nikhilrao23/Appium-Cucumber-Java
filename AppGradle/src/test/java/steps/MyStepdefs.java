package steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;

public class MyStepdefs {
    @When("^I launch OfferUp app$")
    public void iLaunchOfferUpApp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DesiredCapabilities cb = new DesiredCapabilities();
        cb.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        cb.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cb.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.offerup");
        cb.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.offerup.android.search.SearchActivity");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cb);

        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ALLOW\")").click();
    }
}