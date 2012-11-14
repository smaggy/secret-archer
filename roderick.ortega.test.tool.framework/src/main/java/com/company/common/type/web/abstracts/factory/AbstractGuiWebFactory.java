package com.company.common.type.web.abstracts.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.BrowseableInterface;
import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;

public abstract class AbstractGuiWebFactory implements AbstractGuiWebFactoryInterface, BrowseableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(AbstractGuiWebFactory.class);
	
	private AbstractWebBrowserInterface browser;
	
	public AbstractGuiWebFactory(AbstractWebBrowserInterface webBrowser) {
		this.setWebBrowser(webBrowser);
	}

	public AbstractWebBrowserInterface getWebBrowser() {
		logger.debug("AbstractGuiWebFactory|getBrowser");
		return browser;
	}

	public void setWebBrowser(AbstractWebBrowserInterface browser) {
		logger.debug("AbstractGuiWebFactory|setBrowser: " + browser);
		this.browser = browser;
	}
	
}
