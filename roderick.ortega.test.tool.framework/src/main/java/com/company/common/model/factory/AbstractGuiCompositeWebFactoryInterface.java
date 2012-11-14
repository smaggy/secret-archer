package com.company.common.model.factory;

import com.company.common.model.action.BrowseableInterface;
import com.company.common.model.type.composite.AbstractWebCalendarInterface;
import com.company.common.model.type.composite.AbstractWebStackPanelInterface;
import com.company.common.model.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.types.Locator;

public interface AbstractGuiCompositeWebFactoryInterface extends BrowseableInterface {
	public AbstractWebCalendarInterface createWebCalendar(Locator locator);
	public AbstractWebStackPanelInterface createWebStackPanel(Locator locator);
	public AbstractWebSuggestBoxInterface createWebSuggestBox(Locator locator);
}
