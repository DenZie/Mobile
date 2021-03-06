package com.dd.qe.mobile;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiumChromeTest {
	
  @Test
  public void f() {
	  DesiredCapabilities desiredCapabilities = DesiredCapabilities.android();
	  desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
	  desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	  
//	  desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"11.0");
//	   mCurrentFocus=Window{75041a1 u0 /}
	  
//	  desiredCapabilities.setCapability( "deviceName","ce43d662");
//	  desiredCapabilities.setCapability("platformName","android");
	  desiredCapabilities.setCapability("browserName", "Chrome");
	  
//	  desiredCapabilities.setCapability("appPackage","com.android.chrome");
//	  desiredCapabilities.setCapability("appActivity","org.chromium.chrome.browser.firstrun.FirstRunActivity");
//	  desiredCapabilities.setCapability("noReset",true);
	  WebDriver driver;
	try {
//		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
//		
//		MobileElement el2 = (MobileElement) driver.findElementById("com.android.contacts:id/add_account_button");
//		el2.click();
//		driver.navigate().back();
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("Appium" + Keys.ENTER);
		assertTrue(driver.getTitle().contains("Appium"));
		driver.quit();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }
}
