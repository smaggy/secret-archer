package com.company.application2.type.web.silktest.composite;

import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.composite.AbstractWebCalendarInterface;
import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public class SilktestWebCalendar implements TestObjectInterface, AbstractWebCalendarInterface {

	@Override
	public void selectDate(CompanyStringDate date) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDay(int day) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDay(CompanyStringDay day) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

}
