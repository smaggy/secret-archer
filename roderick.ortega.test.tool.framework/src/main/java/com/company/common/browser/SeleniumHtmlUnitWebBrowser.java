package com.company.common.browser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.company.common.interfaces.action.FindableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;

public class SeleniumHtmlUnitWebBrowser extends AbstractSeleniumWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	public SeleniumHtmlUnitWebBrowser() {
		this.setWebDriver(new HtmlUnitDriver());
	}
	
}
