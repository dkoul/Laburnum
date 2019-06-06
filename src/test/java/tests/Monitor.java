package tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.HomePage;
import utilities.Env;


public class Monitor extends BaseTest {

	private HomePage homepage;

	@Test
	public void verifyHealthLocator() throws Exception

	{

		String choice = "UI";
		if (Env.getHealthLocator() == "") {

			choice = "API";
		}
		switch (choice) {
		case "UI":
			this.createDriver("chrome");
			WebDriver driver = this.getWebDriver();
			System.out.println("Driver instance created successfully");
			homepage = new HomePage(driver);
			homepage.visit();
			if (Env.getUsername() != "") {
				System.out.println("Login page loaded, initiating signin process");
				homepage.signIn();

			}
			Assert.assertEquals(true, homepage.checkHealthLocatorPresent());
			this.teardown();
			break;

		case "API":
			URL url = new URL(Env.getAppURL());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			if(Env.getUsername()!= "") {
				String encoded = Base64.getEncoder().encodeToString((Env.getUsername()+":"+Env.getPassword()).getBytes(StandardCharsets.UTF_8));  
				conn.setRequestProperty("Authorization", "Basic "+encoded);
			}
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			Assert.assertEquals(conn.getResponseCode(), 200);

		}

	}

	
}
