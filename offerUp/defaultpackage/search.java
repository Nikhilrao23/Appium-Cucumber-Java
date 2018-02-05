package defaultpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class search extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
			
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Search']").click();
		driver.findElementByXPath("//android.widget.EditText[@text = 'Search']").sendKeys("cycle");
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'cycle']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Filter']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Edit']").click();
		
		driver.findElements(By.xpath("//android.widget.EditText[@text = '94043']")).clear();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'ZipCode']")).sendKeys("07029");
		
		driver.findElementByXPath("//android.widget.CheckedTextView[@text = 'Save']").click();
		
		driver.findElementById("com.offerup:id/sort_filter_apply").click();
		
		driver.swipe(165, 235, -2, 103, 0);
		
	
	}

}
