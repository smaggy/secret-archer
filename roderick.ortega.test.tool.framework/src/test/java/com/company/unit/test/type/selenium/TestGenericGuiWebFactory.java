package com.company.unit.test.type.selenium;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.frame.XmlFrameBridge;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.object.helpers.XmlUrlBridge;
import com.company.common.type.web.selenium.SeleniumGuiWebFactory;
import com.company.common.types.FrameParameters;

public class TestGenericGuiWebFactory {
	
	private static AbstractGuiWebFactoryInterface guiWebFactory;
	private static AbstractWebBrowserInterface webBrowser;
	private static XmlUrlBridge xmlUrlBridge;
	private static XmlFrameBridge testAutomationFrame;
	
	@BeforeClass
	public static void beforeClass() throws ParserConfigurationException, SAXException, IOException {
		guiWebFactory = new SeleniumGuiWebFactory();
		SeleniumWebBrowser seleniumWebBrowser = new SeleniumWebBrowser();
		webBrowser = seleniumWebBrowser;
		guiWebFactory.setBrowser(webBrowser);
		
		xmlUrlBridge = new XmlUrlBridge(new File("./Resources/TestUrls.xml"));
		testAutomationFrame = new XmlFrameBridge(new File("./Resources/Frames/TestAutomation.xml"));
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
	
	@AfterClass
	public static void afterClass() {
		// webBrowser.close();
	}
}
