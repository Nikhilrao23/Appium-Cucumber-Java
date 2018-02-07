package defaultpackage;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class search extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
			
		AndroidDriver<AndroidElement> driver = Capabilities();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Search']").click();
		
		driver.findElementByXPath("//android.widget.EditText[@text = 'Search']").sendKeys("cycle");
		
		TouchAction t = new TouchAction(driver);
		
		t.tap(996,1691).perform();
		/*
		((AndroidDriver) driver).pressKeyCode(66);
	
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		driver.pressKeyCode(66);
	
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'cycle']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Filter']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Edit']").click();
		
		driver.findElements(By.xpath("//android.widget.EditText[@text = '94043']")).clear();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'ZipCode']")).sendKeys("07029");
		
		
		driver.findElementByXPath("//android.widget.CheckedTextView[@text = 'Save']").click();
		
		driver.findElementById("com.offerup:id/sort_filter_apply").click();
		
		driver.swipe(165, 235, -2, 103, 0);
		*/
		
	}

}
