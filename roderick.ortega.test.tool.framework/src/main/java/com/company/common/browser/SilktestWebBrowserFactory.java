package com.company.common.browser;

import java.io.File;

import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractWebBrowserFactoryInterface;

public class SilktestWebBrowserFactory implements
		AbstractWebBrowserFactoryInterface {

	@Override
	public AbstractWebBrowserInterface createIeWebBrowser() {
		return new SilktestWebBrowser(new File("./Resources/Properties/silk4j.internet.explorer.settings"));
	}

	@Override
	public AbstractWebBrowserInterface createFirefoxWebBrowser() {
		return new SilktestWebBrowser(new File("./Resources/Properties/silk4j.firefox.settings"));
	}

	@Override
	public AbstractWebBrowserInterface createChromeWebBrowser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebBrowserInterface createHtmlUnitWebBrowser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebBrowserInterface createMockWebBrowser() {
		// TODO Auto-generated method stub
		return null;
	}

}
