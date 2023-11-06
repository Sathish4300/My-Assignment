package learnPratice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Click on the Muiltiple windows button
		driver.findElement(By.xpath("//button[text()='Muiltiple windows']")).click();
		// Print all the window title
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> han = new ArrayList<String>(windowHandles);
		for(int i=0;i<=han.size();i++) {
			String a = han.get(i);
			System.out.println(a);
		}
	
	}

}
