package learnPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateAndButtonLearn {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		// goto home page and the navigate back
		String a = driver.getCurrentUrl();
		System.out.println(a);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		String b = driver.getCurrentUrl();	
		System.out.println(b);
		// navigate back
		driver.navigate().back();
		String c = driver.getCurrentUrl();
		System.out.println(c);
		// x-y coordinate
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);
		// color
		String color = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println("the color value gives rgba like " + color);
		// height and width of the button
		Rectangle rect = driver.findElement(By.xpath("//button[@id='property']")).getRect();
		Dimension dimension = rect.getDimension();
		int height = dimension.getHeight();
		System.out.println(height);
		int width = dimension.getWidth();
		System.out.println(width);
		
		// click and holdable
		//button[@id='isDisabled'])[2]
		Thread.sleep(2000);
				WebElement ele = driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]"));
				new Actions(driver).clickAndHold(ele).perform();
		
	}
	
	

}
