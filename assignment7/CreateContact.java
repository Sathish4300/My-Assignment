package selenium.assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// launch the website
		driver.get("http://leaftaps.com/opentaps/control/main");
		// max the window size
		driver.manage().window().maximize();
		// username field box
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// password field box
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// login functionality
		driver.findElement(By.className("decorativeSubmit")).click();
		// click the crmsfa hyper link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click the create contact
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		// enter the first name field box
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("ABC");
		// enter the last name field box
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("D");
		// enter the first name local field box
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("TCS");
		// enter the second name local field box
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
		// enter the department field box
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		// enter the description field box
		driver.findElement(By.id("createContactForm_description")).sendKeys("Nothing....");
		// enter the mailid in field box
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("tcs@gmail.com");
		// select  the state field box
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selectState = new Select(state);
		selectState.selectByVisibleText("New York");
		// click  the create contact
		driver.findElement(By.className("smallSubmit")).click();
		// click the edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// clear the description
		driver.findElement(By.id("updateContactForm_description")).clear();
		// fill the important notes
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("There is no important points are there");
		// click the update button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		// get the title resulting page
		System.out.println("The title is " + driver.getTitle());		
	}

}
