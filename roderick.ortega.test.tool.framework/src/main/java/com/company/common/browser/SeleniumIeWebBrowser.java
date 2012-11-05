package com.company.common.browser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.xml.sax.SAXException;

import com.company.common.concrete.bridges.XmlServerPathBridge;
import com.company.common.interfaces.action.FindableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;

public class SeleniumIeWebBrowser extends AbstractSeleniumWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	public SeleniumIeWebBrowser() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		this.setXmlServerPathBridge(new XmlServerPathBridge(new File("./Resources/SeleniumServerPaths.xml")));
		System.setProperty("webdriver.ie.driver", this.getXmlServerPathBridge().getPath("IeDriverServer"));
		this.setWebDriver(new InternetExplorerDriver());
	}
	
}
