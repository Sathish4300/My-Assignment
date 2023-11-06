package parameterrrrr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnPara {
	@Parameters({"userID","password"})
	@Test
	public  void para(String userName,String pass) {
		ChromeDriver driver = new ChromeDriver();
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
