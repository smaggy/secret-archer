Roderick Ortega
Springboro, Ohio
11/1/2012

Setup and Tool Information
Windows 7 Enterprise Edition
Maven: Version 3.0.4
Java: JDK Version 1.6.0.35
Ant: Version 1.8.4
Silktest: Version 2011 HF3
Selenium: WebDriver Version 2.25.0
JUnit: Version 4.10
Eclipse: Eclipse JavaEE for Web Developers - Juno Release - Normally run the Java Perspective

General Installation Notes - restart as necessary:
1. install java jdk version
2. install maven
3. install ant
4. install silktest
5. install eclipse version
6. in the project directory, and in the presence of the POM file, execute | mvn eclipse:eclipse -Declipse.workspace={eclipse workspace}.  This setsup the .project and .classpath files in the directory and configures workspaces.
7. next execute | mvn clean install.  this sets up the maven repository.
NOTE: if the jars in the classpath are coming up with errors, check your M2_REPO classpath variable in eclipse.
	a. Eclipse --> Window --> Preferences
	b. Java --> Build Path --> Classpath Variables
	c. if M2_REPO variable is not present, create it and point to local maven .m2/repository location
	
Check pom.xml for more detailed information.   A zip file should be produced as a result of using the maven build system.

Update 20121103 Roderick Ortega
1. received the following error in the console.
The path to the driver executable must be set by the webdriver.ie.driver system property; for more information, see http://code.google.com/p/selenium/wiki/InternetExplorerDriver. The latest version can be downloaded from http://code.google.com/p/selenium/downloads/list
Nov 3, 2012 7:10:47 AM org.openqa.selenium.ie.InternetExplorerDriverServer initializeLib
WARNING: This method of starting the IE driver is deprecated and will be removed in selenium 2.26. Please download the IEDriverServer.exe from http://code.google.com/p/selenium/downloads/list and ensure that it is in your PATH.
Nov 3, 2012 7:10:51 AM org.apache.http.impl.client.DefaultRequestDirector tryExecute
INFO: I/O exception (java.net.SocketException) caught when processing request: Software caused connection abort: recv failed
Nov 3, 2012 7:10:51 AM org.apache.http.impl.client.DefaultRequestDirector tryExecute

To resolve this error, install the ie driver to your local and remote systems where the tests will be executed from.

Update 20121102 Roderick Ortega
1. updated selenium version to 2.25.0 due to issue with executing with chromium driver
2. checked in a demo web application implementation and runner template.  to execute page and workflow tests, use the runner in src/test/java.
3. currently, the only testcases i am executing are the using the generic stubbers to validate the process flow.  selenium to follow.
