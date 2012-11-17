package com.company.common.utils.xml;

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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.company.common.types.XPathQuery;

public abstract class AbstractXmlReader implements XmlReaderInterface {
	
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlReader.class);
	
	private DocumentBuilderFactory documentBuilderFactory;
	private DocumentBuilder documentBuilder;
	private Document document;
	private XPathFactory xPathFactory;

	public AbstractXmlReader(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		this.documentBuilderFactory = DocumentBuilderFactory.newInstance();
		this.documentBuilder = documentBuilderFactory.newDocumentBuilder();
		this.document = documentBuilder.parse(xmlFile);
		document.normalize();
		this.xPathFactory = XPathFactory.newInstance();
	}
	
	@Override
	public Node evaluateXPathExpression(XPathQuery xPathQuery) throws XPathExpressionException {
		logger.debug("Evaluating the xpath expression: [" + xPathQuery.getxPathQuery() + "]");
		XPath xPath = xPathFactory.newXPath();
		XPathExpression expr = xPath.compile(xPathQuery.getxPathQuery());
		Object retNode = expr.evaluate(this.document, XPathConstants.NODE);
		return (Node) retNode;
	}

	@Override
	public String getChildElementValue(Node node, String elementTagName) {
		logger.debug("Getting the child element value: [" + elementTagName + "], from Node: [" + node.getNodeName() + "]");
		String returnString = null;
		
		NodeList nodeList = node.getChildNodes();
		
		for (int temp = 0; temp < nodeList.getLength(); temp++) {
			Node innernode = nodeList.item(temp);
			if (innernode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) innernode;
				if (element.getNodeName().equalsIgnoreCase(elementTagName)) {
					logger.debug("Encountered the element: [" + elementTagName + "], returning the value and stopping the search.");
					returnString = element.getTextContent();
					break;
				}
			}
		}
		
		return returnString;	
	}

	@Override
	public String getChildElementValue(Node node, String elementTagName, String elementAttribute, String elementAttributeValue) {
		logger.debug("Getting the child element value: [" + elementTagName + "], from Node: [" + node.getNodeName() + "], whose [" + elementAttribute +"] attribute is: [" + elementAttributeValue + "]");
		String returnString = null;
		
		NodeList nodeList = node.getChildNodes();
		
		for (int temp = 0; temp < nodeList.getLength(); temp++) {
			Node innernode = nodeList.item(temp);
			if (innernode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) innernode;
				if (element.getNodeName().equalsIgnoreCase(elementTagName) && element.getAttribute(elementAttribute).equalsIgnoreCase(elementAttributeValue)) {
					logger.debug("Encountered the element: [" + elementTagName + "] with [" + elementAttribute + "] attribute: [" + elementAttributeValue + "], returning the value and stopping the search.");
					returnString = element.getTextContent();
					break;
				}
			}
		}
		
		return returnString;	
	}

}
