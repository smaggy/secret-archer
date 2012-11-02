package com.company.application2.type.web.silktest;

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
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractWebButtonInterface createWebButton(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebCheckBoxInterface createWebCheckBox(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebElementInterface createWebElement(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebLinkInterface createWebLink(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebListInterface createWebList(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebListBoxInterface createWebListBox(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebRadioButtonInterface createWebRadioButton(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebTableInterface createWebTable(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebTableRowInterface createWebTableRow(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebTextFieldInterface createWebTextField(Locator locator) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
