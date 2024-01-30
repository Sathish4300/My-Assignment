package realTimeExample;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseProject {
	public AppiumDriverLocalService ser;
	public AndroidDriver driver;
	@BeforeClass
	public void startServer() throws MalformedURLException {
		 ser = new AppiumServiceBuilder().withAppiumJS(new File("\\Users\\dinesh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		ser.start();
		
		// desired capabilities 
		UiAutomator2Options opt = new UiAutomator2Options();
		opt.setDeviceName("Sathish");
		opt.setApp("\\Users\\dinesh\\eclipse-workspace\\Appium\\src\\main\\java\\resource\\General-Store.apk");
		
		// launch driver
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), opt);
		 //driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), opt);
		 driver = new AndroidDriver(ser, opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterClass
	public void tearDown() {
		ser.stop();
		driver.quit();
		
	}
}
