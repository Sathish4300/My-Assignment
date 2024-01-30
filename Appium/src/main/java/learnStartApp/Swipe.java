package learnStartApp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import serverStart.ServerStart;

public class Swipe extends ServerStart {
	@Test
	public void swipeGesture() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
		// check the ist image is true
		WebElement el = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));
		assertEquals(driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		// swipe
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)el).getId(),"direction","left","percent",0.75));
		assertEquals(driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");

	}

}
