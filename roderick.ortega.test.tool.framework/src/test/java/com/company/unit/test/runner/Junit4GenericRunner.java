package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.browser.GenericWebBrowser;
import com.company.common.concrete.abstracts.test.AbstractRunner;
import com.company.common.interfaces.tools.TestcaseRunnableInterface;
import com.company.common.type.web.generics.GenericGuiWebFactory;
import com.company.unit.test.pages.demowebapplication.RunnableLandingPageTestcase;

public class Junit4GenericRunner extends AbstractRunner {
	
	private TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() {
		Junit4GenericRunner.setWebBrowser(new GenericWebBrowser());
		Junit4GenericRunner.setWebFactory(new GenericGuiWebFactory(Junit4GenericRunner.getWebBrowser()));
	}
	
	@Before
	public void before() throws Exception {
		testcase = new RunnableLandingPageTestcase(Junit4GenericRunner.getWebBrowser(),Junit4GenericRunner.getWebFactory());
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
