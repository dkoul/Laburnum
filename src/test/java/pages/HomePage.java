package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.Env;

/**
 * Sample page
 */
public class HomePage extends Page {

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public void signIn() {

		waitUntillClickable(By.cssSelector(Env.getUsernameLocator()));
		driver.findElement(By.cssSelector(Env.getUsernameLocator())).sendKeys(Env.getUsername());
		driver.findElement(By.cssSelector(Env.getPasswordLocator())).sendKeys(Env.getPassword());
		driver.findElement(By.cssSelector(Env.getPasswordLocator())).sendKeys(Keys.ENTER);
		}

	public void visit() {
		driver.get(Env.getAppURL());
		
	}
	
	public void checkHealthLocatorPresent() {
		waitUntillClickable(By.cssSelector(Env.getHealthLocator()));
	}

}
