package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage 
{
	@FindBy (xpath = "//input[@id='email_create']")
	private WebElement emailAddress;
	
	@FindBy (xpath = "//button[@id='SubmitCreate']")
	private WebElement createAnAccountButton;
	
	public CreateAccountPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount (String emailID)
	{
		emailAddress.sendKeys(emailID);
		createAnAccountButton.click();
		
	}
	
	

}
