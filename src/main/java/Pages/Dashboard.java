package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePage.BasePage;

public class Dashboard extends BasePage {

	public Dashboard() 
	{
		super();
	}
	
	
	
	static By adminLink = By.linkText("Admin");
	static By dashBoardText = By.tagName("h6");
	static By links = By.xpath("//ul[@class='oxd-main-menu']/li");
	static By profileLinks = By.xpath("//*[@class='oxd-dropdown-menu']/li");
	static By profileName = By.cssSelector("*[class='oxd-userdropdown-name']");
	static By quickLaunchLinks = By.xpath(
			"//*[@class='oxd-grid-3 orangehrm-quick-launch']//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card']");
	static By myActionsLinks = By.xpath("//*[@class='orangehrm-todo-list-item']");
	static By aboutPopUp = By.cssSelector("[class='oxd-dialog-close-button oxd-dialog-close-button-position']");
	
	
	
	public static void clickOnAdminLink()
	{
		driver.findElement(adminLink).click();
	}
	
	public static String getDashBoardText() {
		return driver.findElement(dashBoardText).getText();
	}

	public static String clickOnLinks()
	{
		List<WebElement> linkList = driver.findElements(links);
		String url = "";

		for (int i = 0; i < linkList.size(); i++) 
		{	
			linkList = driver.findElements(links);
			if(i != 9)
				linkList.get(i).click();
				url = driver.getCurrentUrl();
				driver.navigate().refresh();
		}
		return url;
	}

	public static void clickOnProfileDropdown() 
	{
		driver.findElement(profileName).click();
	}

	public static String clickOnProfileDropdownLinks()
	{
		List<WebElement> links = driver.findElements(profileLinks);
		String url = "";

		for (int i = 0; i < links.size(); i++) 
		{
			clickOnProfileDropdown();
			links = driver.findElements(profileLinks);
			links.get(i).click();
			if(i==0)
			{
				driver.findElement(aboutPopUp).click();
			}
			url = driver.getCurrentUrl();
		
		}
		return url;
	}

	public static String clickOnQuickLaunchLinks() {
		List<WebElement> links = driver.findElements(quickLaunchLinks);
		String url = "";

		for (WebElement ele : links) 
		{
			ele.click();
			url = driver.getCurrentUrl();
			driver.navigate().back();
		}
		return url;
	}

	public static String clickOnMyActionsLinks() {
		List<WebElement> links = driver.findElements(myActionsLinks);
		String url = "";

		for (WebElement ele : links)
		{
			ele.click();
			url = driver.getCurrentUrl();
			driver.navigate().back();
		}
		return url;
	}

}
