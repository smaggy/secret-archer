package com.company.common.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of a company specific view of the day.   Validation has been added to make sure it is within normal range for day.
 * 
 * @author ortega_e
 *
 */
public class CompanyStringDay {
	
	final static Logger logger = LoggerFactory.getLogger(CompanyStringDay.class);
	private String day;

	/**
	 * Constructor
	 * 
	 * @param day
	 */
	public CompanyStringDay(String day) {
		validate(day);
		this.day = day;
	}
	
	/**
	 * Gets the Day
	 * @return
	 */
	public String getDay() {
		return day;
	}

	/**
	 * Sets the Day
	 * @param day
	 */
	public void setDay(String day) {
		this.day = day;
	}
	
	/**
	 * Validates the Day against specific rules.   May tie into the constructor or the setter and getter.
	 * @param day
	 */
	private void validate(String day) {
		
		if (Integer.valueOf(day) < 1 ||  Integer.valueOf(day) > 31) {
			logger.info(" ... date is malformed.  Day is out of normal range.");
		}
		
	}
	
	/**
	 * ToString Decorator
	 */
	public String toString() {
		return "[" + day + "]";
	}
	
}
