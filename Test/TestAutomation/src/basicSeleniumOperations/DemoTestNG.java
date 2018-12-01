package basicSeleniumOperations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTestNG 
{
	@Test (priority = 1
			)
	public void zpenBrowser ()
	{
		System.out.println("Browser Open");
	}
	
	@Test
	public void enterUrl ()
	{
		System.out.println("Enter URL");
	}
	
	@Test
	public void closeBrowser ()
	{
		System.out.println("Close Browser");
	}
	
	
}
