package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.types.FrameParameters;
import com.company.demowebapplication.enums.ServiceTypeEnum;
import com.company.demowebapplication.interfaces.pages.AbstractSitePageInterface;
import com.company.demowebapplication.interfaces.pages.SiteFooterNavigationInterface;
import com.company.demowebapplication.interfaces.pages.SiteTopNavigationInterface;

public abstract class AbstractSiteInteriorPage extends AbstractSitePage implements AbstractSitePageInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {

	public AbstractSiteInteriorPage(File frameFile, AbstractGuiWebFactoryInterface webFactory) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile, webFactory);
	}

	@Override
	public void selectHomeButton() throws Exception {
		getWebFactory().createWebButton(getLocator(new FrameParameters("SiteTopNavigation","Home"))).select();
	}

	@Override
	public void selectAccountButton() throws Exception {
		getWebFactory().createWebButton(getLocator(new FrameParameters("SiteTopNavigation","Account"))).select();
	}

	@Override
	public void selectContactUsButton() throws Exception {
		getWebFactory().createWebButton(getLocator(new FrameParameters("SiteTopNavigation","ContactUs"))).select();
	}

	@Override
	public void selectService(ServiceTypeEnum serviceType) throws Exception {
		if (serviceType != null) {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("SiteTopNavigation","NavigationList"))).select(serviceType.toString());
		}
		else {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("SiteTopNavigation","NavigationList"))).select(getDto().getSiteTopNavigationDto().getServiceType());
		}
	}
	
}
