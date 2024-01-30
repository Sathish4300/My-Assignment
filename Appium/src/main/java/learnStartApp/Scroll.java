package learnStartApp;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import serverStart.ServerStart;

public class Scroll extends ServerStart{
	@Test
	public void scrollGestures() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		// scroll
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView2\"));"));
	}

}
