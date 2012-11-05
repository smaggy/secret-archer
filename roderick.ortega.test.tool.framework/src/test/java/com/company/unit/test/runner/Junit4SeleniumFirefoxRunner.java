package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.browser.SeleniumFirefoxWebBrowser;
import com.company.common.concrete.abstracts.test.AbstractRunner;
import com.company.common.interfaces.tools.TestcaseRunnableInterface;
import com.company.common.type.web.selenium.SeleniumGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class Junit4SeleniumFirefoxRunner extends AbstractRunner {
	
	private TestcaseRunnableInterface testcase;

	@BeforeClass
	public static void beforeClass() throws Exception {
		Junit4SeleniumIeRunner.setWebBrowser(new SeleniumFirefoxWebBrowser());
		Junit4SeleniumIeRunner.setWebFactory(new SeleniumGuiWebFactory(Junit4SeleniumIeRunner.getWebBrowser()));
	}
	
	@Before
	public void before() throws Exception {
		testcase = new RunnableLandingPageTestcase(Junit4SeleniumIeRunner.getWebBrowser(),Junit4SeleniumIeRunner.getWebFactory());
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
