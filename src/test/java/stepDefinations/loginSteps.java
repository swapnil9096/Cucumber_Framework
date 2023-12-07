package stepDefinations;

import org.testng.Assert;

import BasePage.BasePage;
import Pages.Dashboard;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends BasePage{

	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		init();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String un, String pass) {

		LoginPage.enterUserName(un);
		LoginPage.enterPassword(pass);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		
		LoginPage.clicksOnSubmitBtn();
	}

	@Then("User should be navigated to the homepage")
	public void user_should_be_navigated_to_the_homepage() {
		
		Assert.assertEquals(Dashboard.getDashBoardText(), "Dashboard","Test Case Failed...!!");
	}
	
	
}
