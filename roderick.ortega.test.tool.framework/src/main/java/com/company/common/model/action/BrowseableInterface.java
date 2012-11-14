package com.company.common.model.action;

import com.company.common.model.browser.AbstractWebBrowserInterface;

public interface BrowseableInterface {
	public void setWebBrowser(AbstractWebBrowserInterface browser) throws Exception;
	public AbstractWebBrowserInterface getWebBrowser() throws Exception;
}
