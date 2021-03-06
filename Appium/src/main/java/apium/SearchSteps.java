package apium;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchSteps {

	WebDriver driver;
	DesiredCapabilities desiredCapabilities;
	@Given("Open {string} on {string} and open google.com")
	public void open_on_and_open_google_com(String browser, String platform) {
		setupDriver(browser, platform);
		
	}

	@Then("Search for {string} and verify the title {string}")
	public void search_for_and_verify_the_title(String string, String string2) {
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("Appium" + Keys.ENTER);
		assertTrue(driver.getTitle().contains("Appium"));
		driver.quit();
	}
	
	public void setupDriver(String browser, String platform) {
		switch (platform) {
			case "Android":
				desiredCapabilities = DesiredCapabilities.android();
				desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
				desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
				desiredCapabilities.setCapability("browserName", browser);
				try {
					driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				break;
			case "Windows":
			try {
				desiredCapabilities = new DesiredCapabilities();
//				desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
				desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
				driver = new RemoteWebDriver(new URL("http://localhost:4443/wd/hub"), desiredCapabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			default:
			break;
		}
	}
}
