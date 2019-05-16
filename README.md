# Laburnum

Synthetic monitor for pre prod apps:

To use :

Clone and run mvn test with following arguements :

seleniumHostURL is a running remoteWebDriver instace.
appURL is the application url which you want to test
username and password are required if your app has a login form which redirects to the page you are testing for health check
username and password CSS locators are required
healthLocator CSS is required.





See this example:


-DseleniumHostURL=http://standalone-chrome-selenium-grid.1d35.starter-us-east-1.openshiftapps.com/wd/hub
-DappURL=https://access.qa.redhat.com/support/cases/#/case/02336336
-Dusername=rhn-support-dkoul
-Dpassword=*****
-DusernameLocator=input#username
-DpasswordLocator=input#password
-DhealthLocator=h1.page-title


