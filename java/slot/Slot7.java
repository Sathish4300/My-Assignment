package slot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Slot7 {
	@Test
	public  void dur17() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://admin.agriexpo.live/#/");
		 driver.findElement(By.id("Firstname")).sendKeys("9965740303");
		 //9965740303
		 driver.findElement(By.id("Lastname")).sendKeys("1108624");
		 //1108624
		 driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		 // click slot seperation
		 driver.findElement(By.xpath("//a[text()='Slot Separation ']")).click();
		 // click create slot
		 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
		 // select date
		 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("03-11-2023");
		 // select duration
		 WebElement ele = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
		 org.openqa.selenium.support.ui.Select selectDate = new org.openqa.selenium.support.ui.Select(ele);
		 selectDate.selectByVisibleText("30");
		 // select slot type
		 WebElement sl = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
		 org.openqa.selenium.support.ui.Select selectSlot = new org.openqa.selenium.support.ui.Select(sl);
		 selectSlot.selectByVisibleText("Normal");
		 // choose time
		 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("12:00");
		 // submit
		 driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
}
