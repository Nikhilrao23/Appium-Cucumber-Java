package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cb = new DesiredCapabilities();
		cb.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cb.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		cb.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.offerup.android.search.SearchActivity");
		cb.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.offerup");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cb);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
