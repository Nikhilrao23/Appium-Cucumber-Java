package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class github {
	public static AndroidDriver<AndroidElement> driver;
	// public static AppiumDriver<?> driver1;
	@FindBy(id = "jp.forkhub:id/et_login") private static MobileElement userName;
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
		System.out.println("Log In Page");
		userName.sendKeys("Nikhil");
	}

	private static void appiumDriver() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ty = new DesiredCapabilities();
		ty.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		ty.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ty.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.forkhub");
		ty.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.github.mobile.ui.user.HomeActivity");
		AndroidDriver AndroidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),ty);
		driver = AndroidDriver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Appium Driver Started");
	
	}

	/*
	public static void logIn() {
		// TODO Auto-generated method stub
		
	if(driver.findElements(By.id("jp.forkhub:id/et_login")).size() >= 0){
		System.out.println("Entering Username");
		userName.sendKeys("nikhilraoqaintern");
	
		System.out.println("UserName");
		driver.hideKeyboard();
		System.out.println("Hide Keyboard");
		userName.sendKeys("Nikhil");
	
	}
	*/
	}
