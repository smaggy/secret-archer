package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.MockWebBrowser;
import com.company.common.concrete.abstracts.test.AbstractRunner;
import com.company.common.model.tools.TestcaseRunnableInterface;
import com.company.common.type.web.mock.MockGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableAutoQuoteWorkflowTestcase;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class Junit4MockRunner extends AbstractRunner {
	
	private Logger logger = LoggerFactory.getLogger(Junit4SeleniumIeRunner.class);
	private TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("logback.configurationFile", "./logback.xml");
		Junit4MockRunner.setWebBrowser(new MockWebBrowser());
		Junit4MockRunner.setWebFactory(new MockGuiWebFactory(Junit4MockRunner.getWebBrowser()));
	}
	
	@Before
	public void before() throws Exception {
		logger.info("Executing testcase setup via Mock Runner");
		testcase = new RunnableLandingPageTestcase(Junit4MockRunner.getWebBrowser(),Junit4MockRunner.getWebFactory());
		testcase = new RunnableAutoQuoteWorkflowTestcase(Junit4SeleniumIeRunner.getWebBrowser(),Junit4SeleniumIeRunner.getWebFactory());
		testcase.testcaseSetup();
	}
	
	@Test
	public void test() throws Throwable {
		logger.info("Executing testcase via Mock Runner");
		try {
			testcase.testcase();
		}
		catch (Throwable e) {
			logger.error("An error was encountered during the testcase execution, recording the event.");
			logErrorInformation(e);
			throw e;
		}
	}
	
	@After
	public void after() throws Exception {
		logger.info("Executing testcase teardown via Mock Runner");
		testcase.testcaseTeardown();
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
}
