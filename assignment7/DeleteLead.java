package selenium.assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// launch the website
		driver.get("http://leaftaps.com/opentaps/control/main");
		// max the window size
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// username field box
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// password field box
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// login functionality
		driver.findElement(By.className("decorativeSubmit")).click();
		// click the crmsfa hyper link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click the lead link
		driver.findElement(By.linkText("Leads")).click();
		// click the find lead 
		driver.findElement(By.linkText("Find Leads")).click();
		// click the ph no
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		// enter the phone number
		driver.findElement(By.xpath("//*[@id=\'ext-gen270\']")).sendKeys("8610490396");
		// click the find lead
		driver.findElement(By.xpath("//*[@id=\'ext-gen334\']")).click();
		// capture the id
		String txt = driver.findElement(By.xpath("//a[text()='ABC']")).getText();
		System.out.println(txt);
		//click the first resulting lead
		driver.findElement(By.xpath("//a[text()='ABC']")).click();
		// delete the lead
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		// click find lead
		driver.findElement(By.linkText("Find Leads")).click();
		//enter the id
		driver.findElement(By.xpath("//*[@id=\'ext-gen246\']")).sendKeys("10963");
		// click the find lead
		driver.findElement(By.xpath("//*[@id=\'ext-gen334\']")).click();
		String txt2 = driver.findElement(By.linkText("No records to display")).getText();
		System.out.println(txt2);
		
		
	}

}
