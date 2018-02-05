package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class gitBase {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ff = new DesiredCapabilities();
		
		ff.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		ff.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ff.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.forkhub");
		ff.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.github.mobile.ui.user.HomeActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),ff);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
