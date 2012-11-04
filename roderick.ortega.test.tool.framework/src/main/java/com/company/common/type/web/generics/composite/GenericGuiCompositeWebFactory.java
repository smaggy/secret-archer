package com.company.common.type.web.generics.composite;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.factory.AbstractGuiCompositeWebFactoryInterface;
import com.company.common.interfaces.type.composite.AbstractWebCalendarInterface;
import com.company.common.interfaces.type.composite.AbstractWebStackPanelInterface;
import com.company.common.interfaces.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.type.web.abstracts.factory.AbstractGuiCompositeWebFactory;
import com.company.common.types.Locator;

public class GenericGuiCompositeWebFactory extends AbstractGuiCompositeWebFactory implements AbstractGuiCompositeWebFactoryInterface, BrowseableInterface {

	@Override
	public AbstractWebCalendarInterface createWebCalendar(Locator locator) {
		System.out.println("GenericGuiCompositeWebFactory|createWebCalendar: " + locator);
		// -----------------------------------------------
		getWebBrowser().findWebButton(locator);
		getWebBrowser().findWebCheckBox(locator);
		getWebBrowser().findWebElement(locator);
		getWebBrowser().findWebLink(locator);
		getWebBrowser().findWebList(locator);
		getWebBrowser().findWebListBox(locator);
		getWebBrowser().findWebRadioButton(locator);
		getWebBrowser().findWebTable(locator);
		getWebBrowser().findWebTableRow(locator);
		getWebBrowser().findWebTextField(locator);
		// -----------------------------------------------
		getWebBrowser().findAllWebElements(locator);
		getWebBrowser().findAllWebButtons(locator);
		getWebBrowser().findAllWebCheckBoxes(locator);
		getWebBrowser().findAllWebLinks(locator);
		getWebBrowser().findAllWebLists(locator);
		getWebBrowser().findAllWebListBoxes(locator);
		getWebBrowser().findAllWebRadioButtons(locator);
		getWebBrowser().findAllWebTables(locator);
		getWebBrowser().findAllWebTableRows(locator);
		getWebBrowser().findAllWebTextFields(locator);
		return new GenericWebCalendar();
	}

	@Override
	public AbstractWebStackPanelInterface createWebStackPanel(Locator locator) {
		System.out.println("GenericGuiCompositeWebFactory|createWebStackPanel: " + locator);
		// -----------------------------------------------
		getWebBrowser().findWebButton(locator);
		getWebBrowser().findWebCheckBox(locator);
		getWebBrowser().findWebElement(locator);
		getWebBrowser().findWebLink(locator);
		getWebBrowser().findWebList(locator);
		getWebBrowser().findWebListBox(locator);
		getWebBrowser().findWebRadioButton(locator);
		getWebBrowser().findWebTable(locator);
		getWebBrowser().findWebTableRow(locator);
		getWebBrowser().findWebTextField(locator);
		// -----------------------------------------------
		getWebBrowser().findAllWebElements(locator);
		getWebBrowser().findAllWebButtons(locator);
		getWebBrowser().findAllWebCheckBoxes(locator);
		getWebBrowser().findAllWebLinks(locator);
		getWebBrowser().findAllWebLists(locator);
		getWebBrowser().findAllWebListBoxes(locator);
		getWebBrowser().findAllWebRadioButtons(locator);
		getWebBrowser().findAllWebTables(locator);
		getWebBrowser().findAllWebTableRows(locator);
		getWebBrowser().findAllWebTextFields(locator);
		return new GenericWebStackPanel();
	}

	@Override
	public AbstractWebSuggestBoxInterface createWebSuggestBox(Locator locator) {
		System.out.println("GenericGuiCompositeWebFactory|createWebSuggestBox: " + locator);
		// -----------------------------------------------
		getWebBrowser().findWebButton(locator);
		getWebBrowser().findWebCheckBox(locator);
		getWebBrowser().findWebElement(locator);
		getWebBrowser().findWebLink(locator);
		getWebBrowser().findWebList(locator);
		getWebBrowser().findWebListBox(locator);
		getWebBrowser().findWebRadioButton(locator);
		getWebBrowser().findWebTable(locator);
		getWebBrowser().findWebTableRow(locator);
		getWebBrowser().findWebTextField(locator);
		// -----------------------------------------------
		getWebBrowser().findAllWebElements(locator);
		getWebBrowser().findAllWebButtons(locator);
		getWebBrowser().findAllWebCheckBoxes(locator);
		getWebBrowser().findAllWebLinks(locator);
		getWebBrowser().findAllWebLists(locator);
		getWebBrowser().findAllWebListBoxes(locator);
		getWebBrowser().findAllWebRadioButtons(locator);
		getWebBrowser().findAllWebTables(locator);
		getWebBrowser().findAllWebTableRows(locator);
		getWebBrowser().findAllWebTextFields(locator);
		return new GenericWebSuggestBox();
	}

}
