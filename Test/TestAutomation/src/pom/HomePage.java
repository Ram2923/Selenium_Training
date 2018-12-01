package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	// Declare the web elements of Home Page
	@FindBy (xpath = "//a[@class='login']")
	private WebElement SigninLink;
	
	// Initialize the Web Elements
	public HomePage (WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	// Utilize this Method
	public void clickSignInLink ()
	{
		SigninLink.click();
	}
	
	
	
	
	
	
	//
	
	
	
}
