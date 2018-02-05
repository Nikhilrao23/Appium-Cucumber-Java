package defaultpackage;
import java.net.MalformedURLException;
import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gitLogin extends gitBase {
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		if (driver.findElements(By.id("jp.forkhub:id/et_login")).size()>0){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String UN = sc.nextLine();
		
		driver.findElementById("jp.forkhub:id/et_login").sendKeys(UN);
		
		System.out.println("Enter Password: ");
		String pwd = sc.nextLine();
		
		driver.findElementById("jp.forkhub:id/et_password").sendKeys(pwd);
		
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.TextView[@text = 'LOG IN']").click();
		}
		else{
			
			System.out.println("We have already logged in");
		}
		
		
	}

}
