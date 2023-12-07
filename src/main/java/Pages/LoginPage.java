package Pages;

import org.openqa.selenium.By;

import BasePage.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage()
	{
		super();
	}
	
	static By userName = By.name("username");
	static By password = By.name("password");
	static By submitBtn = By.xpath("//*[@type='submit']");
	
	public static void enterUserName(String un)
	{
		driver.findElement(userName).sendKeys(un);
	}
	
	public static void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public static void clicksOnSubmitBtn()
	{
		driver.findElement(submitBtn).click();
	}
	
	public static Dashboard getLogin(String un, String pass)
	{
		enterUserName(un);
		enterPassword(pass);
		clicksOnSubmitBtn();
		
		return new Dashboard();
	}
	
}
