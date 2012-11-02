package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.interfaces.process.TestcaseRunnableInterface;
import com.company.unit.test.silktest.pages.demowebapplication.generic.TestLandingPage;

public class Runner {
	
	private static TestcaseRunnableInterface testcase;
	
	@BeforeClass
	public static void beforeClass() {
		testcase = new TestLandingPage();
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
