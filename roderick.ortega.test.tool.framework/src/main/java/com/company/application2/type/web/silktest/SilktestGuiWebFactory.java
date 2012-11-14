package com.company.application2.type.web.silktest;

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
