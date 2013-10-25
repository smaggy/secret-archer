package com.company.common.types;

/**
 * Implementation of a Tool Specific CssSelector
 * 
 * @author ortega_e
 *
 */
public class CssSelector {
	
	private String cssSelector;
	
	/**
	 * Constructor
	 * 
	 * @param cssSelector
	 */
	public CssSelector(String cssSelector) {
		this.cssSelector = cssSelector;
	}
	
	/**
	 * Gets the CssSelector
	 * 
	 * @return
	 */
	public String getCssSelector() {
		return cssSelector;
	}
	
	/**
	 * Sets the CssSelector
	 * 
	 * @param cssSelector
	 */
	public void setCssSelector(String cssSelector) {
		this.cssSelector = cssSelector;
	}
	
	/**
	 * ToString Decorator
	 */
	public String toString() {
		return "[" + cssSelector + "]";
	}
	
}
