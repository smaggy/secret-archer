package com.company.common.interfaces.factory;

import com.company.common.interfaces.action.BrowseableInterface;
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
import com.company.common.types.Locator;

public interface AbstractGuiWebFactoryInterface extends BrowseableInterface {
	public AbstractWebButtonInterface createWebButton(Locator locator);
	public AbstractWebCheckBoxInterface createWebCheckBox(Locator locator);
	public AbstractWebElementInterface createWebElement(Locator locator);
	public AbstractWebLinkInterface createWebLink(Locator locator);
	public AbstractWebListInterface createWebList(Locator locator);
	public AbstractWebListBoxInterface createWebListBox(Locator locator);
	public AbstractWebRadioButtonInterface createWebRadioButton(Locator locator);
	public AbstractWebTableInterface createWebTable(Locator locator);
	public AbstractWebTableRowInterface createWebTableRow(Locator locator);
	public AbstractWebTextFieldInterface createWebTextField(Locator locator);
}
