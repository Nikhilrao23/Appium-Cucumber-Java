package defaultpackage;

import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class dragAndDrop extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
		
		driver.findElementById("com.offerup:id/categories").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tickets\"))");
		
		TouchAction action = new TouchAction(driver);
		
		action.longPress(driver.findElementByXPath("//android.widget.TextView[@text = 'Tickets']")).moveTo(driver.findElementByXPath("//android.widget.TextView[@text = 'Musical instruments']")).release().perform();
		
	}

}
