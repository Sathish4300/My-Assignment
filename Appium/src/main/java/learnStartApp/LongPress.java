package learnStartApp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import serverStart.ServerStart;

public class LongPress extends ServerStart{
	@Test
	public void press() {
		// click views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		// click expandable
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		// click custom adapter
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
		// long press action
		WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		longPressAction(ele);
		// check the text is present
		assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
	}

}
