package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.SilktestWebBrowserFactory;
import com.company.common.model.tools.TestcaseRunnableInterface;
import com.company.common.type.web.silktest.SilktestGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class Junit4SilktestFirefoxRunner {
	private Logger logger = LoggerFactory.getLogger(Junit4SilktestFirefoxRunner.class);
	private TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() {
		SilktestWebBrowserFactory silktestWebBrowserFactory = new SilktestWebBrowserFactory();
		System.setProperty("logback.configurationFile", "./logback.xml");
		Junit4SilktestIeRunner.setWebBrowser(silktestWebBrowserFactory.createFirefoxWebBrowser());
		Junit4SilktestIeRunner.setWebFactory(new SilktestGuiWebFactory(Junit4SilktestIeRunner.getWebBrowser()));
	}
	
	@Before
	public void before() throws Exception {
		logger.info("Executing testcase setup via Silktest Firefox Runner");
		testcase = new RunnableLandingPageTestcase(Junit4SilktestIeRunner.getWebBrowser(),Junit4SilktestIeRunner.getWebFactory());
		testcase.testcaseSetup();
	}
	
	@Test
	public void test() throws Throwable {
		logger.info("Executing testcase via Silktest Firefox Runner");
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
		logger.info("Executing testcase teardown via Silktest Firefox Runner");
		testcase.testcaseTeardown();
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
}
