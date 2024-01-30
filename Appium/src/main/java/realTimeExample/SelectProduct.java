package realTimeExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SelectProduct extends BaseProject {
	@Test
	public void selectPro() throws InterruptedException {
		// select country
				driver.findElement(By.id("android:id/text1")).click();
				// scroll to india
				//driver.findElement(AppiumBy.androidUIAutomator("new UIScrollable(new UISelector()).ScrollIntoView(text(\"India\"));"));
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"));"));
				// clcik india
				driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Algeria']")).click();
				// enter some value
				driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("ABCDF");
				// hidekey
				driver.hideKeyboard();
				// select gender
				driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
				// clcik let shop
				driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				
		// scroll upto Jorddon lift off
		//driver.findElement(AppiumBy.androidUIAutomator("new UIScrollable(new UISelector()).ScrollIntoView(text(\"Jordon lift off\"));"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		
//		int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//		for(int i=0;i<productCount;i++) {
//			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//			if(text.equalsIgnoreCase("Jordan 6 Rings")) {
//				driver.findElements(By.xpath("com.androidsample.generalstore:id/productAddCart")).get(i).click();
//			}
//		}
//		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
		int product = ele.size();
		for(int i=0;i<product;i++) {
			//String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			String text = ele.get(i).getText();
			if(text.equalsIgnoreCase("Jordan 6 Rings")) {
				driver.findElements(By.xpath("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		
	}

}
