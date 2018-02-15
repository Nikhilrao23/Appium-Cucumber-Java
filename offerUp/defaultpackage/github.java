package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class github {
	public static void main(String[] args) {
		
		try {
			appiumDriver();
			logIn();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

	public static void logIn() {
		// TODO Auto-generated method stub
		
		
		
	}

	public static void appiumDriver() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ty = new DesiredCapabilities();
		ty.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		ty.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ty.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.forkhub");
		ty.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.github.mobile.ui.user.HomeActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),ty);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Appium Driver Started");
		
	}
	
	
}