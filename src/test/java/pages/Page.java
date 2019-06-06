package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

	protected WebDriver driver;

	/*
	 * Constructor injecting the WebDriver interface
	 * 
	 * @param webDriver
	 */
	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public boolean waitUntillClickable(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			System.out.println("Matched health locator successfully");
			return true;
		}

		catch (Exception e) {
			System.out.println("Waited for 60 seconds, could not find the locator identified by: " + locator);
			return false;
		}
	}

}
