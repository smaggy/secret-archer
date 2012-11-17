package com.company.unit.test.pages.demowebapplication;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.concrete.abstracts.test.AbstractTestcase;
import com.company.common.concrete.bridges.XmlUrlBridge;
import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.model.tools.TestcaseRunnableInterface;
import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.pages.LandingPageInterface;
import com.company.demowebapplication.pages.LandingPage;

public class RunnableLandingPageTestcase extends AbstractTestcase implements TestcaseRunnableInterface {

	final static Logger logger = LoggerFactory.getLogger(RunnableLandingPageTestcase.class);
	
	private LandingPageInterface landingPage;
	private XmlUrlBridge xmlUrlBridge;
	
	public RunnableLandingPageTestcase(AbstractWebBrowserInterface webBrowser, AbstractGuiWebFactoryInterface webFactory) {
		super(webBrowser, webFactory);
	}
	
	@Override
	public void testcaseSetup() throws Exception {
		
		this.setTestcaseTitle("RunnableLandingPageTestcase");
		this.setTestcasePurpose("Performs actions on the microfocus demo web application.");
		this.setTestcaseDescription("Tests the overall workflow and type factories.");
		logTestcaseInformation();
		
		xmlUrlBridge = new XmlUrlBridge(new File("./Resources/TestUrls.xml"));
		landingPage = new LandingPage(new File("./Resources/Frames/DemoWebApplication.xml"), this.getWebFactory());
	}

	@Override
	public void testcase() throws Exception {
		DataTransferObject dto = new DataTransferObject();
		dto.getLandingPageDto().setEmail("john.smith@gmail.com");
		dto.getLandingPageDto().setPassword("john");
		
		landingPage.setDto(dto);
		
		this.getWebBrowser().navigate(xmlUrlBridge.getUrl("DemoWebApplication"));
		landingPage.setEmail(null);
		landingPage.setPassword(null);
		landingPage.selectLoginButton();
		landingPage.selectLogOutButton();
	}

	@Override
	public void testcaseTeardown() throws Exception {
		getWebBrowser().close();
	}

}
