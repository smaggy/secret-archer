package com.company.common.concrete.abstracts.test;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.tools.TestcaseRunnableInterface;

public abstract class AbstractTestcase implements TestcaseRunnableInterface {
	
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
