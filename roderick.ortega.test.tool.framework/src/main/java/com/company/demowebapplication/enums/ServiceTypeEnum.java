package com.company.demowebapplication.enums;

public enum ServiceTypeEnum {
	AUTO_QUOTE("Auto Quote"),
	AGENT_LOOKUP("Agent Lookup"),
	TERM_LIFE_QUOTE("Term Life Quote"),
	QUOTE_HOMEOWNERS("Quote Homeowners"),
	RETRIEVE_SAVED_QUOTE("Retrieve Saved Quote"),
	REPORT_CLAIM("Report Claim"),
	TRACK_CLAIM("Track Claim");
	
	private String displayName;
	
	ServiceTypeEnum (final String displayName) {
		this.displayName = displayName;
	}
	public String toString() {
		return this.displayName;
	}
}
