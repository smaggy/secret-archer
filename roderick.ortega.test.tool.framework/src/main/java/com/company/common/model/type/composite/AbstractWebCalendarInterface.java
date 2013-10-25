package com.company.common.model.type.composite;

import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

/**
 * Defines the use of ANY web based calendar element
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebCalendarInterface {
	
	/**
	 * Selects the date contained within a calendar element
	 * 
	 * @param date
	 */
	public void selectDate(CompanyStringDate date);
	
	/**
	 * Selects the day contained within the current view of the calendar
	 * 
	 * @param day
	 */
	public void selectDay(int day);
	
	/**
	 * Selects the day contained within the current view of the calendar
	 * 
	 * @param day
	 */
	public void selectDay(CompanyStringDay day);
	
	/**
	 * Gets the currently selected date
	 * 
	 * @return
	 */
	public String getDate();
}
