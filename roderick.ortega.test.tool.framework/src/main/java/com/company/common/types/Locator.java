package com.company.common.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper around a locator.   A locator is an XPath construct that is used in an XPath query to LOCATE 0, 1, or many web based elements.
 * 
 * @author ortega_e
 *
 */
public class Locator {
	
	final static Logger logger = LoggerFactory.getLogger(Locator.class);
	private String xPathLocator;
	
	/**
	 * Constructor - loads the XPath locator query to the object
	 * 
	 * @param xPathLocator
	 */
	public Locator(String xPathLocator) {
		validate(xPathLocator);
		this.xPathLocator = xPathLocator;
	}
	
	/**
	 * Gets the XPath locator query
	 * 
	 * @return
	 */
	public String getXPathLocator() {
		return xPathLocator;
	}

	/**
	 * Sets the XPath locator query
	 * 
	 * @param xPathLocator
	 */
	public void setXPathLocator(String xPathLocator) {
		this.xPathLocator = xPathLocator;
	}
	
	/**
	 * Validates the XPath locator query based on company specific requirements (normally automation rule set)
	 * 
	 * @param xPathLocator
	 */
	private void validate(String xPathLocator) {
		
		if (xPathLocator.contains("*")) {
			logger.info(" ... locator contains a *.  Consider revising xPath query.");
		}
		if (xPathLocator.contains("@textcontents='")) {
			logger.info(" ... locator contains a '@textcontents='.  Consider revising xPath query.");
		}
		
	}
	
	/**
	 * ToString Decorator
	 */
	public String toString() {
		return "[" + xPathLocator + "]";
	}
	
}
