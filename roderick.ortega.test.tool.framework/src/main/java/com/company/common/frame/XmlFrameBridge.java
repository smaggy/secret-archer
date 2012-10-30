package com.company.common.frame;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.company.common.types.CssSelector;
import com.company.common.types.FrameParameters;
import com.company.common.types.Locator;
import com.company.common.types.XPathQuery;

public class XmlFrameBridge {
	
	private final static String XPATH_ELEMENT = "xpath";
	private final static String CSS_SELECTOR_ELEMENT = "css";
	
	private DocumentBuilderFactory documentBuilderFactory;
	private DocumentBuilder documentBuilder;
	private Document document;
	private XPathFactory xPathFactory;
	
	public XmlFrameBridge(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		this.documentBuilderFactory = DocumentBuilderFactory.newInstance();
		this.documentBuilder = documentBuilderFactory.newDocumentBuilder();
		this.document = documentBuilder.parse(xmlFile);
		document.normalize();
		this.xPathFactory = XPathFactory.newInstance();
	}
	
	private Node evaluateXpathExpression(XPathQuery xPathQuery) throws XPathExpressionException {
		XPath xPath = xPathFactory.newXPath();
		XPathExpression expr = xPath.compile(xPathQuery.getxPathQuery());
		Object retNode = expr.evaluate(this.document, XPathConstants.NODE);
		return (Node) retNode;
	}
	
	private Locator getXPathLocator(Node node) {
		String returnString = null;
		
		NodeList list = node.getChildNodes();
		
		for (int temp = 0; temp < list.getLength(); temp++) {
			Node innernode = list.item(temp);
			if (innernode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) innernode;
				if (element.getNodeName().equalsIgnoreCase(XPATH_ELEMENT)) {
					returnString = element.getTextContent();
				}
			}
		}
		
		return new Locator(returnString);
	}
	
	private CssSelector getCssSelector(Node node) {
		// untested reo
		String returnString = null;
		
		NodeList list = node.getChildNodes();
		
		for (int temp = 0; temp < list.getLength(); temp++) {
			Node innernode = list.item(temp);
			if (innernode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) innernode;
				if (element.getNodeName().equalsIgnoreCase(CSS_SELECTOR_ELEMENT)) {
					returnString = element.getTextContent();
				}
			}
		}
		
		return new CssSelector(returnString);
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
		return evaluateXpathExpression(new XPathQuery("//page[@id='" + frameParameters.getPageId() + "']//object[@id='" + frameParameters.getTestObjectId() + "']"));
	}
	
	private Node getPageNode(FrameParameters frameParameters) throws XPathExpressionException {
		return evaluateXpathExpression(new XPathQuery("//page[@id='" + frameParameters.getPageId() + "']"));
	}
}
