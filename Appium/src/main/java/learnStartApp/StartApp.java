package learnStartApp;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import serverStart.ServerStart;

public class StartApp extends ServerStart{
	@Test
	public void app() {
		// peference 
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		// click checkbox
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		//
		//driver.findElement(AppiumBy.className("android.widget.RelativeLayout")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String text = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		System.out.println(text);
		assertEquals(text, "WiFi settings");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Sathish");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
	}

}
