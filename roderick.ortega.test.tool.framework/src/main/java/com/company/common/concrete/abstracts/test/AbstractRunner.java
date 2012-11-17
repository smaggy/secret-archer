package com.company.common.concrete.abstracts.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;

public abstract class AbstractRunner {
	
	private Logger logger = LoggerFactory.getLogger(AbstractRunner.class);
	
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
	
	public void logErrorInformation(Throwable e) {
		
		String exceptionInformation = System.getProperty("line.separator");
		StackTraceElement[] elements = e.getStackTrace();
		
		exceptionInformation += e.getMessage() + System.getProperty("line.separator");
		for (StackTraceElement element : elements) {
			exceptionInformation += element + System.getProperty("line.separator");
		}
		
		logger.error(exceptionInformation);
	}
	
}
