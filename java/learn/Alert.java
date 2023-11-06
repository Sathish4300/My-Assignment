package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	@Test
	public  void LearnAlert() {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		//driver.manage().window().maximize();
		// simple alert
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		driver.switchTo().alert().accept();
		// confirm alert
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		driver.switchTo().alert().dismiss();
		// prompt alert
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("Sathish");
		alert.accept();
		String text2 = driver.findElement(By.id("myName")).getText();
		System.out.println(text2);
		// sweet alert
		driver.findElement(By.xpath("//button[@id='modern']")).click();
		driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();
}		
}