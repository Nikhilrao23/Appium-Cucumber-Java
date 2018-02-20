package steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    private AppiumDriver driver;

    @When("^I launch OfferUp app$")
    public void iLaunchOfferUpApp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DesiredCapabilities cb = new DesiredCapabilities();
        cb.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        cb.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cb.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.offerup");
        cb.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.offerup.android.search.SearchActivity");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cb);

        Thread.sleep(3000);
    }

    @And("^I chose Allow on Location Services$")
    public void iChoseAllowOnLocationServices() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click on Allow Button");
        driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
    }

    @And("^Click on Account on Bottom Navigational Panel$")
    public void clickOnAccountOnBottomNavigationalPanel() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElementById("com.offerup:id/nav_profile").click();

    }

    @And("^Tap on Continue with Google$")
    public void tapOnContinueWithGoogle() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElementById("com.offerup:id/google_signin_button").click();
    }

    @Then("^I see my existing google account \"([^\"]*)\"$")
    public void iSeeMyExistingGoogleAccount(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElementById("com.google.android.gms:id/account_display_name").click();
        Thread.sleep(5000);
        System.out.println(driver.findElementByXPath("//android.widget.TextView[@index = '4']"));
    }
}