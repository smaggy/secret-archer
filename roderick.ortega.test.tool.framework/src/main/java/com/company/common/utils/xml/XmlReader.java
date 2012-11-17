package com.company.common.utils.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class XmlReader extends AbstractXmlReader implements XmlReaderInterface {

	public XmlReader(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		super(xmlFile);
	}

}
