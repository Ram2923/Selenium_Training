package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourPersonalInfoPage 
{
	@FindBy (xpath = "//a[@title='Log me out']")
	private WebElement SignoutLink;
	
	public YourPersonalInfoPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signoutLinkClick ()
	{
		SignoutLink.click();
	}

}
