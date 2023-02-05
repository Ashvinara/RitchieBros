package stepDefinitionOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	
	WebDriver driver;

	@Given("User enter the Amazon website url")
	public void user_enter_the_amazon_website_url() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Java VJ\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User landed to Amazon website")
	public void user_landed_to_amazon_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User able to choose the product")
	public void user_able_to_choose_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User able to add the product to the cart")
	public void user_able_to_add_the_product_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User able to reject the coverage selection")
	public void user_able_to_reject_the_coverage_selection() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User able to view the cart confirmation")
	public void user_able_to_view_the_cart_confirmation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User able to close the Amazon website")
	public void user_able_to_close_the_amazon_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	

}
