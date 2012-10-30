package com.company.common.type.web.selenium.composite;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.composite.AbstractWebCalendarInterface;
import com.company.common.type.web.selenium.SeleniumWebElement;
import com.company.common.types.Locator;
import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public class SeleniumWebCalendar extends SeleniumWebElement implements TestObjectInterface, AbstractWebCalendarInterface {

	public SeleniumWebCalendar(WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

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

}
