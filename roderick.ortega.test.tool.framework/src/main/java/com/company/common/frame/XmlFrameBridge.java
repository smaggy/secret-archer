package com.company.common.frame;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.company.common.types.CssSelector;
import com.company.common.types.FrameParameters;
import com.company.common.types.Locator;
import com.company.common.types.XPathQuery;
import com.company.common.utils.XmlReader;

public class XmlFrameBridge {
	
	private final static String XPATH_ELEMENT = "xpath";
	private final static String CSS_SELECTOR_ELEMENT = "css";
	
	private XmlReader xmlReader;
	
	public XmlFrameBridge(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		this.xmlReader = new XmlReader(xmlFile);
	}
	
	private Locator getXPathLocator(Node node) {
		return new Locator(this.xmlReader.getChildElementValue(node, XPATH_ELEMENT));
	}
	
	private CssSelector getCssSelector(Node node) {
		return new CssSelector(this.xmlReader.getChildElementValue(node, CSS_SELECTOR_ELEMENT));
	}
	
	public Locator getTestObjectLocator(FrameParameters frameParameters) throws XPathExpressionException {
		return getXPathLocator(getTestObjectNode(frameParameters));
	}
	
	public Locator getPageLocator(FrameParameters frameParameters) throws XPathExpressionException {
		return getXPathLocator(getPageNode(frameParameters));
	}
	
	public CssSelector getTestObjectCssSelector(FrameParameters frameParameters) throws XPathExpressionException {
		return getCssSelector(getTestObjectNode(frameParameters));
	}
	
	public CssSelector getPageCssSelector(FrameParameters frameParameters) throws XPathExpressionException {
		return getCssSelector(getPageNode(frameParameters));
	}
	
	private Node getTestObjectNode(FrameParameters frameParameters) throws XPathExpressionException {
		return this.xmlReader.evaluateXPathExpression(new XPathQuery("//page[@id='" + frameParameters.getPageId() + "']//object[@id='" + frameParameters.getTestObjectId() + "']"));
	}
	
	private Node getPageNode(FrameParameters frameParameters) throws XPathExpressionException {
		return this.xmlReader.evaluateXPathExpression(new XPathQuery("//page[@id='" + frameParameters.getPageId() + "']"));
	}
}
