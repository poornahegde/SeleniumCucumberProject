package case_study;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Drivers;

public class LoginCase {
	WebDriver driver;
	@Given("Poorna in valid page")
	public void poorna_in_valid_page() {
		driver = Drivers.getDrivers("chrome");
		PageFactory.initElements(driver,  ObjectRepository.class);
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		Assert.assertEquals("Login", driver.getTitle());
	}	
	
	@When("Poorna enters {word} as uname")
	public void poorna_enters_AlexUser_as_uname(String string) {
		 ObjectRepository.username.sendKeys(string);
	}

	@When("Poorna enters {word} as pwd")
	public void poorna_enters_Alex_as_pwd(String str1) {
		ObjectRepository.password.sendKeys(str1);
	}

	@Then("successful login")
	public void successful_login() {
		ObjectRepository.login.click();
	}
}
