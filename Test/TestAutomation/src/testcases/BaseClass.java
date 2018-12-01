package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser ()
	{
		System.setProperty("webdriver.chrome.driver","BrowserDrivers\\Chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/*@AfterMethod
	public void closeBrowser ()
	{
		driver.close();
	}*/

}
