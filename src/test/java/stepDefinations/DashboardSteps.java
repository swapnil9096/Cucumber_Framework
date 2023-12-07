package stepDefinations;

import org.testng.Assert;

import BasePage.BasePage;
import Pages.Dashboard;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends BasePage{
	
	
	@Before
	public void setUp()
	{
		init();
	}
	
//	@After
//	public void tearDown()
//	{
//		driver.close();
//	}
	
	@Given("User should be on dashboard page")
	public void user_should_be_on_dashboard_page() 
	{	
		LoginPage.getLogin("Admin", "admin123");
	}

	@When("User clicks on each link")
	public void user_clicks_on_each_link() 
	{
		Dashboard.clickOnLinks();
	}

	@Then("User should navigate to respective page")
	public void user_should_navigate_to_respective_page() 
	{
		String url = Dashboard.clickOnLinks();
		Assert.assertTrue(url.contains("https"),"Test Case Failed...!!");
	}

	
	@When("User clicks on profile dropdown")
	public void user_clicks_on_profile_dropdown() 
	{
		Dashboard.clickOnProfileDropdown();
	}

	@Then("Verify user is navigated to respective option of profile dropdown")
	public void verify_user_is_navigated_to_respective_option_of_profile_dropdown() 
	{
		String url = Dashboard.clickOnProfileDropdownLinks();
		Assert.assertTrue(url.contains("https"),"Test Case failed...!!");
	}
	
	
	
	@When("User clicks on each link of quick launch")
	public void user_clicks_on_each_link_of_quick_launch() 
	{
		Dashboard.clickOnQuickLaunchLinks();
	}

	@Then("Verify user is navigated to each link of quick launch")
	public void verify_user_is_navigated_to_each_link_of_quick_launch() 
	{
		String url = Dashboard.clickOnQuickLaunchLinks();
		Assert.assertTrue(url.contains("https"),"Test Case Failed...!!");
	}
	
	
	@When("User clicks on each link of my actions")
	public void user_clicks_on_each_link_of_my_actions() 
	{
		Dashboard.clickOnMyActionsLinks();
	}

	@Then("Verify user is navigated to each link of my actions")
	public void verify_user_is_navigated_to_each_link_of_my_actions() 
	{
		String url = Dashboard.clickOnMyActionsLinks();
		Assert.assertTrue(url.contains("https"),"Test Case Failed...!!");
	}

	
	
}
