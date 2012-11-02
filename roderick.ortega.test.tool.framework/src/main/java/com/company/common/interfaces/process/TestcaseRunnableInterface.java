package com.company.common.interfaces.process;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;

public interface TestcaseRunnableInterface {
	public void setWebBrowser(AbstractWebBrowserInterface webBrowser) throws Exception;
	public AbstractWebBrowserInterface getWebBrowser() throws Exception;
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) throws Exception;
	public AbstractGuiWebFactoryInterface getWebFactory() throws Exception;
	public void testcaseSetup() throws Exception;
	public void testcase() throws Exception;
	public void testcaseTeardown() throws Exception;
}
