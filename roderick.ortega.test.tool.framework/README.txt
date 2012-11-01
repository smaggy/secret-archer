Roderick Ortega
Springboro, Ohio
11/1/2012

Setup and Tool Information
Windows 7 Enterprise Edition
Maven: Version 3.0.4
Java: JDK Version 1.6.0.35
Ant: Version 1.8.4
Silktest: Version 2011 HF3
Selenium: WebDriver Version 2.23.1
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