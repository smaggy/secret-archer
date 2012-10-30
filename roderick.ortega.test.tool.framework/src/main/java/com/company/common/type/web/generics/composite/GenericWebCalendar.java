package com.company.common.type.web.generics.composite;

import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.composite.AbstractWebCalendarInterface;
import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public class GenericWebCalendar implements AbstractWebCalendarInterface, TestObjectInterface {

	@Override
	public void selectDate(CompanyStringDate date) {
		System.out.println("GenericWebCalendar|selectDate: " + date.toString());

	}

	@Override
	public void selectDay(int day) {
		System.out.println("GenericWebCalendar|selectDay: " + day);

	}

	@Override
	public void selectDay(CompanyStringDay day) {
		System.out.println("GenericWebCalendar|selectDay: " + day.toString());

	}

	@Override
	public String getDate() {
		System.out.println("GenericWebCalendar|getDate");
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

}
