package com.company.common.concrete.bridges;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.company.common.types.XPathQuery;
import com.company.common.utils.xml.XmlReader;

public class XmlServerPathBridge {

	private XmlReader xmlReader;
	
	public XmlServerPathBridge(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		this.xmlReader = new XmlReader(xmlFile);
	}
	
	public String getPath(String pathId) throws XPathExpressionException {
		XPathQuery xPathQuery = new XPathQuery("//server[@id='" + pathId + "']");
		Node node = this.xmlReader.evaluateXPathExpression(xPathQuery);
		return this.xmlReader.getChildElementValue(node, "path");
	}
	
}
