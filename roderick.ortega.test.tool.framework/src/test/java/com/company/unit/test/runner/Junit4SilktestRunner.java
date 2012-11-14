package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.SilktestWebBrowser;
import com.company.common.concrete.abstracts.test.AbstractRunner;
import com.company.common.interfaces.tools.TestcaseRunnableInterface;
import com.company.common.type.web.silktest.SilktestGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class Junit4SilktestRunner extends AbstractRunner {
	
	private Logger logger = LoggerFactory.getLogger(Junit4SeleniumIeRunner.class);
	private TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("logback.configurationFile", "./logback.xml");
		Junit4SilktestRunner.setWebBrowser(new SilktestWebBrowser());
		Junit4SilktestRunner.setWebFactory(new SilktestGuiWebFactory(Junit4SilktestRunner.getWebBrowser()));
	}
	
	@Before
	public void before() throws Exception {
		logger.info("Executing testcase setup via Silktest Runner");
		testcase = new RunnableLandingPageTestcase(Junit4SilktestRunner.getWebBrowser(),Junit4SilktestRunner.getWebFactory());
		testcase.testcaseSetup();
	}
	
	@Test
	public void test() throws Throwable {
		logger.info("Executing testcase via Silktest Runner");
		try {
			testcase.testcase();
		}
		catch (Throwable e) {
			logger.error("An error was encountered during the testcase execution, recording the event.");
			logger.info(e.getMessage());
			throw e;
		}
	}
	
	@After
	public void after() throws Exception {
		logger.info("Executing testcase teardown via Silktest Runner");
		testcase.testcaseTeardown();
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
}
