package com.company.unit.test.pages.demowebapplication;

import com.company.common.concrete.abstracts.test.AbstractTestcase;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.tools.SuiteRunnableInterface;

public class SuiteRunnable extends AbstractTestcase implements SuiteRunnableInterface {

	public SuiteRunnable(AbstractWebBrowserInterface webBrowser, AbstractGuiWebFactoryInterface webFactory) {
		super(webBrowser, webFactory);
	}

	@Override
	public void testcaseSetup() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testcase() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testcaseTeardown() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suiteSetup() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suiteTeardown() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
