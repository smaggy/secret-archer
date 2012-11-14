package com.company.common.concrete.abstracts.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.model.tools.TestcaseRunnableInterface;

public abstract class AbstractTestcase implements TestcaseRunnableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(AbstractTestcase.class);
	
	private AbstractGuiWebFactoryInterface webFactory;
	private AbstractWebBrowserInterface webBrowser;
	
	public AbstractTestcase(AbstractWebBrowserInterface webBrowser, AbstractGuiWebFactoryInterface webFactory) {
		this.webBrowser = webBrowser;
		this.webFactory = webFactory;
	}
	
	@Override
	public AbstractWebBrowserInterface getWebBrowser() throws Exception {
		return this.webBrowser;
	}
	
	@Override
	public void setWebBrowser(AbstractWebBrowserInterface webBrowser) throws Exception {
		this.webBrowser = webBrowser;
	}

	@Override
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) throws Exception {
		this.webFactory = webFactory;
	}
	
	@Override
	public AbstractGuiWebFactoryInterface getWebFactory() throws Exception {
		return this.webFactory;
	}
}
