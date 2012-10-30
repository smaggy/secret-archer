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
		getBrowser().findWebButton(locator);
		getBrowser().findWebCheckBox(locator);
		getBrowser().findWebElement(locator);
		getBrowser().findWebLink(locator);
		getBrowser().findWebList(locator);
		getBrowser().findWebListBox(locator);
		getBrowser().findWebRadioButton(locator);
		getBrowser().findWebTable(locator);
		getBrowser().findWebTableRow(locator);
		getBrowser().findWebTextField(locator);
		// -----------------------------------------------
		getBrowser().findAllWebElements(locator);
		getBrowser().findAllWebButtons(locator);
		getBrowser().findAllWebCheckBoxes(locator);
		getBrowser().findAllWebLinks(locator);
		getBrowser().findAllWebLists(locator);
		getBrowser().findAllWebListBoxes(locator);
		getBrowser().findAllWebRadioButtons(locator);
		getBrowser().findAllWebTables(locator);
		getBrowser().findAllWebTableRows(locator);
		getBrowser().findAllWebTextFields(locator);
		return new GenericWebCalendar();
	}

	@Override
	public AbstractWebStackPanelInterface createWebStackPanel(Locator locator) {
		System.out.println("GenericGuiCompositeWebFactory|createWebStackPanel: " + locator);
		// -----------------------------------------------
		getBrowser().findWebButton(locator);
		getBrowser().findWebCheckBox(locator);
		getBrowser().findWebElement(locator);
		getBrowser().findWebLink(locator);
		getBrowser().findWebList(locator);
		getBrowser().findWebListBox(locator);
		getBrowser().findWebRadioButton(locator);
		getBrowser().findWebTable(locator);
		getBrowser().findWebTableRow(locator);
		getBrowser().findWebTextField(locator);
		// -----------------------------------------------
		getBrowser().findAllWebElements(locator);
		getBrowser().findAllWebButtons(locator);
		getBrowser().findAllWebCheckBoxes(locator);
		getBrowser().findAllWebLinks(locator);
		getBrowser().findAllWebLists(locator);
		getBrowser().findAllWebListBoxes(locator);
		getBrowser().findAllWebRadioButtons(locator);
		getBrowser().findAllWebTables(locator);
		getBrowser().findAllWebTableRows(locator);
		getBrowser().findAllWebTextFields(locator);
		return new GenericWebStackPanel();
	}

	@Override
	public AbstractWebSuggestBoxInterface createWebSuggestBox(Locator locator) {
		System.out.println("GenericGuiCompositeWebFactory|createWebSuggestBox: " + locator);
		// -----------------------------------------------
		getBrowser().findWebButton(locator);
		getBrowser().findWebCheckBox(locator);
		getBrowser().findWebElement(locator);
		getBrowser().findWebLink(locator);
		getBrowser().findWebList(locator);
		getBrowser().findWebListBox(locator);
		getBrowser().findWebRadioButton(locator);
		getBrowser().findWebTable(locator);
		getBrowser().findWebTableRow(locator);
		getBrowser().findWebTextField(locator);
		// -----------------------------------------------
		getBrowser().findAllWebElements(locator);
		getBrowser().findAllWebButtons(locator);
		getBrowser().findAllWebCheckBoxes(locator);
		getBrowser().findAllWebLinks(locator);
		getBrowser().findAllWebLists(locator);
		getBrowser().findAllWebListBoxes(locator);
		getBrowser().findAllWebRadioButtons(locator);
		getBrowser().findAllWebTables(locator);
		getBrowser().findAllWebTableRows(locator);
		getBrowser().findAllWebTextFields(locator);
		return new GenericWebSuggestBox();
	}

}
