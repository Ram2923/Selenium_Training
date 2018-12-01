package testcases;

import org.testng.annotations.Test;

import pom.CreateAccountPage;
import pom.HomePage;
import pom.MyAccountPage;
import pom.RegistrationPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void userRegistrationSignout ()
	{
		HomePage hp = new HomePage (driver);
		hp.clickSignInLink();
		
		CreateAccountPage cacc = new CreateAccountPage (driver);
		cacc.createAccount("shoba12_jk@yahoo.com");
		
		RegistrationPage rp = new RegistrationPage (driver);
		rp.createAProfile("Shoba", "Rajesh", "Password@123", "malleshwars", "Shoba", "Rk layout", "Bang", "65666", "988834352");
		
		MyAccountPage map = new MyAccountPage (driver);
		map.clickMyPersonalInfoButton();
	}
}
