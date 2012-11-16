package com.company.common.type.web.mock.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.composite.AbstractWebCalendarInterface;
import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public class MockWebCalendar implements AbstractWebCalendarInterface, TestObjectInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebCalendar.class);
	
	@Override
	public void selectDate(CompanyStringDate date) {
		logger.debug("MockWebCalendar|selectDate: " + date.toString());

	}

	@Override
	public void selectDay(int day) {
		logger.debug("MockWebCalendar|selectDay: " + day);

	}

	@Override
	public void selectDay(CompanyStringDay day) {
		logger.debug("MockWebCalendar|selectDay: " + day.toString());

	}

	@Override
	public String getDate() {
		logger.debug("MockWebCalendar|getDate");
		return null;
	}

	@Override
	public boolean exists() {
		logger.debug("MockWebCalendar|exists");
		return false;
	}

}
