package com.company.common.type.web.selenium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebLinkInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.interfaces.type.AbstractWebRadioButtonInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;
import com.company.common.type.web.abstracts.factory.AbstractGuiWebFactory;
import com.company.common.types.Locator;

public final class SeleniumGuiWebFactory extends AbstractGuiWebFactory implements AbstractGuiWebFactoryInterface, BrowseableInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumGuiWebFactory.class);
	
	public SeleniumGuiWebFactory(AbstractWebBrowserInterface webBrowser) {
		super(webBrowser);
	}

	@Override
	public AbstractWebButtonInterface createWebButton(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebButton: " + locator);
		return getWebBrowser().findWebButton(locator);
	}

	@Override
	public AbstractWebCheckBoxInterface createWebCheckBox(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebCheckBox: " + locator);
		return getWebBrowser().findWebCheckBox(locator);
	}

	@Override
	public AbstractWebElementInterface createWebElement(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebElement: " + locator);
		return getWebBrowser().findWebElement(locator);
	}

	@Override
	public AbstractWebLinkInterface createWebLink(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebLink: " + locator);
		return getWebBrowser().findWebLink(locator);
	}

	@Override
	public AbstractWebListInterface createWebList(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebList: " + locator);
		return getWebBrowser().findWebList(locator);
	}

	@Override
	public AbstractWebListBoxInterface createWebListBox(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebListBox: " + locator);
		return getWebBrowser().findWebListBox(locator);
	}

	@Override
	public AbstractWebRadioButtonInterface createWebRadioButton(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebRadioButton: " + locator);
		return getWebBrowser().findWebRadioButton(locator);
	}

	@Override
	public AbstractWebTableInterface createWebTable(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebTable: " + locator);
		return getWebBrowser().findWebTable(locator);
	}

	@Override
	public AbstractWebTableRowInterface createWebTableRow(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebTableRow: " + locator);
		return getWebBrowser().findWebTableRow(locator);
	}

	@Override
	public AbstractWebTextFieldInterface createWebTextField(Locator locator) {
		logger.debug("SeleniumGuiWebFactory|createWebTextField: " + locator);
		return getWebBrowser().findWebTextField(locator);
	}
}
