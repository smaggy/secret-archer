package com.company.common.utils.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;


public class FrameXmlReader extends AbstractXmlReader implements XmlReaderInterface {

	final static Logger logger = LoggerFactory.getLogger(FrameXmlReader.class);
	final static String ELEMENT_ATTRIBUTE = "browser";
	
	public FrameXmlReader(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		super(xmlFile);
	}
	
	public String getChildElementValue(Node node, String elementTagName, String elementAttributeValue) {
		return getChildElementValue(node, elementTagName, ELEMENT_ATTRIBUTE, elementAttributeValue);
	}
	
}
