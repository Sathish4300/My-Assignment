package stepDefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.TestContextSetup;

public class OfferPageDefinition {

	public WebDriver driver;
	public String text;
	public String text2;
	TestContextSetup contextSetup;

	public OfferPageDefinition(TestContextSetup contextSetup) {
		this.contextSetup = contextSetup;
	}
		
	@Then("User searched for {string} in offer page and extract the word")
	public void user_searched_for_in_offer_page_and_extract_the_word(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String windowHandle = contextSetup.driver.getWindowHandle();
		contextSetup.driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String> handle = contextSetup.driver.getWindowHandles();
		for(String newWindow : handle) {
			contextSetup.driver.switchTo().window(newWindow);
		}
		contextSetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(string);
		Thread.sleep(2000);
		 //text2 = driver.findElement(By.xpath("//td[normalize-space()='Tomato']")).getText();
		text2 = contextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		contextSetup.driver.switchTo().window(windowHandle);
	}
	@Then("validate the both name same or not")
	public void validate_the_both_name_same_or_not() {
	    // Write code here that turns the phrase above into concrete actions
		//assertEquals(text2, text);
		//Assert.assertEquals(text, text2);
		//Assert.assertEquals(text2, text);
		Assert.assertEquals(text2, contextSetup.text);
	}	
}
