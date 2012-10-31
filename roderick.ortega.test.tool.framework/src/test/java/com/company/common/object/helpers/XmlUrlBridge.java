package com.company.common.object.helpers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.company.common.types.Url;
import com.company.common.types.XPathQuery;
import com.company.common.utils.XmlReader;

public class XmlUrlBridge {
	
	private XmlReader xmlReader;
	
	public XmlUrlBridge(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		this.xmlReader = new XmlReader(xmlFile);
	}
	
	public Url getUrl(String siteId) throws XPathExpressionException {
		XPathQuery xPathQuery = new XPathQuery("//site[@id='" + siteId + "']");
		Node node = this.xmlReader.evaluateXPathExpression(xPathQuery);
		return new Url(this.xmlReader.getChildElementValue(node, "url"));
	}
}
