package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class setting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities rb = new DesiredCapabilities();
		
		rb.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		rb.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		rb.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		rb.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),rb);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//android.widget.LinearLayout[@index = '4']").click();
		
		String sb = driver.findElementByXPath("//android.widget.TextView[@text= \"Connected\"]/preceding::android.widget.TextView[1]").getText();
		
		System.out.println("Connected to: " +sb);
	}


}
