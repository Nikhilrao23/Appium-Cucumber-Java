package defaultpackage;

import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class sortandFilter extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Filter']").click();
		
		TouchAction action = new TouchAction(driver);
		
		action.press(driver.findElementByXPath("//android.widget.TextView[@text = '30']")).moveTo(driver.findElementByXPath("//android.widget.TextView[@text = '20']")).release().perform();
		
		System.out.println("We have Swiped Miles");
		
		
	}

}
