package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LandingPageDefinition {
public WebDriver driver;
public String text;
public String text2;
TestContextSetup contextSetup;

public LandingPageDefinition(TestContextSetup contextSetup) {
	this.contextSetup = contextSetup;
}
	
	
@Given("User is on GreenKart Landing Page")
public void user_is_on_green_kart_landing_page() {
    // Write code here that turns the phrase above into concrete actions
	contextSetup.driver = new ChromeDriver();
	contextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
}
@When("User searched with shortname {string} and extract the actual word")
public void user_searched_with_shortname_and_extract_the_actual_word(String string) {
    // Write code here that turns the phrase above into concrete actions
	contextSetup.driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(string);
	contextSetup.text = contextSetup.driver.findElement(By.xpath("//h4[text()='Tomato - 1 Kg']")).getText().split("-")[0].trim();
}

}
