package com.company.common.type.web.silktest;

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

public class SilktestGuiWebFactory extends AbstractGuiWebFactory implements AbstractGuiWebFactoryInterface, BrowseableInterface {
	
	public SilktestGuiWebFactory(AbstractWebBrowserInterface webBrowser) {
		super(webBrowser);
	}

	@Override
	public AbstractWebButtonInterface createWebButton(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebButton: [" + locator + "]");
		return getWebBrowser().findWebButton(locator);
	}

	@Override
	public AbstractWebCheckBoxInterface createWebCheckBox(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebCheckBox: [" + locator + "]");
		return getWebBrowser().findWebCheckBox(locator);
	}

	@Override
	public AbstractWebElementInterface createWebElement(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebElement: [" + locator + "]");
		return getWebBrowser().findWebElement(locator);
	}

	@Override
	public AbstractWebLinkInterface createWebLink(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebLink: [" + locator + "]");
		return getWebBrowser().findWebLink(locator);
	}

	@Override
	public AbstractWebListInterface createWebList(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebList: [" + locator + "]");
		return getWebBrowser().findWebList(locator);
	}

	@Override
	public AbstractWebListBoxInterface createWebListBox(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebListBox: [" + locator + "]");
		return getWebBrowser().findWebListBox(locator);
	}

	@Override
	public AbstractWebRadioButtonInterface createWebRadioButton(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebRadioButton: [" + locator + "]");
		return getWebBrowser().findWebRadioButton(locator);
	}

	@Override
	public AbstractWebTableInterface createWebTable(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebTable: [" + locator + "]");
		return getWebBrowser().findWebTable(locator);
	}

	@Override
	public AbstractWebTableRowInterface createWebTableRow(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebTableRow: [" + locator + "]");
		return getWebBrowser().findWebTableRow(locator);
	}

	@Override
	public AbstractWebTextFieldInterface createWebTextField(Locator locator) {
		System.out.println("SilktestGuiWebFactory|createWebTextField: [" + locator + "]");
		return getWebBrowser().findWebTextField(locator);
	}

}
