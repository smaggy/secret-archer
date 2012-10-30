package com.company.unit.test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiCompositeWebFactoryInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.type.web.generics.GenericGuiWebFactory;
import com.company.common.type.web.generics.GenericWebBrowser;
import com.company.common.type.web.generics.composite.GenericGuiCompositeWebFactory;


public class Runner {
	
	private AbstractGuiCompositeWebFactoryInterface guiCompositeWebFactory;
	private AbstractGuiWebFactoryInterface guiWebFactory;
	private AbstractWebBrowserInterface webBrowser;
	
	@BeforeClass
	public void beforeClass() {
		
	}
	@Before
	public void before() {
		guiWebFactory = new GenericGuiWebFactory();
		guiCompositeWebFactory = new GenericGuiCompositeWebFactory();
		webBrowser = new GenericWebBrowser();
		
		guiWebFactory.setBrowser(webBrowser);
		guiCompositeWebFactory.setBrowser(webBrowser);
		
		System.out.println("==== new test ====");
	}
	@Test
	public void test01() {
		
	}
	@After
	public void after() {
		
	}
	@AfterClass
	public void afterClass() {
		
	}
}
