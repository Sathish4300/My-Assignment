package agricultureExpo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Onion {
	@Test
	public  void runOnion1() throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://exhibitor.agriexpo.live/login");
		// enter the mobile num
		driver.findElement(By.xpath("//*[@id=\"mobile-number\"]")).sendKeys("8778021306");
		// enter the password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		// click login
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		// click mypost
		driver.findElement(By.xpath("//a[@class='btn single-menu']")).click();
		//driver.findElement(By.xpath("//*[@id=\"accordion\"]/a[2]/span")).click();
		// click add stream
		driver.findElement(By.xpath("//button[@class='blue-btn add-button']")).click();
		// select Category
		WebElement category = driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[1]/select"));
		Select selectCategory = new Select(category);
		selectCategory.selectByVisibleText("Vegetable");
		//select product
		WebElement product = driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[3]/select"));
		Select selectProduct = new Select(product);
		selectProduct.selectByVisibleText("Onion");
		// enter quantity
		driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-invalid']")).sendKeys("1000");
		// enter location
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[7]/input")).sendKeys("Chennai");
		//enter description
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[9]/textarea")).sendKeys("Online grocery sales");
		// enter market price
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[11]/div/input")).sendKeys("25");
		// enter offer price
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[13]/div/input")).sendKeys("18");
		// booking amount
		driver.findElement(By.xpath("//*[@id=\"bookingAmount\"]")).click();
		// after live streaming
		driver.findElement(By.xpath("//*[@id=\"afterStreaming\"]")).click();
		// after live streaming price
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[19]/div/input")).sendKeys("20");
		// minimal lot
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[21]/div/input")).sendKeys("30");
		// incremental lot
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[23]/div/input")).sendKeys("20");
		// upload photos
		//Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//label[text()='Choose File']"));
		ele1.click();
		Thread.sleep(3000);
		String file = "C:\\Users\\dinesh\\Downloads\\onions-g746b846d2_1920.jpg";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("//div[@class='choose-file']")).sendKeys("onions-g746b846d2_1920",Keys.ENTER);
		// upload video
		driver.findElement(By.xpath("(//label[text()='Choose File'])[2]")).click();
		Thread.sleep(3000);
		String file1 = "C:\\Users\\dinesh\\Downloads\\Onion videos.mp4";
		StringSelection selection1 = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyPress(KeyEvent.VK_ENTER);
		// post
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Post']")).click();
		
		
	}

}
