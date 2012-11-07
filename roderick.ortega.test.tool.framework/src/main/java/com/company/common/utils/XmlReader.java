package com.company.common.utils;

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

import com.company.common.types.XPathQuery;

public class XmlReader {
	
	private DocumentBuilderFactory documentBuilderFactory;
	private DocumentBuilder documentBuilder;
	private Document document;
	private XPathFactory xPathFactory;
	
	public XmlReader(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		this.documentBuilderFactory = DocumentBuilderFactory.newInstance();
		this.documentBuilder = documentBuilderFactory.newDocumentBuilder();
		this.document = documentBuilder.parse(xmlFile);
		document.normalize();
		this.xPathFactory = XPathFactory.newInstance();
	}
	
	public Node evaluateXPathExpression(XPathQuery xPathQuery) throws XPathExpressionException {
		XPath xPath = xPathFactory.newXPath();
		XPathExpression expr = xPath.compile(xPathQuery.getxPathQuery());
		Object retNode = expr.evaluate(this.document, XPathConstants.NODE);
		return (Node) retNode;
	}
	
	public String getChildElementValue(Node node, String elementTagName) {
		String returnString = null;
		
		NodeList nodeList = node.getChildNodes();
		
		for (int temp = 0; temp < nodeList.getLength(); temp++) {
			Node innernode = nodeList.item(temp);
			if (innernode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) innernode;
				if (element.getNodeName().equalsIgnoreCase(elementTagName)) {
					returnString = element.getTextContent();
					break;
				}
			}
		}
		
		return returnString;	
	}
	
	public String getChildElementValue(Node node, String elementTagName, String browserAttributeValue) {
		String returnString = null;
		
		NodeList nodeList = node.getChildNodes();
		
		for (int temp = 0; temp < nodeList.getLength(); temp++) {
			Node innernode = nodeList.item(temp);
			if (innernode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) innernode;
				if (element.getNodeName().equalsIgnoreCase(elementTagName) && element.getAttribute("browser").equalsIgnoreCase(browserAttributeValue)) {
					returnString = element.getTextContent();
					break;
				}
			}
		}
		
		return returnString;	
	}
}
