package realTimeExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class HomePagePostiveCase extends BaseProject {
	@Test
	public void homePage() {
	
		// select country
		driver.findElement(By.id("android:id/text1")).click();
		// scroll to india
		//driver.findElement(AppiumBy.androidUIAutomator("new UIScrollable(new UISelector()).ScrollIntoView(text(\"India\"));"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		// clcik india
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='India']")).click();
		// enter some value
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("ABCDF");
		// hidekey
		driver.hideKeyboard();
		// select gender
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
		// clcik let shop
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
	}

}
