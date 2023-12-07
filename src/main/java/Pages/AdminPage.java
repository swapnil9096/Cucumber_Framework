package Pages;

import java.util.List;
import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminPage extends BasePage{
	
	public AdminPage()
	{
		super();
	}
	
	static String url="";
	
	static By jobLink = By.xpath("(//*[@class='oxd-icon bi-chevron-down'])[2]");	
	static By jobOptions = By.cssSelector("[role='menuitem']");
	static By organizationLink = By.xpath("(//*[@class='oxd-icon bi-chevron-down'])[3]"); 
	static By organizationOptions = By.cssSelector("[class='oxd-topbar-body-nav-tab-link']");
	static By qualificationLink = By.xpath("(//*[@class='oxd-icon bi-chevron-down'])[4]"); 
	static By qualificationOptions = By.xpath("//*[@class='oxd-dropdown-menu']/li");	
	
	
	public static void clickOnJobLink()
	{
		driver.findElement(jobLink).click();
	}
	
	public static void clickOnOrganizationLink()
	{
		driver.findElement(organizationLink).click();
	}
	
	public static void clickOnQualificationLink()
	{
		driver.findElement(qualificationLink).click();
	}
	
	
	public static String clickOnJobOptions()
	{
		clickOnJobLink();
		List<WebElement> jobElmts = driver.findElements(jobOptions);
		
		for(int i=0;i<jobElmts.size();i++)
		{
			clickOnJobLink();
			jobElmts = driver.findElements(jobOptions);
			jobElmts.get(i).click();
			url = driver.getCurrentUrl();
		}
		return url;
	}
	
	public static String clickOnOrganizationOptions()
	{
		clickOnOrganizationLink();
		List<WebElement> organizationElmts = driver.findElements(organizationOptions);
		
		for(int i=0;i<organizationElmts.size();i++)
		{
			clickOnOrganizationLink();
			organizationElmts = driver.findElements(organizationOptions);
			
			organizationElmts.get(i).click();
			
			url = driver.getCurrentUrl();
		}
		return url;
	}
	
	public static String clickOnQualificationOptions()
	{
		clickOnQualificationLink();
		List<WebElement> organizationElmts = driver.findElements(qualificationOptions);
		
		for(int i=0;i<organizationElmts.size();i++)
		{
			clickOnQualificationLink();
			organizationElmts = driver.findElements(qualificationOptions);
			
			organizationElmts.get(i).click();
			
			url = driver.getCurrentUrl();
		}
		return url;
	}
}



















