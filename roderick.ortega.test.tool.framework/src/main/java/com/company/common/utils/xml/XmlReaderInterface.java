package com.company.common.utils.xml;

import org.w3c.dom.Node;

import com.company.common.types.XPathQuery;

public interface XmlReaderInterface {
	public Node evaluateXPathExpression(XPathQuery xPathQuery) throws Exception;
	public String getChildElementValue(Node node, String elementTagName) throws Exception;
	public String getChildElementValue(Node node, String elementTagName, String elementAttribute, String elementAttributeValue) throws Exception;
}
