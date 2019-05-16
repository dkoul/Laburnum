package utilities;

public class Env {

	public static String getSeleniumHostURL() {
		String seleniumHostURL = System.getProperty("seleniumHostURL");

		if (seleniumHostURL == null) {
			
			seleniumHostURL="";
			
		}
		return seleniumHostURL;
	}
	
	public static String getAppURL() {
		String appURL = System.getProperty("appURL");

		if (appURL == null) {
			appURL="";
		}
		return appURL;
	}
	
	public static String getUsername() {
		String username = System.getProperty("username");

		if (username == null) {
			username="";
		}
		return username;
	}
	
	public static String getPassword() {
		String password = System.getProperty("password");

		if (password == null) {
			password="";
		}
		return password;
	}
	
	public static String getPasswordLocator() {
		 String passwordLocator = System.getProperty("passwordLocator");

		if (passwordLocator == null) {
			passwordLocator ="";
		}
		return passwordLocator;
	}
	
	public static String getUsernameLocator() {
		String usernameLocator = System.getProperty("usernameLocator");

		if (usernameLocator == null) {
			usernameLocator="";
		}
		return usernameLocator;
	}
	
	public static String getHealthLocator() {
		String healthLocator = System.getProperty("healthLocator");

		if (healthLocator == null) {
			healthLocator="";
		}
		return healthLocator;
	}
	
	
}
