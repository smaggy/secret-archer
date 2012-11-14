package com.company.common.type.web.silktest.composite;

import com.company.common.model.action.BrowseableInterface;
import com.company.common.model.factory.AbstractGuiCompositeWebFactoryInterface;
import com.company.common.model.type.composite.AbstractWebCalendarInterface;
import com.company.common.model.type.composite.AbstractWebStackPanelInterface;
import com.company.common.model.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.type.web.abstracts.factory.AbstractGuiCompositeWebFactory;
import com.company.common.types.Locator;

public final class SilktestGuiCompositeWebFactory extends AbstractGuiCompositeWebFactory implements AbstractGuiCompositeWebFactoryInterface, BrowseableInterface {

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
