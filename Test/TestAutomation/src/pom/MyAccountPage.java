package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{
	@FindBy (xpath = "//span[text()='My personal information']")
	private WebElement MyPersonlInfoButton;
	
	public MyAccountPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyPersonalInfoButton ()
	{
		MyPersonlInfoButton.click();
	}

}
