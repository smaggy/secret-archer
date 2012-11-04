package com.company.common.interfaces.action;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;

public interface BrowseableInterface {
	public void setWebBrowser(AbstractWebBrowserInterface browser) throws Exception;
	public AbstractWebBrowserInterface getWebBrowser() throws Exception;
}
