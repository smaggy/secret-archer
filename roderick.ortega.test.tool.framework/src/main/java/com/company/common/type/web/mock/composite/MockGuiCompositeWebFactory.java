package com.company.common.type.web.mock.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.BrowseableInterface;
import com.company.common.model.factory.AbstractGuiCompositeWebFactoryInterface;
import com.company.common.model.type.composite.AbstractWebCalendarInterface;
import com.company.common.model.type.composite.AbstractWebStackPanelInterface;
import com.company.common.model.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.type.web.abstracts.factory.AbstractGuiCompositeWebFactory;
import com.company.common.types.Locator;

public final class MockGuiCompositeWebFactory extends AbstractGuiCompositeWebFactory implements AbstractGuiCompositeWebFactoryInterface, BrowseableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockGuiCompositeWebFactory.class);
	
	@Override
	public AbstractWebCalendarInterface createWebCalendar(Locator locator) {
		logger.debug("MockGuiCompositeWebFactory|createWebCalendar: " + locator);
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
		return new MockWebCalendar();
	}

	@Override
	public AbstractWebStackPanelInterface createWebStackPanel(Locator locator) {
		logger.debug("MockGuiCompositeWebFactory|createWebStackPanel: " + locator);
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
		return new MockWebStackPanel();
	}

	@Override
	public AbstractWebSuggestBoxInterface createWebSuggestBox(Locator locator) {
		logger.debug("MockGuiCompositeWebFactory|createWebSuggestBox: " + locator);
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
		return new MockWebSuggestBox();
	}

}
