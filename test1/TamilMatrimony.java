package test.test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// launch the site
		driver.get("https://www.tamilmatrimony.in/");
		// max the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// select the matrimony
		WebElement element = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select selectProfile = new Select(element);
		selectProfile.selectByVisibleText("Myself");
		// enter name
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Sathish");
		// select gender
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		// select date
		WebElement findElement = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select selectDate = new Select(findElement);
		selectDate.selectByVisibleText("4");
		// select month
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select selectMonth = new Select(findElement2);
		selectMonth.selectByVisibleText("Jan");
		// select year
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select selectYear =  new Select(findElement3);
		selectYear.selectByVisibleText("2000");
		// select your religion
		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select selectReligion = new Select(findElement4);
		selectReligion.selectByVisibleText("Hindu");
		// select your mother tougue
		WebElement tougue = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select selectTougue = new Select(tougue);
		selectTougue.selectByVisibleText("Tamil");
		// select your country
		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select selectCountry = new Select(findElement5);
		selectCountry.selectByVisibleText("India");
		// enter mobile no
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("8765439016");
		// enter email id
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("ABC@gmail.com");
		// close the browser
		driver.close();
		
	}

}
