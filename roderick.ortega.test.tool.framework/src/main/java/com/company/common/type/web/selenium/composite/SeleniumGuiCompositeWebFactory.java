package com.company.common.type.web.selenium.composite;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.factory.AbstractGuiCompositeWebFactoryInterface;
import com.company.common.interfaces.type.composite.AbstractWebCalendarInterface;
import com.company.common.interfaces.type.composite.AbstractWebStackPanelInterface;
import com.company.common.interfaces.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.type.web.abstracts.factory.AbstractGuiCompositeWebFactory;
import com.company.common.types.Locator;

public class SeleniumGuiCompositeWebFactory extends AbstractGuiCompositeWebFactory implements AbstractGuiCompositeWebFactoryInterface, BrowseableInterface {

	@Override
	public AbstractWebCalendarInterface createWebCalendar(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebStackPanelInterface createWebStackPanel(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebSuggestBoxInterface createWebSuggestBox(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

}
