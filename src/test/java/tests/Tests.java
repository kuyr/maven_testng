package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver.Navigation;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass{
	
	
	@Test
	public void onDemand(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Services");
	    el6.click();
	    MobileElement el7 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/continueBtn");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/filterTxt");
	    el8.sendKeys("Emmanuel");
	    driver.hideKeyboard();
	    MobileElement el9 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/docImage");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/reason");
	    el10.sendKeys("automated_test");
	    driver.hideKeyboard();
	    MobileElement el11 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/book");
	    el11.click();
	    MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[9]");
	    el12.click();
	    MobileElement el13 = (MobileElement) driver.findElementById("android:id/button1");
	    el13.click();
	    MobileElement el14 = (MobileElement) driver.findElementById("org.seadvocacy.docsrchout:id/status");
	    
	    assertTrue(el14.isDisplayed());
	  
	    System.out.println("Completed 1st test...");
				
	}
	
	//((Navigation) driver).back();
	

}
