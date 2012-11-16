package com.company.common.browser;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractWebBrowserFactoryInterface;

public class SeleniumWebBrowserFactory implements
		AbstractWebBrowserFactoryInterface {

	@Override
	public AbstractWebBrowserInterface createIeWebBrowser() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		return new SeleniumIeWebBrowser();
	}

	@Override
	public AbstractWebBrowserInterface createFirefoxWebBrowser() {
		return new SeleniumFirefoxWebBrowser();
	}

	@Override
	public AbstractWebBrowserInterface createChromeWebBrowser() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		return new SeleniumChromeWebBrowser();
	}

	@Override
	public AbstractWebBrowserInterface createHtmlUnitWebBrowser() {
		return new SeleniumHtmlUnitWebBrowser();
	}

	@Override
	public AbstractWebBrowserInterface createMockWebBrowser() {
		return new MockWebBrowser();
	}

}
