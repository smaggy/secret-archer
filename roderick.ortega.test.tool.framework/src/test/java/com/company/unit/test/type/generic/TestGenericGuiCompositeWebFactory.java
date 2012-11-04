package com.company.unit.test.type.generic;

import org.junit.Before;
import org.junit.Test;

import com.company.common.browser.GenericWebBrowser;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiCompositeWebFactoryInterface;
import com.company.common.interfaces.type.composite.AbstractWebCalendarInterface;
import com.company.common.interfaces.type.composite.AbstractWebStackPanelInterface;
import com.company.common.interfaces.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.type.web.generics.composite.GenericGuiCompositeWebFactory;
import com.company.common.types.Locator;
import com.company.common.types.CompanyStringDate;
import com.company.common.types.CompanyStringDay;

public class TestGenericGuiCompositeWebFactory {
	
	private AbstractGuiCompositeWebFactoryInterface guiCompositeWebFactory;
	private AbstractWebBrowserInterface webBrowser;
	private Locator locator;
	
	@Before
	public void before() throws Exception {
		guiCompositeWebFactory = new GenericGuiCompositeWebFactory();
		webBrowser = new GenericWebBrowser();
		guiCompositeWebFactory.setWebBrowser(webBrowser);
		locator = new Locator("//ELEMENT[@id='AutomationId']");
		System.out.println("==== new test ====");
	}
	@Test
	public void test01() {
		guiCompositeWebFactory.createWebCalendar(locator);
		guiCompositeWebFactory.createWebStackPanel(locator);
		guiCompositeWebFactory.createWebSuggestBox(locator);
	}
	@Test
	public void test02() {
		AbstractWebCalendarInterface cal = guiCompositeWebFactory.createWebCalendar(locator);
		cal.getDate();
		cal.selectDate(new CompanyStringDate("11/11/2012"));
		cal.selectDay(1);
		cal.selectDay(new CompanyStringDay("23"));
	}
	@Test
	public void test03() {
		AbstractWebStackPanelInterface sp = guiCompositeWebFactory.createWebStackPanel(locator);
		sp.getAllBannerNames();
		sp.getAllBanners();
		sp.getSelectedStackBanner();
		sp.getSelectedStackPanelBannerContent();
		sp.getStackPanelBanner(1);
		sp.getStackPanelBannerText(1);
		sp.selectStack("1");
	}
	@Test
	public void test04() {
		AbstractWebSuggestBoxInterface sb = guiCompositeWebFactory.createWebSuggestBox(locator);
		sb.clearText();
		sb.pickSuggestion("1", true, "1", "1");
		sb.removeSelection();
		sb.searchAndReturnList("1",1);
		sb.select("1");
		sb.select("1", 1);
		sb.select("1", 1, true);
		sb.select("1", 1, true, "1");
		sb.select("1", 1, true, "1", "1");
	}
}
