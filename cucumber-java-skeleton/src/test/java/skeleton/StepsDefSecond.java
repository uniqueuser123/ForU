package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefSecond {
	WebDriver driver;
	@Given("^The URL of Git Hub$")
	public void the_URL_of_GitHUb() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a.d.lakshminarayana\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
	   	}

	@When("^User enters (.*) as username$")
	public void user_enters_uniqueuser_as_username(String username) throws Throwable {
		driver.findElement(By.id("login_field")).sendKeys(username);
	   
	}
	@Given("^User enters (.*) as password$")
	public void user_enters_Shivaji_$_as_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	
	}

	@Given("^User Clicks on SignIn$")
	public void user_Clicks_on_SignIn() throws Throwable {
		driver.findElement(By.name("commit")).click();
	   
	}

	@Then("^User navigates to (.*)$")
	public void user_navigates_to_Git_Hub(String result) throws Throwable {
	   if(result.startsWith("Sign"))
	   {
		   Assert.assertTrue(driver.getTitle().startsWith("Sign"));
	   }
	   else {
		   Assert.assertTrue(driver.getTitle().startsWith("Git"));
	   }
	}

	/*@Given("^User enters abcd as password$")
	public void user_enters_abcd_as_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();*/
	}

	/*@Then("^User navigates to SignIn Git Hub$")
	public void user_navigates_to_SignIn_Git_Hub() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
