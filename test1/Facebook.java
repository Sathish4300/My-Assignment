package test.test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sathish");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("8778071243");
		driver.findElement(By.name("reg_passwd__")).sendKeys("jkhaefejhklfh");
		// date dropdown
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select selectDate = new Select(date);
		selectDate.selectByIndex(5);
		// month dropdown
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByIndex(2);
		// year dropdown
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select selectYear = new  Select(year);
		selectYear.selectByVisibleText("2022");
		// select the gender
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		// close the browser
		driver.close();
	}

}
