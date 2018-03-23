package steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.hook;
import org.openqa.selenium.By;

public class Ans {
    public AndroidDriver driver;
    public Ans() {
        this.driver = hook.getDriver();
    }
        @When("^I launch Boohoo App$")
        public void iLaunchBoohooApp () throws Throwable {
            System.out.println("We have launched Boohoo app");

        }
        @When("^I Click Allow$")
        public void iClickAllow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            driver.findElement(By.xpath("//android.widget.Button[@text = 'ALLOW']")).click();
    }
}