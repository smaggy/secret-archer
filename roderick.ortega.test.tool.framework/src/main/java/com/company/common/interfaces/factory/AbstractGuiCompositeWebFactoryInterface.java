package com.company.common.interfaces.factory;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.type.composite.AbstractWebCalendarInterface;
import com.company.common.interfaces.type.composite.AbstractWebStackPanelInterface;
import com.company.common.interfaces.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.types.Locator;

public interface AbstractGuiCompositeWebFactoryInterface extends BrowseableInterface {
	public AbstractWebCalendarInterface createWebCalendar(Locator locator);
	public AbstractWebStackPanelInterface createWebStackPanel(Locator locator);
	public AbstractWebSuggestBoxInterface createWebSuggestBox(Locator locator);
}
