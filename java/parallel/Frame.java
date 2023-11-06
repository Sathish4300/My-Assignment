package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
	@Test
	public  void fr() {
		
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.name("fname")).sendKeys("sbfb");
		driver.findElement(By.name("lname")).sendKeys("bgdf");
		WebElement ele2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(ele2);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bdg gefw");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		driver.quit();

	}

}
