package learnPratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPractice {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		// page screenshot
		File sc = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./image/img.png");
		FileHandler.copy(sc, des);
		
		// element sc
		WebElement ele = driver.findElement(By.xpath("//button[text()='What is my color?']"));
		File elesc = ele.getScreenshotAs(OutputType.FILE);
		File eledes = new File("./image/img1.png");
		FileHandler.copy(elesc, eledes);
		
		// section
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='content']"));
		File sec = ele1.getScreenshotAs(OutputType.FILE);
		File secDes = new File("./image/img2.png");
		FileHandler.copy(sec, secDes);
	}

}
