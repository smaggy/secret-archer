package com.company.unit.test.utilities;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.company.common.concrete.bridges.XmlUrlBridge;

public class TestXmlUrlBridge {
	@Test
	public void test01() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		XmlUrlBridge xmlUrlBridge = new XmlUrlBridge(new File("./Resources/TestUrls.xml"));
		System.out.println(xmlUrlBridge.getUrl("DemoBorland"));
		System.out.println(xmlUrlBridge.getUrl("DemoWebApplication"));
		System.out.println(xmlUrlBridge.getUrl("SilkPerformerTestSite"));
		System.out.println(xmlUrlBridge.getUrl("GmoPost"));
		System.out.println(xmlUrlBridge.getUrl("ShopIt"));
		System.out.println(xmlUrlBridge.getUrl("ExtGwt2Explorer"));
		System.out.println(xmlUrlBridge.getUrl("Flex"));
		System.out.println(xmlUrlBridge.getUrl("Silverlight"));
		System.out.println(xmlUrlBridge.getUrl("StaticPages"));
	}
}
