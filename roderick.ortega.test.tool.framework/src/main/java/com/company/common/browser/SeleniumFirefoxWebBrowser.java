package com.company.common.browser;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.company.common.interfaces.action.FindableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;

public class SeleniumFirefoxWebBrowser extends AbstractSeleniumWebBrowser implements AbstractWebBrowserInterface, FindableInterface {
	
	public SeleniumFirefoxWebBrowser() {
		this.setWebDriver(new FirefoxDriver());
	}
	
}
