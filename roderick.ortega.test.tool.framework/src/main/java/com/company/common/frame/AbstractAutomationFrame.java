package com.company.common.frame;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.company.common.interfaces.process.FrameableInterface;
import com.company.common.types.CssSelector;
import com.company.common.types.FrameParameters;
import com.company.common.types.Locator;

public abstract class AbstractAutomationFrame implements FrameableInterface {
	
	private XmlFrameBridge xmlFrameBridge;
	
	public AbstractAutomationFrame() {
		
	}
	
	public AbstractAutomationFrame(File frameFile) throws ParserConfigurationException, SAXException, IOException {
		this.xmlFrameBridge = new XmlFrameBridge(frameFile);
	}
	
	@Override
	public void loadFrame(File frameFile) throws ParserConfigurationException, SAXException, IOException {
		this.xmlFrameBridge = new XmlFrameBridge(frameFile);
	}

	@Override
	public Locator getLocator(FrameParameters frameParameters) throws XPathExpressionException {
		
		switch (frameParameters.getFrameParameterType()) {
		
		case PAGE_ONLY:
			return xmlFrameBridge.getPageLocator(frameParameters);
			
		case PAGE_AND_TEST_OBJECT:
			return xmlFrameBridge.getTestObjectLocator(frameParameters);
			
		default:
			return null;
		}
	}

	@Override
	public CssSelector getCssSelector(FrameParameters frameParameters) throws XPathExpressionException {
		
		switch (frameParameters.getFrameParameterType()) {
		
		case PAGE_ONLY:
			return xmlFrameBridge.getPageCssSelector(frameParameters);
			
		case PAGE_AND_TEST_OBJECT:
			return xmlFrameBridge.getTestObjectCssSelector(frameParameters);
			
		default:
			return null;
		}
		
	}

}
