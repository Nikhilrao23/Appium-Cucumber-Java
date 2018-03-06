package steps;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;

    public class Onboard {

        AppiumDriver driver;

        public Onboard() throws Throwable {
            driver = (new ServiceHooks()).initializeTest();
        }


            // private AppiumDriver driver;
            @When("^I launch Boohoo App$")
            public void iLaunchBoohooApp () throws Throwable {

                System.out.println("Boohoo App is launched");
                Thread.sleep(2000);
            }
            @Then("^I select Location services option$")
            public void iSelectLocationServicesOption () throws Throwable {
                // Write code here that turns the phrase above into concrete actions
                //AppiumDriver driver = (new ServiceHooks()).initializeTest();
                driver.findElement(By.xpath("//android.widget.Button[@text = 'ALLOW']")).click();

            }

            @And("^Click on Hamburger Menu$")
            public void clickOnHamburgerMenu () throws Throwable {
                // Write code here that turns the phrase above into concrete actions
                TouchAction action = new TouchAction(driver);
                action.tap(77, 133).perform();
                driver.findElementByXPath("//android.widget.TextView[@text = 'Me']").click();

            }


            @Then("^Sign In with Existing Account$")
            public void signInWithExistingAccount () throws Throwable {
                // Write code here that turns the phrase above into concrete actions
                driver.findElementById("com.poqstudio.app.platform.boohoo:id/loginButton").click();
                driver.findElementById("com.poqstudio.app.platform.boohoo:id/loginEmail").sendKeys("appium@gmail.com");
                driver.findElementById("com.poqstudio.app.platform.boohoo:id/loginPass").sendKeys("Rewards123");
                driver.findElementById("com.poqstudio.app.platform.boohoo:id/loginAccountBtn").click();
                Thread.sleep(3000);

                System.out.println("Logged Into an account Successfully");

                String UserName = driver.findElementById("com.poqstudio.app.platform.boohoo:id/userName").getText();

                if (UserName == "appium appium") {
                    System.out.println("User has Successfully Logged into this account");
                } else
                    System.out.println("User failed to log in Successfully");
            }


        @When("^I click on Bell Icon$")
        public void iClickOnBellIcon() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(2000);
            driver.findElementById("com.poqstudio.app.platform.boohoo:id/notificationCountText").click();

            WebElement notif = driver.findElementByXPath("//android.widget.TextView[@text = 'Notifications']");

            if (notif.isDisplayed()){
                System.out.println("User has reached Notification Panel");
            }
            else
            {
                System.out.println("Notifications is not present");
            }

        }
        @And("^User is redirected to Notifications Screen$")
        public void userIsRedirectedToNotificationsScreen() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("User is redirected to Notifications page");

        }

        @Then("^Click on PN To Search$")
        public void clickOnPNToSearch() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementByXPath("//android.widget.TextView[@text = 'GBP PN TO SEARCH ']").click();
            Thread.sleep(3000);

            WebElement searchText = driver.findElementByXPath("//android.widget.TextView[@text = 'Your search result for \"red\"']");

            if (searchText.isDisplayed()) {
                System.out.println("User is redirected to Search Results page from PN");
            }
            else{
                System.out.println("User is not redirected to Search Results page");
            }
        }

        @And("^Click the Back button$")
        public void clickTheBackButton() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.navigate().back();
            driver.navigate().back();
        }


        @Then("^Navigate to Side Navigational Panel$")
        public void navigateToSideNavigationalPanel() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            TouchAction action = new TouchAction(driver);
            action.tap(77,133).perform();
            Thread.sleep(3000);
        }

        @And("^Move to Shop page$")
        public void moveToShopPage() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementByXPath("//android.widget.TextView[@text = 'Shop']").click();
            Thread.sleep(3000);
        }

        @Then("^Click on Men Category$")
        public void clickOnMenCategory() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(2000);
            driver.findElementByXPath("//android.widget.LinearLayout[@index = '3']").click();

        }

        @And("^Click on Search Icon$")
        public void clickOnSearchIcon() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.poqstudio.app.platform.boohoo:id/searchItem").click();
            System.out.println("User has Clicked Search Icon");
        }

        @And("^Enter Shirts as Search Text and Click Search Icon$")
        public void enterShirtsAsSearchTextAndClickSearchIcon() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.poqstudio.app.platform.boohoo:id/search_src_text").sendKeys("Shirts");
            TouchAction t = new TouchAction(driver);

            t.tap(996,1691).perform();
        }

        @Then("^Tap on Refine and select Men$")
        public void tapOnRefineAndSelectMen() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.poqstudio.app.platform.boohoo:id/refine").click();
            Thread.sleep(2000);
            driver.findElementByXPath("//android.widget.TextView[@text = 'GENDER']").click();
            MobileElement rom = (MobileElement) driver.findElementsById("com.poqstudio.app.platform.boohoo:id/checkBox").get(1);
            rom.click();
            driver.findElementByXPath("//android.widget.Button[@text = 'APPLY']").click();
            Thread.sleep(3000);
        }

        @And("^Click on (\\d+) Pack T Shirts$")
        public void clickOnPackTShirts(int arg0) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"3 Pack T Shirts\")")).click();
            
        }

    }