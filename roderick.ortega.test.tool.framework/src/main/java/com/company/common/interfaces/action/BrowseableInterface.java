package com.company.common.interfaces.action;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;

public interface BrowseableInterface {
	public void setBrowser(AbstractWebBrowserInterface browser);
	public AbstractWebBrowserInterface getBrowser();
}
