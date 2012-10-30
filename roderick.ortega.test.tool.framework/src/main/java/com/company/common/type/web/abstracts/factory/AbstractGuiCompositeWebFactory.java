package com.company.common.type.web.abstracts.factory;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiCompositeWebFactoryInterface;

public abstract class AbstractGuiCompositeWebFactory implements AbstractGuiCompositeWebFactoryInterface, BrowseableInterface {
	private AbstractWebBrowserInterface browser;

	public AbstractWebBrowserInterface getBrowser() {
		System.out.println("AbstractGuiCompositeWebFactory|getBrowser");
		return browser;
	}

	public void setBrowser(AbstractWebBrowserInterface browser) {
		System.out.println("AbstractGuiCompositeWebFactory|setBrowser: " + browser);
		this.browser = browser;
	}
}
