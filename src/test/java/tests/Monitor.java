package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.Env;


public class Monitor extends BaseTest {

	private HomePage homepage;

	@Test
	public void verifyHealthLocator() throws Exception

	{

		this.createDriver("chrome");
		WebDriver driver = this.getWebDriver();
		System.out.println("Chrome driver instance created successfully");
		homepage = new HomePage(driver);
		homepage.visit();
		System.out.println("Login page loaded, initiating signin process");
		if(Env.getUsername()!="")
		{
			homepage.signIn();
						
		}
		homepage.checkHealthLocatorPresent();
		System.out.println("Matched health locator successfully");

	}

}
