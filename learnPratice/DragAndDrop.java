package learnPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement tar = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(src, tar).perform();

	}

}
