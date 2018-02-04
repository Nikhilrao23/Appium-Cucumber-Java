package defaultpackage;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class login extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	AndroidDriver<AndroidElement> driver = Capabilities();
	
	driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
	driver.findElementByXPath("//android.widget.TextView[@text = 'Account']").click();
	driver.findElementById("com.offerup:id/google_signin_button").click();
	driver.findElementByXPath("//android.widget.TextView[@text = 'Nikhil Rao Balaji']").click();
	System.out.println(driver.findElementById("com.offerup:id/profile_name").getText());
	
	driver.findElementById("com.offerup:id/settings").click();
	driver.findElementById("com.offerup:id/logout").click();
	driver.findElementByXPath("//android.widget.CheckedTextView[@text = 'Log Out']").click();
	

	}

}
