package com.company.common.type.web.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.BrowseableInterface;
import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.model.type.AbstractWebButtonInterface;
import com.company.common.model.type.AbstractWebCheckBoxInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.AbstractWebLinkInterface;
import com.company.common.model.type.AbstractWebListBoxInterface;
import com.company.common.model.type.AbstractWebListInterface;
import com.company.common.model.type.AbstractWebRadioButtonInterface;
import com.company.common.model.type.AbstractWebTableInterface;
import com.company.common.model.type.AbstractWebTableRowInterface;
import com.company.common.model.type.AbstractWebTextFieldInterface;
import com.company.common.type.web.abstracts.factory.AbstractGuiWebFactory;
import com.company.common.types.Locator;

public final class MockGuiWebFactory extends AbstractGuiWebFactory implements AbstractGuiWebFactoryInterface, BrowseableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(MockGuiWebFactory.class);
	
	public MockGuiWebFactory(AbstractWebBrowserInterface webBrowser) {
		super(webBrowser);
	}

	@Override
	public AbstractWebButtonInterface createWebButton(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebButton: " + locator);
		AbstractWebButtonInterface wbi = getWebBrowser().findWebButton(locator);
		return wbi;
	}

	@Override
	public AbstractWebCheckBoxInterface createWebCheckBox(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebCheckBox: " + locator);
		AbstractWebCheckBoxInterface cb = getWebBrowser().findWebCheckBox(locator);
		return cb;
	}

	@Override
	public AbstractWebElementInterface createWebElement(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebElement: " + locator);
		AbstractWebElementInterface e = getWebBrowser().findWebElement(locator);
		return e;
	}

	@Override
	public AbstractWebLinkInterface createWebLink(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebLink: " + locator);
		AbstractWebLinkInterface l = getWebBrowser().findWebLink(locator);
		return l;
	}

	@Override
	public AbstractWebListInterface createWebList(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebList: " + locator);
		AbstractWebListInterface wl = getWebBrowser().findWebList(locator);
		return wl;
	}

	@Override
	public AbstractWebListBoxInterface createWebListBox(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebListBox: " + locator);
		AbstractWebListBoxInterface wlb = getWebBrowser().findWebListBox(locator);
		return wlb;
	}

	@Override
	public AbstractWebRadioButtonInterface createWebRadioButton(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebRadioButton: " + locator);
		AbstractWebRadioButtonInterface rb = getWebBrowser().findWebRadioButton(locator);
		return rb;
	}

	@Override
	public AbstractWebTableInterface createWebTable(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebTable: " + locator);
		AbstractWebTableInterface t = getWebBrowser().findWebTable(locator);
		return t;
	}

	@Override
	public AbstractWebTableRowInterface createWebTableRow(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebTableRow: " + locator);
		AbstractWebTableRowInterface tr = getWebBrowser().findWebTableRow(locator);
		return tr;
	}

	@Override
	public AbstractWebTextFieldInterface createWebTextField(Locator locator) {
		logger.debug("MockGuiWebFactory|createWebTextField: " + locator);
		AbstractWebTextFieldInterface tf = getWebBrowser().findWebTextField(locator);
		return tf;
	}
}
