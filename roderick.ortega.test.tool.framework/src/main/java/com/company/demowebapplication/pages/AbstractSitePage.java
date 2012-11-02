package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.company.common.frame.AbstractAutomationFrame;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.types.FrameParameters;
import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.pages.AbstractSitePageInterface;
import com.company.demowebapplication.interfaces.pages.SiteFooterNavigationInterface;

public abstract class AbstractSitePage extends AbstractAutomationFrame implements AbstractSitePageInterface, SiteFooterNavigationInterface {

	private DataTransferObject dataTransferObject;
	private AbstractGuiWebFactoryInterface webFactory;
	
	public AbstractSitePage(File frameFile, AbstractGuiWebFactoryInterface webFactory) throws ParserConfigurationException, SAXException, IOException {
		this.webFactory = webFactory;
		this.loadFrame(frameFile);
	}
	
	@Override
	public void setDto(DataTransferObject dataTransferObject) {
		this.dataTransferObject = dataTransferObject;
	}

	@Override
	public DataTransferObject getDto() {
		return dataTransferObject;
	}
	
	@Override
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) {
		this.webFactory = webFactory;
	}

	@Override
	public AbstractGuiWebFactoryInterface getWebFactory() {
		return webFactory;
	}
	
	@Override
	public void selectHome() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","Home"))).select();
	}

	@Override
	public void selectWebService() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","WebService"))).select();
	}

	@Override
	public void selectSettings() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","Settings"))).select();
	}

	@Override
	public void selectContactUs() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","ContactUs"))).select();
	}

}
