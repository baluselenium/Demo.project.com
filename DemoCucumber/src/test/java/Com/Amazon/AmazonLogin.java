package Com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.Url;

public class AmazonLogin 
{
	@Given("^I navigate to Amazon login page$")
	public void i_navigate_to_Amazon_login_page() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\GeckoDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(Url.urlname);
		
	   
	}

	@Then("^I enter valid login credential for amazon$")
	public void i_enter_valid_login_credential_for_amazon() throws Throwable {
	    
	}

	@Then("^I should navigate to logged in page$")
	public void i_should_navigate_to_logged_in_page() throws Throwable {
	    
	}


	
	

}
