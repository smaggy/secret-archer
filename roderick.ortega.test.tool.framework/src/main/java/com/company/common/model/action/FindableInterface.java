package com.company.common.model.action;

import java.util.List;

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

public interface FindableInterface {
	public AbstractWebElementInterface findWebElement(Locator locator);
	public AbstractWebButtonInterface findWebButton(Locator locator);
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator);
	public AbstractWebLinkInterface findWebLink(Locator locator);
	public AbstractWebListInterface findWebList(Locator locator);
	public AbstractWebListBoxInterface findWebListBox(Locator locator);
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator);
	public AbstractWebTableInterface findWebTable(Locator locator);
	public AbstractWebTableRowInterface findWebTableRow(Locator locator);
	public AbstractWebTextFieldInterface findWebTextField(Locator locator);
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator);
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator);
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator);
	public List<AbstractWebListInterface> findAllWebLists(Locator locator);
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator);
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator);
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator);
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator);
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator);
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator);
}
