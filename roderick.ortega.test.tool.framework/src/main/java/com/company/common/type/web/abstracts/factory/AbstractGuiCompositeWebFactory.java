package com.company.common.type.web.abstracts.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiCompositeWebFactoryInterface;

public abstract class AbstractGuiCompositeWebFactory implements AbstractGuiCompositeWebFactoryInterface, BrowseableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(AbstractGuiCompositeWebFactory.class);
	private AbstractWebBrowserInterface browser;

	public AbstractWebBrowserInterface getWebBrowser() {
		logger.debug("AbstractGuiCompositeWebFactory|getBrowser");
		return browser;
	}

	public void setWebBrowser(AbstractWebBrowserInterface browser) {
		logger.debug("AbstractGuiCompositeWebFactory|setBrowser: " + browser);
		this.browser = browser;
	}
}
