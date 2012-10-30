package com.company.common.types;

public class XPathQuery {
	
	private String xPathQuery;

	public XPathQuery(String xPathQuery) {
		setxPathQuery(xPathQuery);
	}
	
	public String getxPathQuery() {
		return xPathQuery;
	}

	private void setxPathQuery(String xPathQuery) {
		this.xPathQuery = xPathQuery;
	}
	
	public String toString() {
		return "[" + xPathQuery + "]";
	}
}
