package com.company.unit.test.pages.demowebapplication;

import java.io.File;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.TestcaseRunnableInterface;
import com.company.common.object.helpers.AbstractTestcase;
import com.company.common.object.helpers.XmlUrlBridge;
import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.pages.LandingPageInterface;
import com.company.demowebapplication.pages.LandingPage;

public class RunnableLandingPageTestcase extends AbstractTestcase implements TestcaseRunnableInterface {

	private LandingPageInterface landingPage;
	private XmlUrlBridge xmlUrlBridge;
	
	public RunnableLandingPageTestcase(AbstractWebBrowserInterface webBrowser, AbstractGuiWebFactoryInterface webFactory) {
		super(webBrowser, webFactory);
	}
	
	@Override
	public void testcaseSetup() throws Exception {
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
		// TODO Auto-generated method stub
		
	}

}
