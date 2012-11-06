package com.company.common.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Locator {
	
	final static Logger logger = LoggerFactory.getLogger(Locator.class);
	private String xPathLocator;
	
	public Locator(String xPathLocator) {
		validate(xPathLocator);
		this.xPathLocator = xPathLocator;
	}
	
	public String getXPathLocator() {
		return xPathLocator;
	}

	public void setXPathLocator(String xPathLocator) {
		this.xPathLocator = xPathLocator;
	}
	
	private void validate(String xPathLocator) {
		
		if (xPathLocator.contains("*")) {
			logger.info(" ... locator contains a *.  Consider revising xPath query.");
		}
		if (xPathLocator.contains("@textcontents='")) {
			logger.info(" ... locator contains a '@textcontents='.  Consider revising xPath query.");
		}
		
	}
	
	public String toString() {
		return "[" + xPathLocator + "]";
	}
	
}
