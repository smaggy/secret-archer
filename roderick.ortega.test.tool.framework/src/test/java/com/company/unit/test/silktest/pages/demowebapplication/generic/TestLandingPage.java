package com.company.unit.test.silktest.pages.demowebapplication.generic;

import java.io.File;

import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.TestcaseRunnableInterface;
import com.company.common.object.helpers.XmlUrlBridge;
import com.company.common.type.web.generics.GenericGuiWebFactory;
import com.company.common.type.web.generics.GenericWebBrowser;
import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.pages.LandingPageInterface;
import com.company.demowebapplication.pages.LandingPage;

public class TestLandingPage implements TestcaseRunnableInterface {

	private LandingPageInterface landingPage;
	private AbstractGuiWebFactoryInterface webFactory;
	private AbstractWebBrowserInterface webBrowser;
	private XmlUrlBridge xmlUrlBridge;
	
	@Override
	public void testcaseSetup() throws Exception {
		webBrowser = new GenericWebBrowser();
		webFactory = new GenericGuiWebFactory(webBrowser);
		xmlUrlBridge = new XmlUrlBridge(new File("./Resources/TestUrls.xml"));
		
		landingPage = new LandingPage(new File("./Resources/Frames/DemoWebApplication.xml"));
		landingPage.setWebFactory(webFactory);
	}

	@Override
	public void testcase() throws Exception {
		DataTransferObject dto = new DataTransferObject();
		dto.getLandingPageDto().setEmail("john.smith@gmail.com");
		dto.getLandingPageDto().setPassword("john");
		
		landingPage.setDto(dto);
		
		webBrowser.navigate(xmlUrlBridge.getUrl("DemoWebApplication"));
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
