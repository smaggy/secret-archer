package com.company.common.concrete.abstracts.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.model.tools.TestcaseRunnableInterface;

public abstract class AbstractTestcase implements TestcaseRunnableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(AbstractTestcase.class);
	
	private AbstractGuiWebFactoryInterface webFactory;
	private AbstractWebBrowserInterface webBrowser;
	private String testcaseTitle;
	private String testcasePurpose;
	private String testcaseDescription;
	
	public AbstractTestcase(AbstractWebBrowserInterface webBrowser, AbstractGuiWebFactoryInterface webFactory) {
		this.webBrowser = webBrowser;
		this.webFactory = webFactory;
	}
	
	@Override
	public AbstractWebBrowserInterface getWebBrowser() throws Exception {
		return this.webBrowser;
	}
	
	@Override
	public void setWebBrowser(AbstractWebBrowserInterface webBrowser) throws Exception {
		this.webBrowser = webBrowser;
	}

	@Override
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) throws Exception {
		this.webFactory = webFactory;
	}
	
	@Override
	public AbstractGuiWebFactoryInterface getWebFactory() throws Exception {
		return this.webFactory;
	}

	public String getTestcaseTitle() {
		return testcaseTitle;
	}

	public void setTestcaseTitle(String testcaseTitle) {
		this.testcaseTitle = testcaseTitle;
	}

	public String getTestcasePurpose() {
		return testcasePurpose;
	}

	public void setTestcasePurpose(String testcasePurpose) {
		this.testcasePurpose = testcasePurpose;
	}

	public String getTestcaseDescription() {
		return testcaseDescription;
	}

	public void setTestcaseDescription(String testcaseDescription) {
		this.testcaseDescription = testcaseDescription;
	}
	
	public void logTestcaseInformation() {
		
		String testcaseInformation = System.getProperty("line.separator");
		testcaseInformation += " ==================================================================================== " + System.getProperty("line.separator");
		testcaseInformation += " ===== Title: " + this.getTestcaseTitle() + System.getProperty("line.separator");
		testcaseInformation += " ===== Purpose: " + this.getTestcasePurpose() + System.getProperty("line.separator");
		testcaseInformation += " ===== Description: " + this.getTestcaseDescription() + System.getProperty("line.separator");
		testcaseInformation += " ==================================================================================== ";
		
		logger.info(testcaseInformation);
		
	}
}
