package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage 
{
	@FindBy (xpath = "//input[@name='id_gender']")
	private WebElement titleRadioButton;
	
	@FindBy (xpath = "//input[@id='customer_firstname']")
	private WebElement firstNameFeild;
	
	@FindBy (xpath = "//input[@id='customer_lastname']")
	private WebElement lastNameField;
	
	@FindBy (xpath = "//input[@id='passwd']")
	private WebElement passwordField;
	
	@FindBy (xpath = "//input[@id='firstname']")
	private WebElement firstNameadd;
	
	@FindBy (xpath = "//input[@id='lastname']")
	private WebElement lastNameadd;
	
	@FindBy (xpath = "//input[@id='address1']")
	private WebElement addressField;
	
	@FindBy (xpath = "//input[@id='city']")
	private WebElement cityField;
	
	@FindBy (xpath = "//input[@id='postcode']")
	private WebElement postCodeField;
	
	@FindBy (xpath = "//input[@id='phone_mobile']")
	private WebElement MobilePhoneField;
	
	@FindBy (xpath = "//button[@id='submitAccount']")
	private WebElement SubmitButton;
	
	@FindBy (xpath = "//select[@id='id_state']")
	private WebElement StateDropdown;
	
	public RegistrationPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createAProfile (String firstname, String lastname, String pwd, String ad_fn, String ad_ln, String address,
								String City, String zip, String mobphone)
	{
		titleRadioButton.click();
		firstNameFeild.sendKeys(firstname);
		lastNameField.sendKeys(lastname);
		passwordField.sendKeys(pwd);
		firstNameadd.sendKeys(ad_fn);
		lastNameadd.sendKeys(ad_ln);
		addressField.sendKeys(address);
		cityField.sendKeys(City);
		
		Select state = new Select (StateDropdown);
		state.selectByVisibleText("California");
		
		postCodeField.sendKeys(zip);
		MobilePhoneField.sendKeys(mobphone);
		SubmitButton.click();
		
		
		
		
		
		
		
		
		
	}
	
	

}
