package com.company.common.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompanyStringDay {
	
	final static Logger logger = LoggerFactory.getLogger(CompanyStringDay.class);
	private String day;

	public CompanyStringDay(String day) {
		validate(day);
		this.day = day;
	}
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	private void validate(String day) {
		
		if (Integer.valueOf(day) < 1 ||  Integer.valueOf(day) > 31) {
			logger.info(" ... date is malformed.  Day is out of normal range.");
		}
		
	}
	
	public String toString() {
		return "[" + day + "]";
	}
	
}
