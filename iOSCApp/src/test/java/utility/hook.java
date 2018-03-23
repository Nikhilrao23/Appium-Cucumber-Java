package utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hook {

    private static WebDriver driver;

    @Before("@appium")
    public void setUpAppium() throws MalformedURLException {

        DesiredCapabilities bh = new DesiredCapabilities();
        bh.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus");
        bh.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        bh.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.gpshopper.clientcorelibrary.NavigationActivity");
        bh.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.gpshopper.clientcoreapp");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),bh);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
