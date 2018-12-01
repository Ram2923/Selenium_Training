package basicSeleniumOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","BrowserDrivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Dresses'])[2]")));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("demo@auto.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		Thread.sleep(3000);
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		
		Select day = new Select (days);
		day.selectByValue("21");
		
		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
	    Select month = new Select (months);
	    month.selectByValue("3");
	    
	    WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
	    Select state1 = new Select (state);
	    state1.selectByVisibleText("California");
	
	
	
	
	}
	

}
