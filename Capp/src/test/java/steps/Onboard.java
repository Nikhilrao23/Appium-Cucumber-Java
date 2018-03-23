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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;

    public class Onboard {

        AndroidDriver driver;

        public Onboard() throws Throwable {
            driver = (new ServiceHooks()).initializeTest();
        }


        // private AppiumDriver driver;
        @When("^I launch Core App$")
        public void iLaunchCoreApp() throws Throwable {

            System.out.println("Core App is launched");
            Thread.sleep(2000);
        }

        @Then("^I select Location services option$")
        public void iSelectLocationServicesOption() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            //AppiumDriver driver = (new ServiceHooks()).initializeTest();
            driver.findElement(By.xpath("//android.widget.Button[@text = 'ALLOW']")).click();

        }

        @And("^Click on Hamburger Menu$")
        public void clickOnHamburgerMenu() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            TouchAction action = new TouchAction(driver);
            action.tap(77, 133).perform();
            System.out.println("Hamburger Option is present");
            String home = driver.findElementByClassName("android.widget.TextView").getText();
            Assert.assertEquals(home, "Home");
            System.out.println("Home on Side Nav is present");


            driver.findElementByXPath("//android.widget.TextView[@text = 'ACCOUNT']").click();

        }


        @Then("^Sign In with Existing Account$")
        public void signInWithExistingAccount() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.gpshopper.clientcoreapp:id/login_button").click();
            driver.findElementById("com.gpshopper.clientcoreapp:id/loginEmail").sendKeys("gin@gmail.com");
            driver.findElementById("com.gpshopper.clientcoreapp:id/loginPass").sendKeys("Rewards123");
            driver.findElementById("com.gpshopper.clientcoreapp:id/loginAccountBtn").click();
            Thread.sleep(3000);

            System.out.println("Logged Into an account Successfully");

            String UserName = driver.findElementById("com.gpshopper.clientcoreapp:id/user_name").getText();

            if (UserName == "Gin Bin") {
                System.out.println("Correct User Name is displayed on Account Screen");
            } else
                System.out.println("User failed to log in Successfully");
        }


        @When("^I click on Bell Icon$")
        public void iClickOnBellIcon() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(2000);
            driver.findElementById("com.gpshopper.clientcoreapp:id/inboxMenuIcon").click();

            WebElement notif = driver.findElementByXPath("//android.widget.TextView[@text = 'Inbox']");

            if (notif.isDisplayed()) {
                System.out.println("User has reached Notification Panel");
            } else {
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
            //driver.findElementByXPath("//android.widget.TextView[@text = 'PN to Core App']").click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PN to Core App\"))").click();
            Thread.sleep(4000);
            //driver.findElementById("com.gpshopper.clientcoreapp:id/inboxItemTitle[2]").click();
          /*
            WebElement searchText = driver.findElementByXPath("//android.widget.Image[@text = 'Google']");

            if (searchText.isDisplayed()) {
                System.out.println("User is redirected to Search Results page from PN");
            } else {
                System.out.println("User is not redirected to Search Results page");
            }
            */

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
            action.tap(77, 133).perform();
            Thread.sleep(3000);
        }

        @And("^Move to Shop page$")
        public void moveToShopPage() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementByXPath("//android.widget.TextView[@text = 'SHOP']").click();
            Thread.sleep(3000);
        }

        @Then("^Click on Men Category$")
        public void clickOnMenCategory() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(2000);
            driver.findElementByXPath("//android.widget.ImageView[@index = '3']").click();

        }

        @And("^Click on Search Icon$")
        public void clickOnSearchIcon() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.gpshopper.clientcoreapp:id/searchItem").click();
            System.out.println("User has Clicked Search Icon");
        }

        @And("^Enter Shoe as Search Text and Click Search Icon$")
        public void enterShirtsAsSearchTextAndClickSearchIcon() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.gpshopper.clientcoreapp:id/search_src_text").sendKeys("Shirts");
            TouchAction t = new TouchAction(driver);

            t.tap(996, 1691).perform();
            Thread.sleep(3000);
        }

        @Then("^Tap on Refine and select Men$")
        public void tapOnRefineAndSelectMen() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.gpshopper.clientcoreapp:id/filterButton").click();
            Thread.sleep(2000);
            driver.findElementByXPath("//android.widget.TextView[@text = 'PRICE']").click();

            MobileElement rom = (MobileElement) driver.findElementsById("com.gpshopper.clientcoreapp:id/radio").get(1);
            rom.click();
            driver.findElementByXPath("//android.widget.TextView[@text = 'APPLY']").click();
            Thread.sleep(3000);
            System.out.println("User has put in a Refine Criteria");
        }

        @And("^Click on (\\d+) Pack T Shirts$")
        public void clickOnPackTShirts(int arg0) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"3 Pack T Shirts\")"));
            WebElement PDP = (WebElement) driver.findElementsById("com.gpshopper.clientcoreapp:id/productImage").get(0);
            PDP.click();
            System.out.println("User has entered PDP");
            Thread.sleep(2000);


        }

        @And("^Select Color and Size$")
        public void selectColorAndSize() throws Throwable {
            // Write code here that turns the phrase above into concrete actions

            driver.findElementById("com.gpshopper.clientcoreapp:id/product_detail_size_cta").click();
            //driver.findElementByXPath("//android.widget.TextView[@text = '17']").click();
            driver.navigate().back();
            driver.navigate().back();
            }

        @When("^Tapping on Clothing Category$")
        public void tappingOnClothingCategory() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementByXPath("//android.widget.TextView[@text = 'CLOTHING']").click();
            driver.findElementByXPath("//android.widget.TextView[@text = 'Pants']").click();
            WebElement Pant = (WebElement) driver.findElementsById("com.gpshopper.clientcoreapp:id/productImage").get(0);
            Pant.click();
            Thread.sleep(2000);

        }

        @And("^Select Size and Add to bag$")
        public void selectSizeAndAddToBag() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            //driver.findElementById("com.gpshopper.clientcoreapp:id/product_detail_size_cta").click();
            //WebElement SizeClick = (WebElement) driver.findElementsByXPath("//android.widget.LinearLayout[@index = '1']").get(2);
            //SizeClick.click();

            int xcor;
            xcor =  driver.findElementById("com.gpshopper.clientcoreapp:id/product_detail_size_cta").getLocation().getX();

            System.out.println(xcor);

            int ycor;
            ycor = driver.findElementById("com.gpshopper.clientcoreapp:id/product_detail_size_cta").getLocation().getY();

            System.out.println(ycor);
            Thread.sleep(2000);
            TouchAction siz = new TouchAction(driver);
            siz.tap(217,1647).perform();
            driver.findElementByXPath("//android.widget.TextView[@text = '30']").click();
            driver.findElementById("com.gpshopper.clientcoreapp:id/product_detail_add_to_bag_cta").click();
            Thread.sleep(4000);

        }

        @Then("^Open Cart from Top Right Corner$")
        public void openCartFromTopRightCorner() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            driver.findElementById("com.gpshopper.clientcoreapp:id/bagMenuIcon").click();



        }
    }