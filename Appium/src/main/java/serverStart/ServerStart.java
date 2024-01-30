package serverStart;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ServerStart {
	public AppiumDriverLocalService ser;
	public  AndroidDriver driver;
	@BeforeClass
	public void startServer() throws MalformedURLException {
		// start the server automatically
		 ser = new AppiumServiceBuilder().withAppiumJS(new File("\\Users\\dinesh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		ser.start();
		// set desiredcapabilities
		UiAutomator2Options opt = new UiAutomator2Options();
		opt.setDeviceName("Sathish");
		opt.setApp("\\Users\\dinesh\\eclipse-workspace\\Appium\\src\\main\\java\\resource\\ApiDemos-debug.apk");
		
		// Launch Android 
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void longPressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",2000));
	}
	@AfterClass
	public void teaeDown() {
		driver.quit();
		ser.stop();
	}

}
