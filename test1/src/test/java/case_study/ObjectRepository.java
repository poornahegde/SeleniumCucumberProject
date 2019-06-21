package case_study;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectRepository {

	@FindBy(how=How.ID,using = "userName")
	public static WebElement username;

	@FindBy(how=How.ID,using = "firstName")
	public static WebElement firstName;

	@FindBy(how=How.ID,using = "lastName")
	public static WebElement lastName;

	@FindBy(how=How.ID,using = "password")
	public static WebElement password;

	@FindBy(how=How.ID,using = "pass_confirmation")
	public static WebElement pass_confirmation;

	@FindBy(how=How.CSS,using = "input[value='Female']")
	public static WebElement gender;

	@FindBy(how=How.ID,using = "emailAddress")
	public static WebElement emailAddress;

	@FindBy(how=How.ID,using = "mobileNumber")
	public static WebElement mobileNumber;

	@FindBy(how=How.ID,using = "dob")
	public static WebElement dob;

	@FindBy(how=How.ID,using = "address")
	public static WebElement address;

	@FindBy(how=How.ID,using = "securityQuestion")
	public static WebElement securityQuestion;

	@FindBy(how=How.ID,using = "answer")
	public static WebElement answer;
	
	@FindBy(how=How.CSS,using = "input[value='Register']")
	public static WebElement register;

	@FindBy(how=How.CSS,using = "input[value='Login']")
	public static WebElement login;
}
