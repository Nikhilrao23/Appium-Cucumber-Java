package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class sauceSafari {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		
		// Note: The above is the difference on Desired Capabilities for Appium
		caps.setCapability("appiumVersion", "1.7.2");
		caps.setCapability("deviceName","iPhone 8 Plus Simulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion","11.2");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "Safari");
		
		IOSDriver<IOSElement> driver = new IOSDriver<>(new URL("http://nikbik:46396203-f58d-4711-abdb-64c101ef86b9@ondemand.saucelabs.com:80/wd/hub"),caps);
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}

}
