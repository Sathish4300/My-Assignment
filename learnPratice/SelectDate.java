package learnPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDate {
	public void date() {
		ChromeDriver ele = new ChromeDriver();
		ele.findElement(By.xpath("\"//*[@id=\\\"plan\\\"]/div/div/div[2]/div/div[1]/input\"")).sendKeys("31-10-2023");
	}
}
