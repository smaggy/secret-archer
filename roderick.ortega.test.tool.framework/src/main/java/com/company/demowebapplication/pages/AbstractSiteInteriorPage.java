package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.types.FrameParameters;
import com.company.demowebapplication.enums.ServiceTypeEnum;
import com.company.demowebapplication.interfaces.pages.AbstractSitePageInterface;
import com.company.demowebapplication.interfaces.pages.SiteFooterNavigationInterface;
import com.company.demowebapplication.interfaces.pages.SiteTopNavigationInterface;

public abstract class AbstractSiteInteriorPage extends AbstractSitePage implements AbstractSitePageInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {

	final static Logger logger = LoggerFactory.getLogger(AbstractSiteInteriorPage.class);
	
	public AbstractSiteInteriorPage(File frameFile, AbstractGuiWebFactoryInterface webFactory) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile, webFactory);
	}

	@Override
	public void selectHomeButton() throws Exception {
		logger.info("ACTION: selectHomeButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("SiteTopNavigation","Home"))).select();
	}

	@Override
	public void selectAccountButton() throws Exception {
		logger.info("ACTION: selectAccountButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("SiteTopNavigation","Account"))).select();
	}

	@Override
	public void selectContactUsButton() throws Exception {
		logger.info("ACTION: selectContactUsButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("SiteTopNavigation","ContactUs"))).select();
	}

	@Override
	public void selectService(ServiceTypeEnum serviceType) throws Exception {
		logger.info("ACTION: selectService: [" + serviceType + "]");
		if (serviceType != null) {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("SiteTopNavigation","NavigationList"))).select(serviceType.toString());
		}
		else {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("SiteTopNavigation","NavigationList"))).select(getDto().getSiteTopNavigationDto().getServiceType());
		}
	}
	
}
