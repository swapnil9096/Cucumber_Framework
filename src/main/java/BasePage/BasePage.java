package BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BasePage {
	
	static Properties prop;
	public static WebDriver driver;
	
	public BasePage()
	{
		String fileName = "F:\\ECLIPSE\\Cucumber_Framework\\src\\main\\resources\\config.properties";
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			 prop = new Properties();
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found...!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error in file loading...!!");
		}
	}
	
	
	public static void init()
	{
		String browser = prop.getProperty("browserName");
		
			if(browser.equalsIgnoreCase("CHROME"))
			{
//				driver = new ChromeDriver();
				
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option); 
			
			}else if(browser.equalsIgnoreCase("EDGE"))
			{
				EdgeOptions option = new EdgeOptions();
				option.addArguments("--remote-allow-origins=*");
				driver = new EdgeDriver(option);
			}else
				throw new RuntimeException("Invalid Browser...!!");
			
			driver.get(prop.getProperty("url"));
			
		String maximize = prop.getProperty("maximize");
		
		if(Boolean.valueOf(maximize))
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	
	
	
	
	
	
	
}
