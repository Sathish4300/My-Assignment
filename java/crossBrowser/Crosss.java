package crossBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crosss {
	RemoteWebDriver driver;
	@Parameters({"userID","password","browser"})
	@Test
	
	public  void para(String userName,String pass,String browser) {
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "fire":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		
		}
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://admin.agriexpo.live/#/");
		 driver.findElement(By.id("Firstname")).sendKeys(userName);
		 //9965740303
		 driver.findElement(By.id("Lastname")).sendKeys(pass);
		 //1108624
		 driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		 // click slot seperation
		 driver.findElement(By.xpath("//a[text()='Slot Separation ']")).click();
		 
		 driver.quit();
	}

}
