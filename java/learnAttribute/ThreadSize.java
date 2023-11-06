package learnAttribute;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadSize {
	@Test(invocationCount = 3,threadPoolSize = 3)
	public  void PoolSize() {
		ChromeDriver driver = new ChromeDriver();
		//Shadow shadow = new Shadow(driver);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("APjFqb")).sendKeys("cricket",Keys.ENTER);
		List<WebElement> ele = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		for (WebElement webElement : ele) {
			String text = webElement.getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
