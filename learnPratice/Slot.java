package learnPratice;

import java.time.Duration;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slot {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://admin.agriexpo.live/#/");
		 driver.findElement(By.id("Firstname")).sendKeys("9965740303");
		 //9965740303
		 driver.findElement(By.id("Lastname")).sendKeys("1108624");
		 //1108624
		 driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		 // click slot seperation
		 driver.findElement(By.xpath("//a[text()='Slot Separation ']")).click();
		 // click create slot
		 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
		 // select date
		 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
		 // select duration
		 WebElement ele = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
		 org.openqa.selenium.support.ui.Select selectDate = new org.openqa.selenium.support.ui.Select(ele);
		 selectDate.selectByVisibleText("30");
		 // select slot type
		 WebElement sl = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
		 org.openqa.selenium.support.ui.Select selectSlot = new org.openqa.selenium.support.ui.Select(sl);
		 selectSlot.selectByVisibleText("Normal");
		 // choose time
		 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("09:00");
		 // submit
		 driver.findElement(By.xpath("//button[text()='Submit']")).click();
		 
		 // 9.30
		 // click create slot
		 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
		 // select date
		 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
		 // select duration
		 WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
		 org.openqa.selenium.support.ui.Select selectDate1 = new org.openqa.selenium.support.ui.Select(ele1);
		 selectDate1.selectByVisibleText("30");
		 // select slot type
		 WebElement sl1 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
		 org.openqa.selenium.support.ui.Select selectSlot1 = new org.openqa.selenium.support.ui.Select(sl1);
		 selectSlot1.selectByVisibleText("Normal");
		 // choose time
		 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("09:30");
		 // submit
		 driver.findElement(By.xpath("//button[text()='Submit']")).click();
		 
		 // 10.00
		// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate2 = new org.openqa.selenium.support.ui.Select(ele2);
				 selectDate2.selectByVisibleText("30");
				 // select slot type
				 WebElement sl2 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot2 = new org.openqa.selenium.support.ui.Select(sl2);
				 selectSlot2.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("10:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		// 10.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate3 = new org.openqa.selenium.support.ui.Select(ele3);
				 selectDate3.selectByVisibleText("30");
				 // select slot type
				 WebElement sl3 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot3 = new org.openqa.selenium.support.ui.Select(sl3);
				 selectSlot3.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("10:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		
		// 11.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele4 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate4 = new org.openqa.selenium.support.ui.Select(ele4);
				 selectDate4.selectByVisibleText("30");
				 // select slot type
				 WebElement sl4 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot4 = new org.openqa.selenium.support.ui.Select(sl4);
				 selectSlot4.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("11:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
				 
		// 11.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele5 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate5 = new org.openqa.selenium.support.ui.Select(ele5);
				 selectDate5.selectByVisibleText("30");
				 // select slot type
				 WebElement sl5 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot5 = new org.openqa.selenium.support.ui.Select(sl5);
				 selectSlot5.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("11:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
				 
		// 12.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele6 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate6 = new org.openqa.selenium.support.ui.Select(ele6);
				 selectDate6.selectByVisibleText("30");
				 // select slot type
				 WebElement sl6 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot6 = new org.openqa.selenium.support.ui.Select(sl6);
				 selectSlot6.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("12:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
				 
		// 12.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele7 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate7 = new org.openqa.selenium.support.ui.Select(ele7);
				 selectDate7.selectByVisibleText("30");
				 // select slot type
				 WebElement sl7 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot7 = new org.openqa.selenium.support.ui.Select(sl7);
				 selectSlot7.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("12:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
				 
		// 13.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele8 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate8 = new org.openqa.selenium.support.ui.Select(ele8);
				 selectDate8.selectByVisibleText("30");
				 // select slot type
				 WebElement sl8 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot8 = new org.openqa.selenium.support.ui.Select(sl8);
				 selectSlot8.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("13:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click();  
		// 13.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele9 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate9 = new org.openqa.selenium.support.ui.Select(ele9);
				 selectDate9.selectByVisibleText("30");
				 // select slot type
				 WebElement sl9 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot9 = new org.openqa.selenium.support.ui.Select(sl9);
				 selectSlot9.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("13:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 14.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele10 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate10 = new org.openqa.selenium.support.ui.Select(ele10);
				 selectDate10.selectByVisibleText("30");
				 // select slot type
				 WebElement sl10 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot10 = new org.openqa.selenium.support.ui.Select(sl10);
				 selectSlot10.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("14:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 14.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele11 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate11 = new org.openqa.selenium.support.ui.Select(ele11);
				 selectDate11.selectByVisibleText("30");
				 // select slot type
				 WebElement sl11 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot11 = new org.openqa.selenium.support.ui.Select(sl11);
				 selectSlot11.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("14:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 15.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele12 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate12 = new org.openqa.selenium.support.ui.Select(ele12);
				 selectDate12.selectByVisibleText("30");
				 // select slot type
				 WebElement sl12 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot12 = new org.openqa.selenium.support.ui.Select(sl12);
				 selectSlot12.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("15:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 15.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele13 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate13 = new org.openqa.selenium.support.ui.Select(ele13);
				 selectDate13.selectByVisibleText("30");
				 // select slot type
				 WebElement sl13 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot13 = new org.openqa.selenium.support.ui.Select(sl13);
				 selectSlot13.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("15:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 16.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele14 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate14 = new org.openqa.selenium.support.ui.Select(ele14);
				 selectDate14.selectByVisibleText("30");
				 // select slot type
				 WebElement sl14 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot14 = new org.openqa.selenium.support.ui.Select(sl14);
				 selectSlot14.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("16:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 16.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele15 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate15 = new org.openqa.selenium.support.ui.Select(ele15);
				 selectDate15.selectByVisibleText("30");
				 // select slot type
				 WebElement sl15 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot15 = new org.openqa.selenium.support.ui.Select(sl15);
				 selectSlot15.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("16:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 17.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele16 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate16 = new org.openqa.selenium.support.ui.Select(ele16);
				 selectDate16.selectByVisibleText("30");
				 // select slot type
				 WebElement sl16 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot16 = new org.openqa.selenium.support.ui.Select(sl16);
				 selectSlot16.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("17:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 17.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele17 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate17 = new org.openqa.selenium.support.ui.Select(ele17);
				 selectDate17.selectByVisibleText("30");
				 // select slot type
				 WebElement sl17 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot17 = new org.openqa.selenium.support.ui.Select(sl17);
				 selectSlot17.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("17:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
				 
		// 18.00
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele18 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate18 = new org.openqa.selenium.support.ui.Select(ele18);
				 selectDate18.selectByVisibleText("30");
				 // select slot type
				 WebElement sl18 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot18 = new org.openqa.selenium.support.ui.Select(sl18);
				 selectSlot18.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("18:00");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
		// 18.30
				// click create slot
				 driver.findElement(By.xpath("//button[text()=' Create Slot ']")).click();
				 // select date
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[1]/input")).sendKeys("06-11-2023");
				 // select duration
				 WebElement ele19 = driver.findElement(By.xpath("//*[@id=\"duration\"]"));
				 org.openqa.selenium.support.ui.Select selectDate19 = new org.openqa.selenium.support.ui.Select(ele19);
				 selectDate19.selectByVisibleText("30");
				 // select slot type
				 WebElement sl19 = driver.findElement(By.xpath("//*[@id=\"slot\"]"));
				 org.openqa.selenium.support.ui.Select selectSlot19 = new org.openqa.selenium.support.ui.Select(sl19);
				 selectSlot19.selectByVisibleText("Normal");
				 // choose time
				 driver.findElement(By.xpath("//*[@id=\"plan\"]/div/div/div[2]/div/div[4]/input")).sendKeys("18:30");
				 // submit
				 driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
				 
				 driver.quit();
	}
}
