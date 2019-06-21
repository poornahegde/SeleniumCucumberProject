package case_study;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Drivers;

public class Cucumber_cases {
	WebDriver driver;
	
	@Given("The url of testmeapp")
	public void the_url_of_testmeapp() {
		driver = Drivers.getDrivers("chrome");
		PageFactory.initElements(driver,  ObjectRepository.class);
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		Assert.assertEquals("Sign Up", driver.getTitle());
	}

	@When("User enters {string} as username")
	public void user_enters_as_username(String string) {
		 ObjectRepository.username.sendKeys(string);
	}
	
	@When("User enters {string} as firstname")
	public void user_enters_as_firstname(String string) {
	   ObjectRepository.firstName.sendKeys(string);
	}

	@When("User enters {string} as lastname")
	public void user_enters_as_lastname(String string) {
	   ObjectRepository.lastName.sendKeys(string);
	}

	@When("User enters {string} as password")
	public void user_enters_as_password(String string) {
		ObjectRepository.password.sendKeys(string);
	}

	@When("User enters {string} as confirm password")
	public void user_enters_as_confirm_password(String string) {
		ObjectRepository.pass_confirmation.sendKeys(string);
	}

	@When("user clicks {string} as gender")
	public void user_clicks_as_gender(String string) {
		ObjectRepository.gender.click();
	}

	@When("User enters {string} as email")
	public void user_enters_as_email(String string) {
		ObjectRepository.emailAddress.sendKeys(string);
	}

	@When("User enters {string} as mobile_number")
	public void user_enters_as_mobile_number(String string) {
		ObjectRepository.mobileNumber.sendKeys(string);
	}

	@When("User enters {string} as dob")
	public void user_enters_as_dob(String string) {
		ObjectRepository.dob.sendKeys(string);
	}

	@When("User enters {string} as address")
	public void user_enters_as_address(String string) {
		ObjectRepository.address.sendKeys(string);
	}

	@When("User selects {string} as security question")
	public void user_selects_as_security_question(String string) {
		ObjectRepository.securityQuestion.click();
	}

	@When("User enters {string} as security answer")
	public void user_enters_as_security_answer(String string) {
		ObjectRepository.answer.sendKeys(string);
	}
	
	@When("User clicks register button")
	public void user_clicks_register_button() {
		ObjectRepository.register.click();
	}
	
	@Then("User is in valid page")
	public void user_is_in_valid_page() {
		Assert.assertEquals(driver.getTitle(), "Login");
	}
}
