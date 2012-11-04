package com.company.common.browser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

import com.company.common.interfaces.action.FindableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;

public class SeleniumChromeWebBrowser extends AbstractSeleniumWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	public SeleniumChromeWebBrowser() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		this.setXmlServerPathBridge(new XmlServerPathBridge(new File("./Resources/SeleniumServerPaths.xml")));
		System.setProperty("webdriver.chrome.driver", this.getXmlServerPathBridge().getPath("ChromeDriver"));
		this.setWebDriver(new ChromeDriver());
	}
	
}
