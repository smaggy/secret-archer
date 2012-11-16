package com.company.common.model.factory;

import com.company.common.model.browser.AbstractWebBrowserInterface;

public interface AbstractWebBrowserFactoryInterface {
	public AbstractWebBrowserInterface createIeWebBrowser() throws Exception;
	public AbstractWebBrowserInterface createFirefoxWebBrowser() throws Exception;
	public AbstractWebBrowserInterface createChromeWebBrowser() throws Exception;
	public AbstractWebBrowserInterface createHtmlUnitWebBrowser() throws Exception;
	public AbstractWebBrowserInterface createMockWebBrowser() throws Exception;
}
