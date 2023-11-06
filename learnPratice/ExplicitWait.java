package learnPratice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/waits");
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		//driver.switchTo().alert().accept();
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until()
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(until.getText());
		until.accept();
	}
}
