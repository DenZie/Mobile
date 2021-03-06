package com.dd.qe.mobile;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NewTest {
	
//  @Test
//  public void f() {
//	  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//	  desiredCapabilities.setCapability( "deviceName","emulator-5554");
////	  desiredCapabilities.setCapability( "deviceName","ce43d662");
//	  desiredCapabilities.setCapability("platformName","android");
//	  desiredCapabilities.setCapability("appPackage"," com.android.contacts");
//	  desiredCapabilities.setCapability("appActivity",".activities.PeopleActivity");
//	  desiredCapabilities.setCapability("noReset",true);
//	  AndroidDriver<WebElement> driver;
//	try {
//		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
////		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		MobileElement el2 = (MobileElement) driver.findElementById("com.android.contacts:id/add_account_button");
//		el2.click();
//		driver.navigate().back();
//		System.out.println();
//	} catch (MalformedURLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
//	@Test
	 public void calculator() {
		  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		  desiredCapabilities.setCapability( "deviceName","emulator-5554");
		  desiredCapabilities.setCapability("platformName","android");
		  desiredCapabilities.setCapability("appPackage","com.android.calculator2");
		  desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
		  desiredCapabilities.setCapability("noReset",true);
		  AndroidDriver<WebElement> driver;
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
//			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			MobileElement el2 = (MobileElement) driver.findElementById("com.android.contacts:id/add_account_button");
//			el2.click();
//			driver.navigate().back();
			
			MobileElement elFive = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
			elFive.click();
			MobileElement elPlus = (MobileElement) driver.findElementByAccessibilityId("plus");
			elPlus.click();
			MobileElement elFour = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
			elFour.click();
			MobileElement elEquals = (MobileElement) driver.findElementByAccessibilityId("equals");
			elEquals.click();
			MobileElement elResult = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
			assertEquals(elResult.getText(), "9");
			driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
	
	
	@Test
	 public void calculatorRemote() {
		  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		  desiredCapabilities.setCapability( "deviceName","emulator-5554");
		  desiredCapabilities.setCapability("platformName","android");
		  desiredCapabilities.setCapability("appPackage","com.android.calculator2");
		  desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
		  desiredCapabilities.setCapability("noReset",true);
		  WebDriver driver;
		try {
//			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
			driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
//			MobileElement el2 = (MobileElement) driver.findElementById("com.android.contacts:id/add_account_button");
//			el2.click();
//			driver.navigate().back();
				WebElement el = driver.findElement(By.id("digit_2"));
//			driver.findElement(By.name("5"));
			el.click();
//			MobileElement elFive = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
//			elFive.click();
//			MobileElement elPlus = (MobileElement) driver.findElementByAccessibilityId("plus");
//			elPlus.click();
//			MobileElement elFour = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
//			elFour.click();
//			MobileElement elEquals = (MobileElement) driver.findElementByAccessibilityId("equals");
//			elEquals.click();
//			MobileElement elResult = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
//			assertEquals(elResult.getText(), "9");
			driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
}
