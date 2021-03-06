package apium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestSteps {
	AndroidDriver<WebElement> driver;
	@Given("Calculator is opened on the emulator {string}")
	public void calculator_is_opened_on_the_emulator(String device) {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability( "deviceName",device);
		desiredCapabilities.setCapability("platformName","android");
		desiredCapabilities.setCapability("appPackage","com.android.calculator2");
		desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
		desiredCapabilities.setCapability("noReset",true);
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	@Then("add {string} and {string}")
	public void add_and(String number1, String number2) {
		MobileElement elFirst = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_"+number1);
		elFirst.click();
		MobileElement elPlus = (MobileElement) driver.findElementByAccessibilityId("plus");
		elPlus.click();
		MobileElement elSecond = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_"+number2);
		elSecond.click();
		MobileElement elEquals = (MobileElement) driver.findElementByAccessibilityId("equals");
		elEquals.click();
	}
	
	@Then("result should be {string}")
	public void result_should_be(String result) {
		MobileElement elResult = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
		assertEquals(elResult.getText(), result);
	}

}
