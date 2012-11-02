package com.company.unit.test.type.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.xml.sax.SAXException;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.frame.XmlFrameBridge;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.object.helpers.XmlUrlBridge;
import com.company.common.type.web.selenium.SeleniumGuiWebFactory;
import com.company.common.types.FrameParameters;
import com.company.common.types.Locator;

public class TestSeleniumGuiWebFactory {
	
	private static AbstractGuiWebFactoryInterface guiWebFactory;
	private static AbstractWebBrowserInterface webBrowser;
	private static XmlUrlBridge xmlUrlBridge;
	private static XmlFrameBridge testAutomationFrame;
	private static XmlFrameBridge demoWebApplication;
	
	@BeforeClass
	public static void beforeClass() throws ParserConfigurationException, SAXException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/software/ChromiumDriver/chromedriver.exe"); 

		WebDriver webDriver = new HtmlUnitDriver();
		
		guiWebFactory = new SeleniumGuiWebFactory();
		SeleniumWebBrowser seleniumWebBrowser = new SeleniumWebBrowser();
		seleniumWebBrowser.setWebDriver(webDriver);
		webBrowser = seleniumWebBrowser;
		guiWebFactory.setBrowser(webBrowser);
		xmlUrlBridge = new XmlUrlBridge(new File("./Resources/TestUrls.xml"));
		testAutomationFrame = new XmlFrameBridge(new File("./Resources/Frames/TestAutomation.xml"));
		demoWebApplication = new XmlFrameBridge(new File("./Resources/Frames/DemoWebApplication.xml"));
	}
	
	@Before
	public void before() {
		System.out.println("==== new test ====");
	}
	
	@Test
	public void test01() throws Exception {
		webBrowser.navigate(xmlUrlBridge.getUrl("Resources"));
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToTextFields"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToText"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToCheckBoxes"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToButtons"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToRadioButtons"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToLinks"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToListBoxes"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToTables"))).select();
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToNestedFormsAndControls"))).select();
	}
	
	@Test
	public void test02() throws Exception {
		webBrowser.navigate(xmlUrlBridge.getUrl("DemoWebApplication"));
		guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "Email"))).setText("john.smith@gmail.com");
		guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "Password"))).setText("john");
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "LoginButton"))).select();
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "LogoutButton"))).select();
	}
	
	@Test
	public void test03() throws Exception {
		webBrowser.navigate(xmlUrlBridge.getUrl("DemoWebApplication"));
		guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "Email"))).setText("john.smith@gmail.com");
		guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "Password"))).setText("john");
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "LoginButton"))).select();
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "LoggedInUserDetails"))).select();
		
		String username = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AccountDetailsPage", "UserFullName"))).getText();
		System.out.println("Username= [" + username + "]");
		String contactInformation = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AccountDetailsPage", "ContactInformation"))).getText();
		System.out.println("ContactInformation= [" + contactInformation + "]");
		
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("TopNavigation", "Home"))).select();
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "LogoutButton"))).select();
	}
	
	@Test
	public void test04() throws Exception {
		webBrowser.navigate(xmlUrlBridge.getUrl("DemoWebApplication"));
		guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "Email"))).setText("john.smith@gmail.com");
		guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "Password"))).setText("john");
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "LoginButton"))).select();
		
		guiWebFactory.createWebListBox(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "ServiceSelector"))).select("Auto Quote");
		
		// needed a sleep because going faster than browser could load
		Thread.sleep(4000);
		
		String zipCode = guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ZipCode"))).getDomAttribute("value");
		System.out.println("ZipCode= [" + zipCode + "]");
		String eMail = guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "Email"))).getDomAttribute("value");
		System.out.println("Email= [" + eMail + "]");
		
		guiWebFactory.createWebRadioButton(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "AutomobileTypeCar"))).select();
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "NextButton"))).select();
		
		String age = guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "Age"))).getDomAttribute("value");
		System.out.println("Age= [" + age + "]");
		
		guiWebFactory.createWebRadioButton(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "GenderMale"))).select();
		guiWebFactory.createWebRadioButton(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "DrivingRecordExcellent"))).select();
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "NextButton"))).select();
		
		// needed a sleep because going faster than page could load
		Thread.sleep(1000);
		
		String year = guiWebFactory.createWebTextField(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "Year"))).getDomAttribute("value");
		System.out.println("Year= [" + year + "]");
		
		guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "MakeArrowDown"))).click();
		
		// needed a sleep because going faster than list could load
		Thread.sleep(1000);
		
		String expandedMakeLocator = demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "MakeDivWrapper")).getXPathLocator() + "/DIV";
		List<AbstractWebElementInterface> makeElements = webBrowser.findAllWebElements(new Locator(expandedMakeLocator));
		makeElements.get(0).click();
		
		guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ModelArrowDown"))).click();
		
		// needed a sleep because going faster than list could load
		Thread.sleep(1000);
		
		String expandedModelLocator = demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ModelDivWrapper")).getXPathLocator() + "/DIV";
		List<AbstractWebElementInterface> modelElements = webBrowser.findAllWebElements(new Locator(expandedModelLocator));
		modelElements.get(0).click();
		
		guiWebFactory.createWebRadioButton(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "FinancialInfoOwn"))).select();
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "NextButton"))).select();
		
		String resultZipCode = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultZipCode"))).getText();
		String resultAge = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultAge"))).getText();
		String resultGender = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultGender"))).getText();
		String resultDrivingRecord = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultDrivingRecord"))).getText();
		String resultautomobileType = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultAutomobileType"))).getText();
		String resultYear = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultAutomobileYear"))).getText();
		String resultMake = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultAutomobileMake"))).getText();
		String resultModel = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultAutomobileModel"))).getText();
		String resultFinancialInfo = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultFinancialInfo"))).getText();
		String resultInstantQuote = guiWebFactory.createWebElement(demoWebApplication.getTestObjectLocator(new FrameParameters("AutomobileInstantQuote", "ResultInstantQuote"))).getText();
		
		System.out.println("resultZipCode= [" + resultZipCode + "]");
		System.out.println("resultAge= [" + resultAge + "]");
		System.out.println("resultGender= [" + resultGender + "]");
		System.out.println("resultDrivingRecord= [" + resultDrivingRecord + "]");
		System.out.println("resultautomobileType= [" + resultautomobileType + "]");
		System.out.println("resultYear= [" + resultYear + "]");
		System.out.println("resultMake= [" + resultMake + "]");
		System.out.println("resultModel= [" + resultModel + "]");
		System.out.println("resultFinancialInfo= [" + resultFinancialInfo + "]");
		System.out.println("resultInstantQuote= [" + resultInstantQuote + "]");
		
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("TopNavigation", "Home"))).select();
		guiWebFactory.createWebButton(demoWebApplication.getTestObjectLocator(new FrameParameters("LoginPage", "LogoutButton"))).select();
	}
	
	@Test
	public void test05() throws Exception {
		webBrowser.navigate(xmlUrlBridge.getUrl("Resources"));
		guiWebFactory.createWebLink(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "NavToTables"))).select();
		int i = guiWebFactory.createWebTable(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "Table01"))).getColumnCount();
		int j = guiWebFactory.createWebTable(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "Table01"))).getRowCount();
		List<List<String>> table = guiWebFactory.createWebTable(testAutomationFrame.getTestObjectLocator(new FrameParameters("TestAutomationPage", "Table01"))).getTableText();
		System.out.println("TotalColumnCount: " + i);
		System.out.println("TotalRowCount: " + j);
		System.out.println("TableContents: " + table);
	}
	
	@AfterClass
	public static void afterClass() {
		// webBrowser.close();
	}
}
