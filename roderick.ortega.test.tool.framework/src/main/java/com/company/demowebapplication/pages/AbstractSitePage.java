package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.company.common.frame.AbstractAutomationFrame;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.pages.AbstractSitePageInterface;

public abstract class AbstractSitePage extends AbstractAutomationFrame implements AbstractSitePageInterface {

	private DataTransferObject dataTransferObject;
	private AbstractGuiWebFactoryInterface webFactory;
	
	public AbstractSitePage(File frameFile) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile);
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

}
