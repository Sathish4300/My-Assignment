package parallel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown2 {
	@Test
	public  void Down() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		// select by visible text
		WebElement ele = driver.findElement(By.id("fruits"));
		Select select = new Select(ele);
		select.selectByVisibleText("Apple");
		// multiselect
		WebElement ele1 = driver.findElement(By.id("superheros"));
		Select select1 = new Select(ele1);
		boolean mul = select1.isMultiple();
		System.out.println("Multiselect option is working fine or not "+ mul);
		select1.selectByValue("aq");
		select1.selectByValue("bp");
		//
		List<WebElement> se = select1.getAllSelectedOptions();
		for (WebElement webElement : se) {
			System.out.println(webElement.getText());
		}
		// Select the last programming language and print all the options
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='lang']"));
		Select select2 = new Select(ele2);
		select2.selectByIndex(4);
		List<WebElement> se1 = driver.findElements(By.xpath("//select[@id='lang']"));
		for(int i=0;i<se1.size();i++) {
			String text = se1.get(i).getText();
			System.out.println(text);
		}
		//Select India using value & print the selected value
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='country']"));
		Select select3 = new Select(ele3);
		select3.selectByVisibleText("India");
		WebElement se3 = select3.getFirstSelectedOption();
		System.out.println(se3.getText());
		driver.quit();
	}

}
