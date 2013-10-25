package com.company.common.model.process;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.company.common.types.CssSelector;
import com.company.common.types.FrameParameters;
import com.company.common.types.Locator;

/**
 * Defines the role and use of an automation object that you can load a frame into.   Typically used with web page objects.
 * A FRAME is the abstraction of web page into searchable elements
 * 
 * @author ortega_e
 *
 */
public interface FrameableInterface {
	/**
	 * Loads a FRAME to the automation object
	 * 
	 * @param frame
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public void loadFrame(File frame) throws ParserConfigurationException, SAXException, IOException;
	
	/**
	 * Gets the Locator from FRAME
	 * 
	 * @param frameParameters
	 * @return
	 * @throws XPathExpressionException
	 */
	public Locator getLocator(FrameParameters frameParameters) throws XPathExpressionException;
	
	/**
	 * Gets the CssSelector from the FRAME
	 * 
	 * @param frameParameters
	 * @return
	 * @throws XPathExpressionException
	 */
	public CssSelector getCssSelector(FrameParameters frameParameters) throws XPathExpressionException;
}
