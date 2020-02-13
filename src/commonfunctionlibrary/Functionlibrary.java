package commonfunctionlibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.PropertyFileUtil;

public class Functionlibrary
{
	WebDriver driver;
	public WebDriver startBrowser() throws IOException
	{
		if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\selenium.harini\\stockaccountinghtbrid\\driver\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			}else if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","D:\\selenium.harini\\stockaccountinghtbrid\\driver\\geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();	
			}
		return driver;
	}
	public void openApplication() throws IOException
	{
		driver.get(PropertyFileUtil.getValueForKey("url"));
		driver.manage().window().maximize();
		}
	public void waitForElement(String )
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
