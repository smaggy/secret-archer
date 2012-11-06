package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.SeleniumIeWebBrowser;
import com.company.common.concrete.abstracts.test.AbstractRunner;
import com.company.common.interfaces.tools.TestcaseRunnableInterface;
import com.company.common.type.web.selenium.SeleniumGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableAutoQuoteWorkflowTestcase;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class Junit4SeleniumIeRunner extends AbstractRunner {
	
	private Logger logger = LoggerFactory.getLogger(Junit4SeleniumIeRunner.class);
	private TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		System.setProperty("logback.configurationFile", "./logback.xml");
		Junit4SeleniumIeRunner.setWebBrowser(new SeleniumIeWebBrowser());
		Junit4SeleniumIeRunner.setWebFactory(new SeleniumGuiWebFactory(Junit4SeleniumIeRunner.getWebBrowser()));
	}
	
	@Before
	public void before() throws Exception {
		logger.info("executing testcase setup via Selenium Ie Runner");
		testcase = new RunnableLandingPageTestcase(Junit4SeleniumIeRunner.getWebBrowser(),Junit4SeleniumIeRunner.getWebFactory());
		testcase = new RunnableAutoQuoteWorkflowTestcase(Junit4SeleniumIeRunner.getWebBrowser(),Junit4SeleniumIeRunner.getWebFactory());
		testcase.testcaseSetup();
	}
	
	@Test
	public void test() throws Exception {
		logger.info("executing testcase via Selenium Ie Runner");
		testcase.testcase();
	}
	
	@After
	public void after() throws Exception {
		logger.info("executing testcase teardown via Selenium Ie Runner");
		testcase.testcaseTeardown();
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
}
