package com.company.common.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompanyStringDate {
	
	final static Logger logger = LoggerFactory.getLogger(CompanyStringDate.class);
	private String date;
	
	public CompanyStringDate(String date) {
		validate(date);
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	private void validate(String date) {
		
		// break up into to tokens and validate
		// proper form should be: MM/dd/yyyy
		
		String[] tokens = date.split("/");
		if (tokens.length != 3) {
			logger.info(" ... date is malformed.  Not enough date tokens encountered.");
		}
		if (tokens[0].length() != 2) {
			logger.info(" ... date is malformed.  Month does not contain enough characters.");
		}
		if (tokens[1].length() != 2) {
			logger.info(" ... date is malformed.  Day does not contain enough characters.");
		}
		if (tokens[2].length() != 4) {
			logger.info(" ... date is malformed.  Year does not contain enough characters.");
		}
		if (Integer.valueOf(tokens[0]) < 1 ||  Integer.valueOf(tokens[0]) > 12) {
			logger.info(" ... date is malformed.  Month is out of normal range.");
		}
		if (Integer.valueOf(tokens[1]) < 1 ||  Integer.valueOf(tokens[1]) > 31) {
			logger.info(" ... date is malformed.  Day is out of normal range.");
		}
		if (Integer.valueOf(tokens[2]) < 1900 ||  Integer.valueOf(tokens[2]) > 2100) {
			logger.info(" ... date is malformed.  Year is out of expected range.");
		}
		
	}
	
	public String toString() {
		return "[" + date + "]";
	}
	
}
