package framework.appium_khan;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

	public class Demo extends Capability 
	{
		
		AndroidDriver<AndroidElement> driver;
		
		@BeforeTest
		public void bt() throws IOException, InterruptedException
		{
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Thread.sleep(5000);
			//driver = capabilities(appPackage, appActivity, deviceName, platformName, chromeExecutable);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	}
	

			
	
		@Test
		public void testcase1() throws InterruptedException, IOException 
		{
			service = startServer();
			driver = capabilities(appPackage, appActivity, deviceName, platformName, chromeExecutable);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			
	    	   //Click on first dismiss
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
			
			
				//click on settings button
				WebElement	 b1 = driver.findElements(By.className("android.widget.ImageView")).get(0);
				b1.click();
				
				
				//Click on language
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Language & region\")")).click();
				
				//  select english default
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"English (default)\")")).click();
				
				
				//go back
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				
				//click on sound effects
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OFF\")")).click();
				
				Thread.sleep(2000);
				
				//clicking on terms and service
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Terms of service\")")).click();
				
				//clicking on google - only once
				driver.findElement(By.id("android:id/button_once")).click();
				
			
				//switching from native to web		
				Set<String> contextNames = driver.getContextHandles();
				for (String contextName : contextNames)
				{
				    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_
			    }	
				//this is used to switch between native app and web app in hybrid app
			    driver.context("WEBVIEW_chrome");
			    System.out.println("done");
			    Thread.sleep(3000);
			    
			    //click on search button
			    driver.findElement(By.xpath("//*[@id=\"app-shell-root\"]/div/div[1]/nav/div/div[3]/div[1]/a/div")).click();
			    
			    Thread.sleep(3000);
			    
			    //click on search option box
			    driver.findElement(By.xpath("//*[@id=\"mobile-search-form-container\"]/form/div/input[2]")).click();
			    
			    Thread.sleep(3000);
			    
			    //enter school use in 
			    driver.findElement(By.xpath("//*[@id=\"mobile-search-form-container\"]/form/div/input[2]")).sendKeys("Talks and Interviews");
			   
			    //press enter
			    driver.findElement(By.xpath("//*[@id=\"mobile-search-form-container\"]/form/div/input[2]")).sendKeys(Keys.ENTER);
			    
			    Thread.sleep(7000);
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    Thread.sleep(2000);
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    Thread.sleep(2000);
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    driver.context("NATIVE_APP");
			    
			    Thread.sleep(3000);
				
				//Click on Sign in
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
				
				Thread.sleep(3000);
				
				//click on sign up with email
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign up with email\")")).click();
				
				Thread.sleep(2000);
				
				driver.hideKeyboard();
				
				//enter firstname
				driver.findElementByAccessibilityId("First name").sendKeys("king");
				
				//enter last name
				driver.findElementByAccessibilityId("Last name").sendKeys("kong");
				
				//click on brithday
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Birthday\")")).click();
				
				//pikcing date from date picker
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward().scrollTextIntoView(\"Dec\")").click();
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollForward().scrollTextIntoView(\"05\")").click();
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(2)).scrollBackward().scrollTextIntoView(\"1995\")").click();
		
				
				//click on OK
				driver.findElement(By.id("android:id/button1")).click();
				
			   //enter email address
				driver.findElementByAccessibilityId("Email address").sendKeys("kingspr76524@gmail.com");
				
				//enter password
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Password\")")).sendKeys("Universal123");
				
				//click on Create
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"CREATE\")")).click();

				Thread.sleep(2000);
				
				 //Click on dismiss on COVID 19
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
				
				
	            Thread.sleep(3000);
				
				//scroll down till GET STARTED
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Get started\").instance(0))").click();
				
				Thread.sleep(3000);
				
				//select any class
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Grade 2 / Year 2\")")).click();
				
				Thread.sleep(3000);
				
				//scroll down till computer programming and click
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Computer programming\").instance(0))").click();
				
				Thread.sleep(3000);
				
				//click on done
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Done\")")).click();
				
				Thread.sleep(3000);
				
				//settings for logout
				//click on settings button
				WebElement	 b2 = driver.findElements(By.className("android.widget.ImageView")).get(0);
				b2.click();
				//click on sign out
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign out\")")).click();
				//click on SIGN OUT on next signout pop
				driver.findElement(By.id("android:id/button1")).click();
			  
		
		        service.stop();
	  } 
	}
	
