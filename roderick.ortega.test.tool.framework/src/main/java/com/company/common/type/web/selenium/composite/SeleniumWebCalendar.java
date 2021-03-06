package com.company.common.type.web.selenium.composite;

import org.openqa.selenium.WebElement;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.composite.AbstractWebCalendarInterface;
import com.company.common.type.web.selenium.SeleniumWebElement;
import com.company.common.types.Locator;
import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public class SeleniumWebCalendar extends SeleniumWebElement implements TestObjectInterface, AbstractWebCalendarInterface {

	public SeleniumWebCalendar(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
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
