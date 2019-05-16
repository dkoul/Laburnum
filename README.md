# Laburnum

Synthetic monitor for pre prod apps:

To use :

Clone and run mvn test with following arguements :

seleniumHostURL is a running remoteWebDriver instace.
appURL is the application url which you want to test
username and password are required if your app has a login form which redirects to the page you are testing for health check
username and password CSS locators are required
healthLocator CSS is required.

If you want to healthcheck an API call, leave the healthLocator blank.



See this example:


-DseleniumHostURL=http://localhost:444/wd/hub
-DappURL=https://www.npmjs.com/products
-Dusername=abc
-Dpassword=*****
-DusernameLocator=input#username
-DpasswordLocator=input#password
-DhealthLocator=h1.page-title


