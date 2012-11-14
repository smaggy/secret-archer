package com.company.common.type.web.generics.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.composite.AbstractWebCalendarInterface;
import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public class GenericWebCalendar implements AbstractWebCalendarInterface, TestObjectInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebCalendar.class);
	
	@Override
	public void selectDate(CompanyStringDate date) {
		logger.debug("GenericWebCalendar|selectDate: " + date.toString());

	}

	@Override
	public void selectDay(int day) {
		logger.debug("GenericWebCalendar|selectDay: " + day);

	}

	@Override
	public void selectDay(CompanyStringDay day) {
		logger.debug("GenericWebCalendar|selectDay: " + day.toString());

	}

	@Override
	public String getDate() {
		logger.debug("GenericWebCalendar|getDate");
		return null;
	}

	@Override
	public boolean exists() {
		logger.debug("GenericWebCalendar|exists");
		return false;
	}

}
