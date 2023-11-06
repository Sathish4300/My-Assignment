import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class learnDataProvider {
	@DataProvider(name="login")
	public String[][] getData() {
		String [][] data = new String[2][2];
		data[0][0] = "8778021306";
		data[0][1] = "123456";
		
		data[1][0] = "9566957665";
		data[1][1] = "12345";
		 return data;
	}
	@Test(dataProvider = "login")
	public  void login(String email,String pass) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://exhibitor.agriexpo.live/login");
		driver.manage()
		.timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"mobile-number\"]")).sendKeys("email");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-logincomponent/div/div[2]/div/form/div/div[6]/div[2]/button")).click();
		driver.quit();
	}
}
