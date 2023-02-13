
package selenium.assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// launch the website
		driver.get("http://leaftaps.com/opentaps/control/main");
		// max the window size
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
		// click the email
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		// enter the email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("google");
		// find lead
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		// capture name of the first resulting lead
		String txt1 = driver.findElement(By.xpath("//a[text()='ABC']")).getText();
		System.out.println(txt1);
		// click the finding search
		driver.findElement(By.xpath("//a[text()='ABC']")).click();
		// click the duplicate lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		// verify the title 
		System.out.println("Title name is " + driver.getTitle());
		//click the create lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		// txt2
		String txt2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			System.out.println(txt2);
		// verify
			if(txt1.equals(txt2)) {
				System.out.println("It's Same");
			}
		
		
	}

	

}
