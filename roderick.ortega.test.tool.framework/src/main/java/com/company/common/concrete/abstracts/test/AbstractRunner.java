package com.company.common.concrete.abstracts.test;

import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;

public class AbstractRunner {
	
	private static AbstractWebBrowserInterface webBrowser;
	private static AbstractGuiWebFactoryInterface webFactory;
	
	public static AbstractWebBrowserInterface getWebBrowser() {
		return webBrowser;
	}
	
	public static void setWebBrowser(AbstractWebBrowserInterface webBrowser) {
		AbstractRunner.webBrowser = webBrowser;
	}
	
	public static AbstractGuiWebFactoryInterface getWebFactory() {
		return webFactory;
	}
	
	public static void setWebFactory(AbstractGuiWebFactoryInterface webFactory) {
		AbstractRunner.webFactory = webFactory;
	}
	
}
