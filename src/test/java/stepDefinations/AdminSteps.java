package stepDefinations;

import org.testng.Assert;

import BasePage.BasePage;
import Pages.AdminPage;
import Pages.Dashboard;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps extends BasePage{
	
	
	@Before
	public void  setUp()
	{
		init();
	}
	
	@Given("User should be on adminpage")
	public void user_should_be_on_adminpage()
	{
		LoginPage.getLogin("Admin", "admin123");
		Dashboard.clickOnAdminLink();
	}

	@When("User clicks on job dropdown")
	public void user_clicks_on_job_dropdown() 
	{
		AdminPage.clickOnJobLink();
	}

	@When("User clicks on every option of organization")
	public void user_clicks_on_every_option_of_organization() 
	{
		AdminPage.clickOnJobOptions();
	}

	@Then("User should navigate to jobs respective pages")
	public void user_should_navigate_to_jobs_respective_pages() 
	{
		String url = AdminPage.clickOnJobOptions();
		Assert.assertTrue(url.contains("https"));
	}

	@When("User clicks on organization dropdown")
	public void user_clicks_on_organization_dropdown() 
	{
		AdminPage.clickOnOrganizationLink();
	}

	@Then("User should navigate to the every option of the organization")
	public void user_should_navigate_to_the_every_option_of_the_organization() 
	{
		String url = AdminPage.clickOnOrganizationOptions();
		Assert.assertTrue(url.contains("https"));
	}

	@When("User clicks on qualifications dropdown")
	public void user_clicks_on_qualifications_dropdown() 
	{
		AdminPage.clickOnQualificationLink();
	}

	@When("User clicks on every option of qualifications")
	public void user_clicks_on_every_option_of_qualifications()
	{
		AdminPage.clickOnQualificationOptions();
	}

	@Then("User should be navigated to the every option of qualifications")
	public void user_should_be_navigated_to_the_every_option_of_qualifications() 
	{
		String url = AdminPage.clickOnQualificationOptions();
		Assert.assertTrue(url.contains("https"));
	}


	
	
}
