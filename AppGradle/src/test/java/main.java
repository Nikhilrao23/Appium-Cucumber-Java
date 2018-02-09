import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws MalformedURLException {


        DesiredCapabilities cb = new DesiredCapabilities();
        cb.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        cb.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cb.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.offerup");
        cb.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.offerup.android.search.SearchActivity");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cb);
        driver.quit();

    }
}
