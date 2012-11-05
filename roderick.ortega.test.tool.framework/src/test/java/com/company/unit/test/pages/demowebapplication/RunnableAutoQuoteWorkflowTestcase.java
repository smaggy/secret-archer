package com.company.unit.test.pages.demowebapplication;

import java.io.File;

import com.company.common.concrete.abstracts.test.AbstractTestcase;
import com.company.common.concrete.bridges.XmlUrlBridge;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.tools.TestcaseRunnableInterface;
import com.company.demowebapplication.business.process.model.AutoQuoteWorkflow;
import com.company.demowebapplication.data.AutomobileInstantQuotePageDto;
import com.company.demowebapplication.data.LandingPageDto;

public class RunnableAutoQuoteWorkflowTestcase extends AbstractTestcase implements TestcaseRunnableInterface {
	
	private XmlUrlBridge xmlUrlBridge;
	private AutoQuoteWorkflow autoQuoteWorkflow;
	
	public RunnableAutoQuoteWorkflowTestcase(AbstractWebBrowserInterface webBrowser, AbstractGuiWebFactoryInterface webFactory) {
		super(webBrowser, webFactory);
	}
	
	@Override
	public void testcaseSetup() throws Exception {
		xmlUrlBridge = new XmlUrlBridge(new File("./Resources/TestUrls.xml"));
		
		autoQuoteWorkflow = new AutoQuoteWorkflow(this.getWebFactory());
		autoQuoteWorkflow.buildPages();
	}

	@Override
	public void testcase() throws Exception {
		this.getWebBrowser().navigate(xmlUrlBridge.getUrl("DemoWebApplication"));
		
		LandingPageDto lpDto = new LandingPageDto();
		lpDto.setEmail("john.smith@gmail.com");
		lpDto.setPassword("john");
		
		AutomobileInstantQuotePageDto aiqpDto = new AutomobileInstantQuotePageDto();
		aiqpDto.setZipCode("45066");
		aiqpDto.setEmail("john.smith@gmail.com");
		aiqpDto.setAutomobileType("car");
		aiqpDto.setAge("40");
		aiqpDto.setGender("Male");
		aiqpDto.setDrivingRecord("Excellent");
		aiqpDto.setYear("1940");
		aiqpDto.setMake("Buick");
		aiqpDto.setModel("Century");
		aiqpDto.setFinancialInfo("Own");
		
		autoQuoteWorkflow.login(lpDto);
		autoQuoteWorkflow.enterDataToForm(aiqpDto);
		// autoQuoteWorkflow.verifySubmittedData(aiqpDto);
		
	}

	@Override
	public void testcaseTeardown() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
