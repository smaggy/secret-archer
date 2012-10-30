package com.company.common.types;

public class CssSelector {
	
	private String cssSelector;
	
	public CssSelector(String cssSelector) {
		this.cssSelector = cssSelector;
	}
	
	public String getCssSelector() {
		return cssSelector;
	}
	
	public void setCssSelector(String cssSelector) {
		this.cssSelector = cssSelector;
	}
	
	public String toString() {
		return "[" + cssSelector + "]";
	}
	
}
