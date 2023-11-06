package learnPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputLearn {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("https://letcode.in/test");
		// max the browser
		driver.manage().window().maximize();
		// implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// click edit 
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// enter the name
		driver.findElement(By.id("fullName")).sendKeys("sathish");
		// append the text and press keyboard tab
		driver.findElement(By.xpath("//input[@id='join']")).sendKeys("and bad person",Keys.TAB);
		// what is inside the box
		String name = driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
		System.out.println(name);
		// clear the text
		driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
		// field is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
		System.out.println(enabled);
		// read only
		String a = driver.findElement(By.xpath("//input[@id='dontwrite']")).getAttribute("readonly");
		System.out.println(a);
		driver.quit();
	}

}
