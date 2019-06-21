package case_study;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Drivers;

public class AddToCart {
	WebDriver driver;
	@Given("Alex has valid login credential")
	public void alex_has_valid_login_credential() {
		driver = Drivers.getDrivers("chrome");
		PageFactory.initElements(driver,  ObjectRepository.class);
		driver.get("http://10.232.237.143:443/TestMeApp/home.htm");
		Assert.assertEquals("Login", driver.getTitle());
	}

	@When("Alex enters {string} in search field")
	public void alex_enters_in_search_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex selects the product and search")
	public void alex_selects_the_product_and_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex clicks on Add to cart")
	public void alex_clicks_on_Add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex clicks on cart")
	public void alex_clicks_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex clicks on checkout")
	public void alex_clicks_on_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex clicks on ProceedToPay")
	public void alex_clicks_on_ProceedToPay() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex clicks on {string}")
	public void alex_clicks_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alext clicks on Continue")
	public void alext_clicks_on_Continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex enters {string} as u")
	public void alex_enters_as_u(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex enters {string} as pas")
	public void alex_enters_as_pas(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex clicks on login")
	public void alex_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex enters {string} as transaction password")
	public void alex_enters_as_transaction_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Alex clicks on PayNow")
	public void alex_clicks_on_PayNow() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Alex gets Payment details")
	public void alex_gets_Payment_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
