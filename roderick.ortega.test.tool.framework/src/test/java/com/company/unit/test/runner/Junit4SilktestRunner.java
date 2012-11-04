package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.tools.TestcaseRunnableInterface;
import com.company.common.type.web.silktest.SilktestGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class Junit4SilktestRunner extends AbstractRunner {
	
	private TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() {
		Junit4SilktestRunner.setWebBrowser(new SilktestWebBrowser());
		Junit4SilktestRunner.setWebFactory(new SilktestGuiWebFactory(Junit4SilktestRunner.getWebBrowser()));
	}
	
	@Before
	public void before() throws Exception {
		testcase = new RunnableLandingPageTestcase(Junit4SilktestRunner.getWebBrowser(),Junit4SilktestRunner.getWebFactory());
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
