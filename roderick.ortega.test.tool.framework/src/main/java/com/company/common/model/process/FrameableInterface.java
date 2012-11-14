package com.company.common.model.process;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.company.common.types.CssSelector;
import com.company.common.types.FrameParameters;
import com.company.common.types.Locator;

public interface FrameableInterface {
	public void loadFrame(File frame) throws ParserConfigurationException, SAXException, IOException;
	public Locator getLocator(FrameParameters frameParameters) throws XPathExpressionException;
	public CssSelector getCssSelector(FrameParameters frameParameters) throws XPathExpressionException;
}
