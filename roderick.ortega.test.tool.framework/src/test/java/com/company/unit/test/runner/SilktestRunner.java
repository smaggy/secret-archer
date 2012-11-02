package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.TestcaseRunnableInterface;
import com.company.common.type.web.silktest.SilktestGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class SilktestRunner {
	
	private static AbstractWebBrowserInterface webBrowser;
	private static AbstractGuiWebFactoryInterface webFactory;
	private static TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() {
		
		webBrowser = new SilktestWebBrowser();
		webFactory = new SilktestGuiWebFactory(webBrowser);
		
		testcase = new RunnableLandingPageTestcase(webBrowser, webFactory);
		// testcase = new RunnableAutoQuoteWorkflowTestcase(webBrowser, webFactory);
		
	}
	
	@Before
	public void before() throws Exception {
		testcase.testcaseSetup();
	}
	
	@Test
	public void test() throws Exception {
		testcase.testcase();
	}
	
	@After
	public void after() throws Exception {
		testcase.testcaseTeardown();
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
}
