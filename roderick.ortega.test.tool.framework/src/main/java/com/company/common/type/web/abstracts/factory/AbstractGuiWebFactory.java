package com.company.common.type.web.abstracts.factory;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;

public abstract class AbstractGuiWebFactory implements AbstractGuiWebFactoryInterface, BrowseableInterface {
	
	private AbstractWebBrowserInterface browser;
	
	public AbstractGuiWebFactory(AbstractWebBrowserInterface webBrowser) {
		this.setBrowser(webBrowser);
	}

	public AbstractWebBrowserInterface getBrowser() {
		System.out.println("AbstractGuiWebFactory|getBrowser");
		return browser;
	}

	public void setBrowser(AbstractWebBrowserInterface browser) {
		System.out.println("AbstractGuiWebFactory|setBrowser: " + browser);
		this.browser = browser;
	}
	
}
