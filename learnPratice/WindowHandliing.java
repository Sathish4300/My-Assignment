package learnPratice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandliing {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Click on the home button
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		// Goto the newly opened tab
		Set<String> han = driver.getWindowHandles();
		List<String> ele = new ArrayList<String>(han);
		driver.switchTo().window(ele.get(1));
		// Print the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		// Close the parent window
		driver.switchTo().window(ele.get(0));
		driver.close();
		
	}

}
