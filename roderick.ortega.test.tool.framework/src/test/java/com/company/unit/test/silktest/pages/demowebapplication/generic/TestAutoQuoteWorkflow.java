package com.company.unit.test.silktest.pages.demowebapplication.generic;

import java.io.File;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.TestcaseRunnableInterface;
import com.company.common.object.helpers.XmlUrlBridge;
import com.company.common.type.web.generics.GenericGuiWebFactory;
import com.company.common.type.web.generics.GenericWebBrowser;
import com.company.demowebapplication.business.process.model.AutoQuoteWorkflow;
import com.company.demowebapplication.data.AutomobileInstantQuotePageDto;
import com.company.demowebapplication.data.LandingPageDto;

public class TestAutoQuoteWorkflow implements TestcaseRunnableInterface {

	private AbstractGuiWebFactoryInterface webFactory;
	private AbstractWebBrowserInterface webBrowser;
	private XmlUrlBridge xmlUrlBridge;
	private AutoQuoteWorkflow autoQuoteWorkflow;
	
	@Override
	public void testcaseSetup() throws Exception {
		webBrowser = new GenericWebBrowser();
		webFactory = new GenericGuiWebFactory(webBrowser);
		xmlUrlBridge = new XmlUrlBridge(new File("./Resources/TestUrls.xml"));
		
		autoQuoteWorkflow = new AutoQuoteWorkflow(webFactory);
		autoQuoteWorkflow.buildPages();
	}

	@Override
	public void testcase() throws Exception {
		webBrowser.navigate(xmlUrlBridge.getUrl("DemoWebApplication"));
		
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
		autoQuoteWorkflow.verifySubmittedData(aiqpDto);
		
	}

	@Override
	public void testcaseTeardown() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
