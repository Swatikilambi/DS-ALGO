package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import PageObjects.home_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_Algo_Homepage {

	home_page homePage = new home_page();

	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	    
		LoggerLoad.info("Open DSAlgo portal ");
		homePage.dsalgoportal();
		
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_Get_Started_button() {
		LoggerLoad.info("Click Get Started Button");
		homePage.getStarted();
		
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		
	   String title = homePage.getTitle();
	   LoggerLoad.info("USer is on "+title+" page");
		assertEquals(title,"NumpyNinja");
	}
	
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		LoggerLoad.info("Homepage");
		homePage.homepageurl();
	    
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
		LoggerLoad.info("Click Get Started without signing in");
		homePage.dsGetStarted();
	    
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		try {
			String errorMessage = homePage.errorMsg();
			LoggerLoad.info(errorMessage);
		}
	    catch(NoSuchElementException e) {
	    	
	    }
	}

	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String string) {
		LoggerLoad.info("User clicks on drop down");
		homePage.clickDropdown();
		try {
			homePage.selectfromDropdown();
			LoggerLoad.info("Select Stack from dropdown");
		}
	    catch(NoSuchElementException e) {
	    	
	    }
	}
	@When("User clicks on Register link")
	public void the_user_clicks_register() {
		  LoggerLoad.info("HOme: User clicks on Register link");
		  homePage.registerClick();
			
	}
	@And("User is redirected to Register page")
	public void user_redirected_to_register_page()
	{
		 LoggerLoad.info("HOme: User redirected to Register Page");
		homePage.registerPage();
	}
	@Then("User is navigated to Homepage")
	public void user_is_navigated_to_homepage()
	{
		LoggerLoad.info("HOme: User navigated tohomepage from register Page");
		homePage.Navigate_To_Home_Page();
	}
	@When("The user clicks {string} and login with credentials")
	public void the_user_clicks(String string) throws Throwable {
		LoggerLoad.info("User clicks sign in link");
		homePage.signinClick();
		homePage.SendUserName_Password();
	}
	
	@Then("The user should be redirected to homepage after Sign in with credentials")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    LoggerLoad.info("User directed to Homepage after signin with credentials page");
	    String title = homePage.getTitle();
		   LoggerLoad.info("USer is on "+title+" page");
			assertEquals(title,"NumpyNinja");
	}
}
