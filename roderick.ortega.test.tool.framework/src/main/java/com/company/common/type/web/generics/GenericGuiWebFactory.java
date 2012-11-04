package com.company.common.type.web.generics;

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

public class GenericGuiWebFactory extends AbstractGuiWebFactory implements AbstractGuiWebFactoryInterface, BrowseableInterface {
	
	public GenericGuiWebFactory(AbstractWebBrowserInterface webBrowser) {
		super(webBrowser);
	}

	@Override
	public AbstractWebButtonInterface createWebButton(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebButton: " + locator);
		AbstractWebButtonInterface wbi = getWebBrowser().findWebButton(locator);
		return wbi;
	}

	@Override
	public AbstractWebCheckBoxInterface createWebCheckBox(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebCheckBox: " + locator);
		AbstractWebCheckBoxInterface cb = getWebBrowser().findWebCheckBox(locator);
		return cb;
	}

	@Override
	public AbstractWebElementInterface createWebElement(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebElement: " + locator);
		AbstractWebElementInterface e = getWebBrowser().findWebElement(locator);
		return e;
	}

	@Override
	public AbstractWebLinkInterface createWebLink(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebLink: " + locator);
		AbstractWebLinkInterface l = getWebBrowser().findWebLink(locator);
		return l;
	}

	@Override
	public AbstractWebListInterface createWebList(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebList: " + locator);
		AbstractWebListInterface wl = getWebBrowser().findWebList(locator);
		return wl;
	}

	@Override
	public AbstractWebListBoxInterface createWebListBox(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebListBox: " + locator);
		AbstractWebListBoxInterface wlb = getWebBrowser().findWebListBox(locator);
		return wlb;
	}

	@Override
	public AbstractWebRadioButtonInterface createWebRadioButton(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebRadioButton: " + locator);
		AbstractWebRadioButtonInterface rb = getWebBrowser().findWebRadioButton(locator);
		return rb;
	}

	@Override
	public AbstractWebTableInterface createWebTable(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebTable: " + locator);
		AbstractWebTableInterface t = getWebBrowser().findWebTable(locator);
		return t;
	}

	@Override
	public AbstractWebTableRowInterface createWebTableRow(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebTableRow: " + locator);
		AbstractWebTableRowInterface tr = getWebBrowser().findWebTableRow(locator);
		return tr;
	}

	@Override
	public AbstractWebTextFieldInterface createWebTextField(Locator locator) {
		System.out.println("GenericGuiWebFactory|createWebTextField: " + locator);
		AbstractWebTextFieldInterface tf = getWebBrowser().findWebTextField(locator);
		return tf;
	}
}
