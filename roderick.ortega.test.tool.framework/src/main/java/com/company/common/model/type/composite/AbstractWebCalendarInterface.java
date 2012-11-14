package com.company.common.model.type.composite;

import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public interface AbstractWebCalendarInterface {
	public void selectDate(CompanyStringDate date);
	public void selectDay(int day);
	public void selectDay(CompanyStringDay day);
	public String getDate();
}
