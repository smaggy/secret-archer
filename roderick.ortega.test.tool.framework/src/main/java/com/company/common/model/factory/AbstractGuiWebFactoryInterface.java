package com.company.common.model.factory;

import com.company.common.model.action.BrowseableInterface;
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
