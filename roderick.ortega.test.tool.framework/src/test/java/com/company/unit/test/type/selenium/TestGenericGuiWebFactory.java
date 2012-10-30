package com.company.unit.test.type.selenium;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.type.web.selenium.SeleniumGuiWebFactory;
import com.company.common.types.Locator;
import com.company.common.types.Url;

public class TestGenericGuiWebFactory {
	
	private static AbstractGuiWebFactoryInterface guiWebFactory;
	private static AbstractWebBrowserInterface webBrowser;
	private static WebDriver webDriver;
	
	@BeforeClass
	public static void beforeClass() {
		guiWebFactory = new SeleniumGuiWebFactory();
		SeleniumWebBrowser seleniumWebBrowser = new SeleniumWebBrowser();
		webDriver = seleniumWebBrowser.getWebDriver();
		webBrowser = seleniumWebBrowser;
		guiWebFactory.setBrowser(webBrowser);
	}
	
	@Before
	public void before() {
		System.out.println("==== new test ====");
	}
	
	@Test
	public void test01() {
		System.out.println("#### new test [weblinks] ####");
		Url testUrl = new Url("http://resources.qa.medplus.com/PortalAutomation/default.html");
		webBrowser.navigate(testUrl);
		guiWebFactory.createWebLink(new Locator("//A[@id='nav_textfields']")).select();
		webBrowser.navigate(testUrl);
		guiWebFactory.createWebLink(new Locator("//A[@id='nav_radiobuttons']")).select();
		webBrowser.navigate(testUrl);
		guiWebFactory.createWebLink(new Locator("//A[@id='nav_tables']")).select();
	}
	
	@Test
	public void test02() {
		System.out.println("#### new test [buttons] ####");
		Url testUrl = new Url("http://resources.qa.medplus.com/PortalAutomation/default.html");
		webBrowser.navigate(testUrl);
		guiWebFactory.createWebButton(new Locator("//DIV[@id='dialogBoxes']//BUTTON[@id='button_id01']")).select();
		
		webDriver.switchTo().alert().accept();
		System.out.println(webDriver.getWindowHandles());
		guiWebFactory.createWebButton(new Locator("//DIV[@id='dialogBoxes']//BUTTON[@id='button_id01']")).select();
		webDriver.switchTo().alert().accept();
		System.out.println(webDriver.getWindowHandles());
	}
	
	@AfterClass
	public static void afterClass() {
		// webBrowser.close();
	}
}
