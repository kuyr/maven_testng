package tests;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.VERSION, "6.0.1");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Kuye(Galaxy S5)");
			caps.setCapability(MobileCapabilityType.UDID, "4d005fd84fef3181");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			caps.setCapability("noReset",true);
			caps.setCapability("appPackage", "org.seadvocacy.docsrchout");
			caps.setCapability("appActivity", "org.seadvocacy.docsrchout.activities.Splash");
			//caps.setCapability(MobileCapabilityType.APP,"./src/test/resources/apps/app-debug.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(url, caps);
//			driver = new AndroidDriver<MobileElement>(url, caps);
//			driver = new IOSDriver<MobileElement>(url,caps);

		}catch(Exception exp) {
			System.out.println("The reason for the error is: "+exp.getCause());
			System.out.println("The message is: "+exp.getMessage());
			exp.printStackTrace();
		}
		
		MobileElement el1 = (MobileElement) driver.findElementById("android:id/content");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/patientBtn");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/username");
	    el3.clear();
	    el3.sendKeys("testa@test.com");
	    driver.hideKeyboard();
	    MobileElement el4 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/password");
	    el4.sendKeys("password");
	    driver.hideKeyboard();	   
	    MobileElement el5 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/login");
	    el5.click();
		
		
		
	}
	
	
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}
}
