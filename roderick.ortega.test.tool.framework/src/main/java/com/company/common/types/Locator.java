package com.company.common.types;

public class Locator {
	
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
			System.out.println(" ... locator contains a *.  Consider revising xPath query.");
		}
		if (xPathLocator.contains("@textcontents='")) {
			System.out.println(" ... locator contains a '@textcontents='.  Consider revising xPath query.");
		}
		
	}
	
	public String toString() {
		return "[" + xPathLocator + "]";
	}
	
}
